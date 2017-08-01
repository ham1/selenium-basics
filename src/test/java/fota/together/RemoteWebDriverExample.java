package fota.together;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDriverExample {

    public static void main(String[] args) throws MalformedURLException {
        // Request Firefox sessions from Selenium Grid
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL(
                "http://localhost:4444/wd/hub"), caps);

        // Navigate to The Internet
        driver.get("http://the-internet.herokuapp.com/");
        // Click Forgot Password link
        driver.findElement(By.linkText("Forgot Password")).click();
        // Close the browser
        driver.quit();
    }
}
