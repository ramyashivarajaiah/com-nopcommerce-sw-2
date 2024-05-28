package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    /**
     * 1. userShouldNavigateToRegisterPageSuccessful
     * ly
     * * click on the ‘Register’ link
     * * Verify the text ‘Register’
     */
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    /**
     * 2. userSholdRegisterAccountSuccessfully *
     * click on the ‘Register’ link
     * * Select gender radio button
     * * Enter First name
     * * Enter Last name
     * * Select Day Month and Year
     * * Enter Email address
     * * Enter Password
     * * Enter Confirm password
     * * Click on REGISTER button
     * * Verify the text 'Your registration
     * completed’
     */
    @Test
    public void userSholdRegisterAccountSuccessfully() {
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        driver.findElement(By.name("Gender")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Ed");
        driver.findElement(By.id("LastName")).sendKeys("Sam");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("7");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("1");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");
        driver.findElement(By.id("Email")).sendKeys("ramya123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Prime007");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Prime007");
        driver.findElement(By.id("register-button")).click();
        String expectedMessage = "Your registration completed"; // this is from requirement
        String actualMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    @After
    public void closeDown() {
        closeBrowser();
    }
}

