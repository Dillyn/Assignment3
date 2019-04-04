package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void multiply() {
        Multiply multiply = new Multiply();

        Assert.assertEquals(100, multiply.multiply(10,10));
    }
}