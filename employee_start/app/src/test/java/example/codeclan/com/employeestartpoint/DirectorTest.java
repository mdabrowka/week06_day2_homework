package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by marta on 31/10/2017.
 */

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director(1, "Mags", "AB123456C", 30000.00, "Human Resources", 200000.00);
    }

    @Test
    public void canGetBudget() {
        assertEquals(200000.00, director.getBudget(), 0.01);
    }
}
