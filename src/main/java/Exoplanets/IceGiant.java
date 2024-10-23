package Exoplanets;

public class IceGiant extends AbstractPlanet {
    private double methaneContent;  // Percentage of methane in the atmosphere
    private boolean hasRings;

    public IceGiant(String name, double mass, double radius, double orbitalPeriod,
                    double methaneContent, boolean hasRings) {
        super(name, mass, radius, orbitalPeriod);
        this.methaneContent = methaneContent;
        this.hasRings = hasRings;
    }

    @Override
    public String getPlanetType() {
        return "Ice Giant";
    }

    @Override
    public String getSpecialCharacteristics() {
        return "Methane Content: " + methaneContent + "%, Has Rings: " + hasRings;
    }
}
