package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest1 {

    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After");
    }
}
