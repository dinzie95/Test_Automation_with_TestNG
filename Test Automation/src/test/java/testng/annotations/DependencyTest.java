package testng.annotations;

import org.testng.annotations.Test;

public class DependencyTest {
    

    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test(priority=0, dependsOnMethods = {"testLogin"})
    public void testCreate() {
        System.out.println("Create");
    }

    @Test(dependsOnMethods = {"testLogin","testCreate"})
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test(dependsOnMethods = {"testEdit"})
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test
    public void testLogout() {
        System.out.println("Logout");
    }

}
