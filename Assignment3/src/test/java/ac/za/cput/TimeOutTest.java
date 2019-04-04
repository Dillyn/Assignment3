package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeOutTest {


    @Test(timeout = 100) // Exception: test timed out after 100 milliseconds
    public void test1() throws Exception {
        Thread.sleep(200);

    }
}