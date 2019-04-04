package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectEqualityTest {

    ObjectEquality a = ObjectEquality.getInstance();
    ObjectEquality b = ObjectEquality.getInstance();

    @Test
    public void getInstance() {

//shows equality and Identity

        Assert.assertEquals(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}