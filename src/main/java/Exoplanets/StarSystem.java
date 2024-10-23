package Exoplanets;

import java.util.List;

// Abstract class for all star systems
abstract class StarSystem implements CelestialObject {
    private String name;

    public StarSystem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getNumberOfStars();
    public abstract List<HostStar> getStars();
}

