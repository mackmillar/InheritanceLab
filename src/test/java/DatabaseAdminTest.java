import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Steve", "HY645327D", 21000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Steve", databaseAdmin.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("HY645327D", databaseAdmin.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(21000.00, databaseAdmin.getSalary(), 0.001);
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(22000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(210, databaseAdmin.payBonus(), 0.001);
    }
}
