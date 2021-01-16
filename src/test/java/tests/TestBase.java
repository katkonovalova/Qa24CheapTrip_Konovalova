package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1200");
        driver = new ChromeDriver(options);
        driver.get("http://lowcoststrip.com/search");

    }
    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
}