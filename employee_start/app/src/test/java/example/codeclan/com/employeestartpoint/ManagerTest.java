package example.codeclan.com.employeestartpoint;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by marta on 31/10/2017.
 */

public class ManagerTest {
    Manager manager;


    @Before
    public void before() {
       manager = new Manager(1, "Mags", "AB123456C", 30000.00, "Human Resources");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Human Resources", manager.getDeptName());
    }

}