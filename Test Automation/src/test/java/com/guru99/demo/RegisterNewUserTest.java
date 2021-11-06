package com.guru99.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterNewUserTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //pop up chrome web browser
        driver.get("http://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void testAddNewUser() {
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("Dinithi"); //sendKeys let you enter text input
        driver.findElement(By.name("lastName")).sendKeys("Amarasinghe");
        Select countryDropDown = new Select(driver.findElement(By.name("country")));
        countryDropDown.selectByVisibleText("AUSTRALIA");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countryDropDown.selectByValue("BAHRAIN");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countryDropDown.selectByIndex(5);
        driver.findElement(By.id("email")).sendKeys("dinithiamarasinghe");
        driver.findElement(By.name("password")).sendKeys("dinz123");
        driver.findElement(By.name("confirmPassword")).sendKeys("dinz123");
        driver.findElement(By.name("submit")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualMessage=driver.findElement(By.xpath("//*[contains(text(),'Dear')]")).getText();
        Assert.assertEquals(actualMessage,"Dear Dinithi Amarasinghe,","Failed to create New User");
    }
}


