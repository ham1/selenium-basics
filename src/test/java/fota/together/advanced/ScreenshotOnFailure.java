package fota.together.advanced;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class ScreenshotOnFailure {

    private WebDriver driver;
    private Wait<WebDriver> wait;

    @BeforeMethod
    public void setup() {
        // Open Firefox
        driver = new FirefoxDriver();
        // Set implicit wait to 5 seconds
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Create WebDriverWait instance
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testEmailFieldIsEnabled() {
        // Navigate to The Internet
        driver.get("http://the-internet.herokuapp.com/");
        // Wait for and click the Forgot Password link
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Forgot my Password")))
                .click();
        // Wait for the Email field
        WebElement emailField = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.id("email")));
        // Assert the Email field is enabled
        assertTrue(emailField.isEnabled(), "Email field should be enabled");
    }

    @AfterMethod
    public void teardown(ITestResult testResult) {
        if (!testResult.isSuccess()) {
            takeAndSaveScreenshot();
        }
        // Close the browser
        driver.quit();
    }

    private void takeAndSaveScreenshot() {
        Path path = Paths.get(String.format("screenshot-%d.png", System.currentTimeMillis()));
        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        try {
            Files.write(path, screenshotBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
