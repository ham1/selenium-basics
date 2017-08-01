package fota.together;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronisationExample {

    public static void main(String[] args) {
        // Open Firefox
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // Set implicit wait to 5 seconds
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Navigate to The Internet
        driver.get("http://the-internet.herokuapp.com/");
        // Wait for the Forgot Password link
        WebElement forgotPasswordLink = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.linkText("Forgot Password")));
        // Click Forgot Password link
        forgotPasswordLink.click();
        // Wait for email field
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        // Print out button text
        System.out.println(driver.findElement(By.id("form_submit")).getText());
        // Close the browser
        driver.quit();
    }

}
