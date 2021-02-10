import org.junit.Before;
import org.junit.Test;

import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mark", "HY645327D", 20000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Mark", developer.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("HY645327D", developer.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000.00, developer.getSalary(), 0.001);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(21000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, developer.payBonus(), 0.001);
    }
}
