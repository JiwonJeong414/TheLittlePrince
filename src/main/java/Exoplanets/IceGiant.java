package Exoplanets;

public class IceGiant extends AbstractPlanet {

    public IceGiant(String name, double mass, double radius, double orbitalPeriod) {
        super(name, mass, radius, orbitalPeriod);
    }

    @Override
    public String getPlanetType() {
        return "Ice Giant";
    }

    @Override
    public String getSpecialCharacteristics() {
        return "";
    }

}
