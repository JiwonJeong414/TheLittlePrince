package Exoplanets;

// Abstract class for Host Stars
abstract class HostStar implements CelestialObject {
    private String name;
    private double mass;
    private double radius;
    private double temperature;

    public HostStar(String name, double mass, double radius, double temperature) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.temperature = temperature;
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

    public double getTemperature() {
        return temperature;
    }

    // Abstract method to define star type
    public abstract String getStarType();
}