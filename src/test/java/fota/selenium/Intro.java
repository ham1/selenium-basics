package fota.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro {

    public static void main(String[] args) {
        // Open Firefox
        WebDriver driver = new FirefoxDriver();
        // Navigate to "The Internet"
        driver.get("http://the-internet.herokuapp.com/");
        // Click Forgot Password link
        driver.findElement(By.linkText("Forgot Password ")).click();
        // Close the browser
        driver.quit();
    }

}
