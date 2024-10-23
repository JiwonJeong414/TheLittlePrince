package Exoplanets;

public class GasGiant extends AbstractPlanet {
    private double hydrogenHeliumRatio;  // Ratio of hydrogen to helium in the atmosphere
    private int numberOfMoons;

    public GasGiant(String name, double mass, double radius, double orbitalPeriod,
                    double hydrogenHeliumRatio, int numberOfMoons) {
        super(name, mass, radius, orbitalPeriod);
        this.hydrogenHeliumRatio = hydrogenHeliumRatio;
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public String getPlanetType() {
        return "Gas Giant";
    }

    @Override
    public String getSpecialCharacteristics() {
        return "H/He Ratio: " + hydrogenHeliumRatio + ", Moons: " + numberOfMoons;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }
}

