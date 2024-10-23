package Exoplanets;

// Abstract class for planets
abstract class AbstractPlanet implements CelestialObject {
    private String name;
    private double mass;  // in Earth Masses
    private double radius;  // in Earth Radii
    private double orbitalPeriod;  // in days

    public AbstractPlanet(String name, double mass, double radius, double orbitalPeriod) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.orbitalPeriod = orbitalPeriod;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getPlanetType();

    // Optionally, an abstract method for special characteristics
    public abstract String getSpecialCharacteristics();
}
