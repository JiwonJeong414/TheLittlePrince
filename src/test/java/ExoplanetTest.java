import Exoplanets.GasGiant;
import NASA.APIFetch;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

public class ExoplanetTest {
    @Test
    public void testPlanetName() throws Exception {
        APIFetch apiFetch = new APIFetch();
        JsonNode node = apiFetch.getExoplanetData("HD 332231 b");

        System.out.println(node);
        System.out.println("Exoplanet Name: " + node.get(0).get("pl_name").asText()); // since there are multiple planet data, get the one thats not null
        System.out.println("Orbital Period: " + node.get(0).get("pl_orbper").asText());
        System.out.println("Mass: " + node.get(0).get("pl_bmasse").asText());

        String name = node.get(0).get("pl_name").asText();
        double radius = node.get(0).get("pl_rade").asDouble();  // Planet radius in Earth radii
        double mass = node.get(0).get("pl_massj").asDouble() * 318;  // Convert Jupiter mass to Earth mass
        double orbitalPeriod = node.get(0).get("pl_orbper").asDouble();
        double density = node.get(0).get("pl_dens").asDouble();  // Density in g/cm³

        String planetType;

        if (radius < 2 && density > 5) {
            planetType = "Terrestrial Planet";
        } else if (radius >= 2 && radius <= 6 && mass >= 10 && mass <= 30 && density >= 1 && density <= 3) {
            planetType = "Ice Giant";
        } else if (radius > 6 && mass > 30 && density < 1) {
            planetType = "Gas Giant";
            GasGiant gasGiant = new GasGiant(name, mass, radius, orbitalPeriod, 0);
        } else {
            planetType = "Unknown/Other";
        }

        System.out.println("Planet Type: " + planetType);

    }
}
