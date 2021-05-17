import job.Job1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Job1Test {

    @Test
    public void mytest() {
        Job1 j1 = new Job1();
        assertEquals(25, j1.task1());
    }
    @Test
    public void mytestStr() {
        Job1 j1 = new Job1();
        assertEquals("OK!", j1.task2());
    }
    @Test
    public void mytestStrBranch1() {
        Job1 j1 = new Job1();
        assertEquals("branch 1", j1.task3());
    }
//    @Test
//    public void mytestStrBranch() {
//        Job1 j1 = new Job1();
//        assertEquals("branch", j1.task3());
//    }

}