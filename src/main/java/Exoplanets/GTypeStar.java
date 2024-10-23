package Exoplanets;

// Concrete class for G-Type Star
class GTypeStar extends HostStar {
    public GTypeStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "G-Type";
    }
}
