import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Developer");
    }
    @Test
    public void hasName() {
        assertEquals("John", databaseAdmin.getName());
    }
    @Test
    public void hasNI() {
        assertEquals("PY12345", databaseAdmin.getNiNumber());
    }
    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(26000, databaseAdmin.raiseSalary(1000.50), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(250, databaseAdmin.payBonus(25000), 0.01);
    }
}
