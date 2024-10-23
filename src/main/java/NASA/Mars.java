package NASA;

public class Mars {
    private String name;
    private double diameter;
    private double mass;
    private double gravity;
    private double orbitalPeriod;
    private double axialTilt;
    private double surfaceTemperature;
    private double escapeVelocity;
    private boolean hasAtmosphere;
    private boolean hasWaterIce;
    private int zibHDigitalNumber;

    public Mars() {}

    public Mars(String name, double diameter, double mass, double gravity, double orbitalPeriod,
                double axialTilt, double surfaceTemperature, double escapeVelocity,
                boolean hasAtmosphere, boolean hasWaterIce, int zibHDigitalNumber) {
        this.name = name;
        this.diameter = diameter;
        this.mass = mass;
        this.gravity = gravity;
        this.orbitalPeriod = orbitalPeriod;
        this.axialTilt = axialTilt;
        this.surfaceTemperature = surfaceTemperature;
        this.escapeVelocity = escapeVelocity;
        this.hasAtmosphere = hasAtmosphere;
        this.hasWaterIce = hasWaterIce;
        this.zibHDigitalNumber = zibHDigitalNumber;
    }

    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getMass() {
        return mass;
    }

    public double getGravity() {
        return gravity;
    }

    public int getZibHDigitalNumber() {
        return zibHDigitalNumber;
    }
}
