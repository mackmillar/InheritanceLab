import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Joe", "HY645327D", 25000.00, "HR");
    }

    @Test
    public void hasName(){
        assertEquals("Joe", manager.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("HY645327D", manager.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

}
