import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloorlessCoasterTest {

    FloorlessCoaster floorlessCoaster;

    @Before
    public void before() {
        floorlessCoaster = new FloorlessCoaster("Medusa",20.00,14, 1.50);
    }

    @Test
    public void hasName() {
        assertEquals("Medusa", floorlessCoaster.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(20.00, floorlessCoaster.getPrice(), 0.01);
    }

    @Test
    public void hasMinAge() {
        assertEquals(14, floorlessCoaster.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1.50, floorlessCoaster.getMinHeight(),0.01);
    }
}
