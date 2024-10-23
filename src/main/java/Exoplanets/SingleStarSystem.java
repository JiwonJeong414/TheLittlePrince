package Exoplanets;

import java.util.List;

// Concrete class for a Single-Star System
class SingleStarSystem extends StarSystem {
    private HostStar star;

    public SingleStarSystem(String name, HostStar star) {
        super(name);
        this.star = star;
    }

    @Override
    public int getNumberOfStars() {
        return 1;
    }

    @Override
    public List<HostStar> getStars() {
        return List.of(star);
    }

    @Override
    public double getMass() {
        return 0;
    }

    @Override
    public double getRadius() {
        return 0;
    }
}