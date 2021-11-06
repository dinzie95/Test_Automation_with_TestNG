package groups;

import org.testng.annotations.Test;

public class GroupsTest3 {
    @Test(groups = {"smoke","reg"})
    public void testGT3_1() {
        System.out.println("GT3_1");
    }

    @Test
    public void testGT3_2() {
        System.out.println("GT3_2");
    }

    @Test(groups = {"reg"})
    public void testGT3_3() {
        System.out.println("GT3_3");
    }

    @Test(groups = {"reg"})
    public void testGT3_4() {
        System.out.println("GT3_4");
    }

    @Test(groups = {"smoke"})
    public void testGT3_5() {
        System.out.println("GT3_5");
    }
}
