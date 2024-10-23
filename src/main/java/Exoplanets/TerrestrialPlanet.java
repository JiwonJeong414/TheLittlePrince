package Exoplanets;

public class TerrestrialPlanet extends AbstractPlanet {
    private boolean hasAtmosphere;
    private double surfaceGravity;  // in m/s^2

    public TerrestrialPlanet(String name, double mass, double radius, double orbitalPeriod,
                             boolean hasAtmosphere, double surfaceGravity) {
        super(name, mass, radius, orbitalPeriod);
        this.hasAtmosphere = hasAtmosphere;
        this.surfaceGravity = surfaceGravity;
    }

    @Override
    public String getPlanetType() {
        return "Terrestrial";
    }

    @Override
    public String getSpecialCharacteristics() {
        return "Surface Gravity: " + surfaceGravity + " m/s^2, Has Atmosphere: " + hasAtmosphere;
    }
}
