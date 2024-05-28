package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest { // extending class to baseTest. BaseTest is the parent class


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    /**
     * 1. userShouldNavigateToComputerPageSuccessfully
     *
     * * click on the ‘Computers’ Tab
     * * Verify the text ‘Computers’
     */

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the ‘Computers’ Tab
        WebElement computersTab = driver.findElement(By.xpath("//a[text()=''Computers ]"));
        computersTab.click();
        //Verify the text ‘Computers’
        String expectedResult = "Computers";
        String actualResult = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals(expectedResult,actualResult);

    }

    /**
     * 2. userShouldNavigateToElectronicsPageSuccessfully
     *
     * * click on the ‘Electronics’ Tab
     * * Verify the text ‘Electronics’
     */
@Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
       // WebElement electronicsTab = driver.findElement(By.xpath("//a[text()='Electronics ']"));
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
        String expected = "Electronics";
    String actualResult = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
    Assert.assertEquals(expected,actualResult);
    }

    /**
     * 3. userShouldNavigateToApparelPageSuccessfully
     *
     * * click on the ‘Apparel’ Tab
     * * Verify the text ‘Apparel’
     */

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        // click on the ‘Apparel’ Tab
        WebElement apparelTab = driver.findElement(By.xpath("//a[text()='Apparel ']"));
        apparelTab.click();
        //Verify the text ‘Apparel’
        String expected = "Apparel";
        String actualResult = driver.findElement(By.xpath("//h1[text()='Apparel ']")).getText();
        Assert.assertEquals(expected,actualResult);

    }

    /**
     * 4.
     *
     * userShouldNavigateToDigitalDownloadsPageSuccessfully
     * * click on the ‘Digital downloads’ Tab
     * * Verify the text ‘Digital downloads’
     */

@Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        WebElement digitalDownloadTab = driver.findElement(By.xpath("//a[text()='Digital downloads ']"));
        digitalDownloadTab.click();
    String expected = "Digital downloads";
    String actualResult = driver.findElement(By.xpath("//h1[text()='Digital downloads  ']")).getText();
    Assert.assertEquals(expected,actualResult);
    }

    /**
     * 5. userShouldNavigateToBooksPageSuccessfully
     *
     * * click on the ‘Books’ Tab
     * * Verify the text ‘Books’
     */

@Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        WebElement booksTab = driver.findElement(By.xpath("//a[text()=''Books ]"));
        booksTab.click();
    String expected = "Books";
    String actualResult = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
    Assert.assertEquals(expected,actualResult);
    }

    /**
     * 6. userShouldNavigateToJewelryPageSuccessfully
     *
     * * click on the ‘Jewelry’ Tab
     * * Verify the text ‘Jewelry’
     */

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
       WebElement jewelryTab = driver.findElement(By.xpath("//a[text()= 'Jewelry ']"));
        jewelryTab.click();
        String expected = "Jewelry";
        String actualResult = driver.findElement(By.xpath("//h1[text()='Jewelry ']")).getText();
        Assert.assertEquals(expected,actualResult);
    }

    /**
     * 7. userShouldNavigateToGiftCardsPageSuccessfully
     * * click on the ‘Gift Cards’ Tab
     * * Verify the text ‘Gift Cards’
     */
    @Test

    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement giftCardTab = driver.findElement(By.xpath("//a[text()='Gift Cards ']"));
        giftCardTab.click();
        String expected = "Gift Cards";
        String actualResult = driver.findElement(By.xpath("//h1[text()='Gift Cards ']")).getText();
        Assert.assertEquals(expected,actualResult);
    }
    @After
    public void closeDown(){
        closeBrowser();
    }
}
