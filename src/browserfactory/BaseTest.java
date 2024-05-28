package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver; // driver is a static variable

    public void openBrowser(String baseUrl) { // openBrowser is a method and baseUrl is the parameter

        // Launch the Chrome Browser
        driver = new ChromeDriver();

        // Open the URL into Browser
        driver.get(baseUrl);

        //Maximise Browser
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.quit();
    }
}
