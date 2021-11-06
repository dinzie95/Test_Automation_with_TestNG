package simple.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArithmeticOperatorTest {
    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc =new ArithmeticOperator();
    }

    @Test(dataProvider = "getData")
    public void testSum(int input1,int input2, int expected) {
        Assert.assertEquals(calc.sum(100,180),280,"Failed to calculate sum");

        Assert.assertEquals(calc.sum(input1,input2),expected);
    }

    //A method to provide a set of data for testing
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {100,200,300},
                {-100,-200,-300},
                {-1,1,0},
                {0,-1,-1}
        };
    }
}
