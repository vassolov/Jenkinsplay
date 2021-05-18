import job.Job1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Job1Test {
    Job1 j1 = new Job1();

    @Test
    public void mytest() {
         assertEquals(25, j1.task1());
    }
    @Test
    public void mytestStr() {
        assertEquals("OK!", j1.task2());
    }
    @Test
    public void mytestStrMaster() {
        assertEquals("master", j1.task3m());
    }
    @Test
    public void mytestStrfail() {
        assertEquals("branch-1", j1.task3_1());
    }

}