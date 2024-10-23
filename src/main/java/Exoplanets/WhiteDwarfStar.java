package Exoplanets;

public class WhiteDwarfStar  extends HostStar {
    public WhiteDwarfStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "White Dwarf";
    }
}
