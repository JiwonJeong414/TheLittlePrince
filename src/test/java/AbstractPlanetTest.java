import static org.junit.jupiter.api.Assertions.*;

import Exoplanets.GasGiant;
import Exoplanets.IceGiant;
import Exoplanets.TerrestrialPlanet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AbstractPlanetTest {

    private TerrestrialPlanet earth;
    private GasGiant jupiter;
    private IceGiant neptune;

    @BeforeEach
    public void setUp() {
        // Initialize the planet objects before each test
        earth = new TerrestrialPlanet("Earth", 1.0, 1.0, 365.25, true, 9.81);
        jupiter = new GasGiant("Jupiter", 317.8, 11.2, 4332.6, 0.89, 79);
        neptune = new IceGiant("Neptune", 17.1, 3.9, 60190, 2.0, true);
    }

    @Test
    public void testPlanetName() {
        assertEquals("Earth", earth.getName());
        assertEquals("Jupiter", jupiter.getName());
        assertEquals("Neptune", neptune.getName());
    }

    @Test
    public void testPlanetMass() {
        assertEquals(1.0, earth.getMass(), 0.001);
        assertEquals(317.8, jupiter.getMass(), 0.001);
        assertEquals(17.1, neptune.getMass(), 0.001);
    }

    @Test
    public void testPlanetRadius() {
        assertEquals(1.0, earth.getRadius(), 0.001);
        assertEquals(11.2, jupiter.getRadius(), 0.001);
        assertEquals(3.9, neptune.getRadius(), 0.001);
    }

    @Test
    public void testOrbitalPeriod() {
        assertEquals(365.25, earth.getOrbitalPeriod(), 0.01);
        assertEquals(4332.6, jupiter.getOrbitalPeriod(), 0.01);
        assertEquals(60190, neptune.getOrbitalPeriod(), 0.01);
    }

    @Test
    public void testPlanetType() {
        assertEquals("Terrestrial", earth.getPlanetType());
        assertEquals("Gas Giant", jupiter.getPlanetType());
        assertEquals("Ice Giant", neptune.getPlanetType());
    }

    @Test
    public void testSpecialCharacteristics() {
        // Test terrestrial characteristics
        assertEquals("Surface Gravity: 9.81 m/s^2, Has Atmosphere: true", earth.getSpecialCharacteristics());

        // Test gas giant characteristics
        assertEquals("H/He Ratio: 0.89, Moons: 79", jupiter.getSpecialCharacteristics());

        // Test ice giant characteristics
        assertEquals("Methane Content: 2.0%, Has Rings: true", neptune.getSpecialCharacteristics());
    }

    @Test
    public void testGetNumberOfMoonsForGasGiant() {
        assertEquals(79, jupiter.getNumberOfMoons());
    }

}
