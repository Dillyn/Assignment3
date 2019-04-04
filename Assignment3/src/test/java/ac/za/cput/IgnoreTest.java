package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class IgnoreTest {
//had to import ignore withing the class, because the program confused my Ignore class with the default Ignore Class(@Ignore)
    @org.junit.Ignore
    @Test
    public void hello(){
        Ignore a = new Ignore();

        Assert.assertEquals("This test is disabled", a.hello());

    }

}