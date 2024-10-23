package Exoplanets;

public class RedGiantStar  extends HostStar {
    public RedGiantStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "RedGiant";
    }
}
