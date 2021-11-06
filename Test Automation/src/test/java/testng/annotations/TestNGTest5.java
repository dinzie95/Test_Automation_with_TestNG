package testng.annotations;

import com.sun.deploy.panel.DeleteFilesDialog;
import org.testng.annotations.Test;
import sun.font.CreatedFontTracker;

public class TestNGTest5 {

    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test
    public void testCreate() {
        System.out.println("Create");
    }

    @Test
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test
    public void testLogout() {
        System.out.println("Logout");
    }

    //Executes in alphabetical order of method names
//    Create
//    Edit
//    Delete
//    Login
//    Logout
}
