package fota.together.simple;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1 {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Open Firefox
        driver = new FirefoxDriver();
        // Set implicit wait to 5 seconds
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testEmailFieldIsEnabled() {
        // Navigate to The Internet
        driver.get("http://the-internet.herokuapp.com/");
        // Wait for the Forgot Password link
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));
        // Click Forgot Password link
        forgotPasswordLink.click();
        // Wait for the Email field
        WebElement emailField = driver.findElement(By.id("email"));
        // Assert the Email field is enabled
        assertTrue(emailField.isEnabled(), "Email field should be enabled");
    }

    @AfterMethod
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}
