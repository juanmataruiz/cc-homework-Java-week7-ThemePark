import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Customer customer1;

    @Before
    public void before() {
        customer = new Customer(34, 1.75,50.00);
        customer1 = new Customer(13,1.45,10.00);
    }

    @Test
    public void hasAge() {
        assertEquals(34, customer.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.45, customer1.getHeight(), 0.01);
    }

    @Test
    public void hasMoney() {
        assertEquals(50.00, customer.getMoney(), 0.01);
    }
}
