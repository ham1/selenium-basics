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
            driver.get("https://bbc.com");
            // Get text from top sports story
            String topStoryText = driver.findElement(
                    By.cssSelector(
                            "TODO"))
                    .getText();

            // Print that text out!
            System.out.println(topStoryText);
        } catch (Exception e) {
            System.err.println("Oh noes, something went wrong!");
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

}
