package fota.together;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Open Firefox
        driver = new FirefoxDriver();
        // Set implicit wait to 5 seconds
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Maximise window
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        // Close the browser
        driver.quit();
    }

}
