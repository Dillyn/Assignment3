package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailTest {

    Fail fail;

    @Test

    public void fail() {
    fail = new Fail();

        //Assert.assertEquals("This test is a pass", fail.fail());
        Assert.fail("This test will fail");

    }
}