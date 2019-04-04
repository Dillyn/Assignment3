package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class Module2Test {



    @Test
    public void runTest(){
        Mod2 add = new Mod2();

        Assert.assertEquals(7, add.add(4,3));



    }
}
