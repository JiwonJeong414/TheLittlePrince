package Exoplanets;

public class BrownDwarfStar  extends HostStar {
    public BrownDwarfStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "Brown Dwarf";
    }
}
