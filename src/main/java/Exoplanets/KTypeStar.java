package Exoplanets;

// Concrete class for K-Type Star
class KTypeStar extends HostStar {
    public KTypeStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "K-Type";
    }
}