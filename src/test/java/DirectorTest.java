import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director(10000000.00);
    }

    @Test
    public void hasBudget() {
        assertEquals(10000000.00, director.getBudget());
    }
}
