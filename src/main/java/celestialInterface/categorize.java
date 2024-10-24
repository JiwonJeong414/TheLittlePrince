package celestialInterface;

import Exoplanets.AbstractPlanet;
import Exoplanets.GasGiant;
import Exoplanets.IceGiant;
import Exoplanets.TerrestrialPlanet;
import NASA.APIFetch;
import com.fasterxml.jackson.databind.JsonNode;
import util.maybe.Maybe;
import util.maybe.NoMaybeValue;

public class categorize {
    public static void main(String[] args) throws Exception {
        APIFetch apiFetch = new APIFetch();
        JsonNode node = apiFetch.getExoplanetData("HD 332231 b");
        ExoplanetTaxonomy(node);
    }

    public static AbstractPlanet ExoplanetTaxonomy(JsonNode node) throws NoMaybeValue {
        Maybe<String> name = Maybe.none();
        Maybe<Double> radius = Maybe.none();
        Maybe<Double> mass = Maybe.none();
        Maybe<Double> orbitalPeriod = Maybe.none();
        Maybe<Double> density = Maybe.none();

        for (int i = 0; i < node.size(); i++) {
            if (node.get(i).hasNonNull("pl_name")) {
                name = Maybe.some(node.get(i).get("pl_name").asText());
            }
            if (node.get(i).hasNonNull("pl_rade")) {
                radius = Maybe.some(node.get(i).get("pl_rade").asDouble());
            }
            if (node.get(i).hasNonNull("pl_massj")) {
                mass = Maybe.some(node.get(i).get("pl_massj").asDouble() * 318);
            }
            if (node.get(i).hasNonNull("pl_orbper")) {
                orbitalPeriod = Maybe.some(node.get(i).get("pl_orbper").asDouble());
            }
            if (node.get(i).hasNonNull("pl_dens")) {
                density = Maybe.some(node.get(i).get("pl_dens").asDouble());
            }
        }


        AbstractPlanet planet;

        if (radius.get() < 2 && density.get() > 5) {
            planet = new TerrestrialPlanet(name.get(), mass.get(), radius.get(), orbitalPeriod.get(), true, 4.0);
        } else if (radius.get() >= 2 && radius.get() <= 6 && mass.get() >= 10 && mass.get() <= 30 && density.get() >= 1 && density.get() <= 3) {
            planet = new IceGiant(name.get(), mass.get(), radius.get(), orbitalPeriod.get());
        } else if (radius.get() > 6 && mass.get() > 30 && density.get() < 1) {
            planet = new GasGiant(name.get(), mass.get(), radius.get(), orbitalPeriod.get(), 0);
        } else {
            planet = null;
        }

        return planet;
    }
}
