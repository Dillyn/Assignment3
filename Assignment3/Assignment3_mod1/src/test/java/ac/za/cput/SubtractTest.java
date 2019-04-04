package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractTest {

    @Test
    public void subtract() {
        Subtract subtract = new Subtract();
        Assert.assertEquals(10,subtract.subtract(11,1));
    }
}