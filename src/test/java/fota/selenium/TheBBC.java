package fota.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TheBBC {

    public static void main(String[] args) {
        // Open Firefox
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to bbc
            driver.get("https://bbc.co.uk");
            // Click Bottom iPlayer link!
            driver.findElement(By.cssSelector("TODO")).click();

            // Navigate to bbc
            driver.get("https://bbc.co.uk");
            // Get text from top sports story
            String topStoryText = driver.findElement(
                    By.cssSelector(
                            "TODO"))
                    .getText();

            // Print that text out!
            System.out.println(topStoryText);
        } catch (Exception e) {
            System.err.println("Oh noes, something went wrong!");
        } finally {
            // Close the browser
            driver.quit();
        }
    }

}
