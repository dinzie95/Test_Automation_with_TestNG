package groups;

import org.testng.annotations.Test;

public class GroupsTest1 {
    @Test(groups = {"smoke","reg"})
    public void testGT1_1() {
        System.out.println("GT1_1");
    }

    @Test(groups = {"reg"})
    public void testGT1_2() {
        System.out.println("GT1_2");
    }

    @Test
    public void testGT1_3() {
        System.out.println("GT1_3");
    }

    @Test(groups = {"smoke"})
    public void testGT1_4() {
        System.out.println("GT1_4");
    }
}
