package Exoplanets;


import java.util.List;

// Concrete class for Binary-Star System
class BinaryStarSystem extends StarSystem {
    private HostStar starA;
    private HostStar starB;

    public BinaryStarSystem(String name, HostStar starA, HostStar starB) {
        super(name);
        this.starA = starA;
        this.starB = starB;
    }

    @Override
    public int getNumberOfStars() {
        return 2;
    }

    @Override
    public List<HostStar> getStars() {
        return List.of(starA, starB);
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

