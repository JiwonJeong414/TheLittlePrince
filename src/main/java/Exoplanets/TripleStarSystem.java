package Exoplanets;

import java.util.List;

// Concrete class for Triple-Star System
class TripleStarSystem extends StarSystem {
    private HostStar starA;
    private HostStar starB;
    private HostStar starC;

    public TripleStarSystem(String name, HostStar starA, HostStar starB, HostStar starC) {
        super(name);
        this.starA = starA;
        this.starB = starB;
        this.starC = starC;
    }

    @Override
    public int getNumberOfStars() {
        return 3;
    }

    @Override
    public List<HostStar> getStars() {
        return List.of(starA, starB, starC);
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