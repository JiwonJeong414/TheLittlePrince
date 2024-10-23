package Exoplanets;


// Concrete class for a specific type of star (e.g., M-dwarf)
class MDwarfStar extends HostStar {
    public MDwarfStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "M-dwarf";
    }
}