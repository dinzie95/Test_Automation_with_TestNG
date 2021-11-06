package testng.annotations;

import org.testng.annotations.*;

public class TestNGTest4 {

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

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

}
