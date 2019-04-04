package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTest {

    @Test
    public void divide() {
        Divide divide = new Divide();

        Assert.assertEquals(20,divide.divide(100,5));
    }
}