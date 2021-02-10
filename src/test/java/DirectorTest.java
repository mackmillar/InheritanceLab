import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bill", "SDJKHSJDH", 1000000000, "CEO", 500000);
    }

    @Test
    public void hasBudget(){
        assertEquals(500000, director.getBudget(), 0.001);
    }
}
