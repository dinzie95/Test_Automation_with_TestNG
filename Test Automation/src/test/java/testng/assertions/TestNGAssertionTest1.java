package testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest1 {

    @Test
    public void testAssertEquals() {
        String actualValue="University of Moratuwa";
        Assert.assertEquals(actualValue,"University Of Moratuwa");

        //Fails : expected> of, received >Of
    }
    @Test
    public void testAssertEquals1() {
        String actualValue="University of Moratuwa";
        Assert.assertEquals(actualValue,"University of Moratuwa");

        //pass
    }
    @Test
    public void testAssertNotEquals() {
        String actualValue="University of Moratuwa";
        Assert.assertNotEquals(actualValue,"University of Moratuwa");

        //fails
    }
    @Test
    public void testAssertTrue() {
        boolean actualResult=false;
        Assert.assertTrue(actualResult,"Failed : Boolean mismatched");

        //fail
    }

    @Test
    public void testAssertFalse() {
        boolean actualResult=false;
        Assert.assertFalse(actualResult,"Failed : Boolean mismatched");

        //pass
    }
}
