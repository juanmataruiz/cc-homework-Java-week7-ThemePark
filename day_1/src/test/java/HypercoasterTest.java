import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HypercoasterTest {
    
    Hypercoaster hypercoaster;
    
    @Before
    public void before() {
        hypercoaster = new Hypercoaster("Magnum XL-200",20.00,16, 1.55);
    }
    
    @Test
    public void hasName() {
        assertEquals("Magnum XL-200", hypercoaster.getName());
    }
    @Test
    public void hasPrice() {
        assertEquals(20.00, hypercoaster.getPrice(), 0.01);
    }

    @Test
    public void hasMinAge() {
        assertEquals(16, hypercoaster.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1.55, hypercoaster.getMinHeight(),0.01);
    }


}
