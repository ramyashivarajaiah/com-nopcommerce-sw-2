package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

/**1. userShouldNavigateToLoginPageSuccessfully *
 click on the ‘Login’ link
 *  Verify the text ‘Welcome, Please Sign
 In!’
 /**
 *
 */
    public void userShouldNavigateToLoginPageSuccessfully() {
        //login to the page
        WebElement loginLink = driver.findElement(By.linkText("Log in")); // Login is the element
        loginLink.click();
        //verifying the text
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);

    }


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //logining in
        WebElement loginLink = driver.findElement(By.linkText("Log in")); // Login is the element
        loginLink.click();
        //Enter valid name
        WebElement emailFields = driver.findElement(By.id("Email"));
        emailFields.sendKeys("roam@gmail.com");
        //Enter valid password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("roam123");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Verify the ‘Log out’ text is display
        String expectedText = "Log out";
        String actualText = driver.findElement(By.xpath("//a[text()= 'Log out']")).getText();
        Assert.assertEquals("Unsucessfull login", expectedText, actualText);

    }

    /**
     * 3. verifyTheErrorMessage
     * <p>
     * * click on the ‘Login’ link
     * * Enter invalid username
     * * Enter invalid password
     * * Click on Login button
     * * Verify the error message ‘Login was unsuccessful.
     * Please correct the errors and try again. No customer account found’
     */
    @Test
    public void verifyTheErrorMessage() {
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in")); // Login is the element
        loginLink.click();
        //Enter invalid username
        driver.findElement(By.id("Email-error")).sendKeys("roam@gmail.com");
        //Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("roam@123");
        //Click on Login button
        driver.findElement(By.linkText("Log in")).click();
        //Verify the error message
        String expectedText = "Login was unsuccessful.\n" + "Please correct the errors and try again. No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();
        //Assert.assertEquals();


    }

    @After
    public void closeDown() {
        //  closeBrowser();
    }
}
