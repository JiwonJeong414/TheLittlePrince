package Exoplanets;

public class GasGiant extends AbstractPlanet {
    private double hydrogenHeliumRatio;  // Ratio of hydrogen to helium in the atmosphere

    public GasGiant(String name, double mass, double radius, double orbitalPeriod,
                    double hydrogenHeliumRatio) {
        super(name, mass, radius, orbitalPeriod);
        this.hydrogenHeliumRatio = hydrogenHeliumRatio;
    }

    @Override
    public String getPlanetType() {
        return "Gas Giant";
    }

    @Override
    public String getSpecialCharacteristics() {
        return "H/He Ratio: " + hydrogenHeliumRatio;
    }
}

