import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Developer");
    }
    @Test
    public void hasName() {
        assertEquals("John", developer.getName());
    }
    @Test
    public void hasNI() {
        assertEquals("PY12345", developer.getNiNumber());
    }
    @Test
    public void hasSalary() {
        assertEquals(25000, developer.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(26000, developer.raiseSalary(1000.50), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(250, developer.payBonus(25000), 0.01);
    }
}
