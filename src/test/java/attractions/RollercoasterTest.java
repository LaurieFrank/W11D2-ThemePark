package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 1.2, 40.0);
        visitor1 = new Visitor(14, 2.2, 40.0);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollerCoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void defaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0);
    }

    @Test
    public void priceForVisitorsBySize(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0);
    }
}
