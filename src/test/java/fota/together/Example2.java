package fota.together;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Example2 extends BaseTest {

    @Test
    public void testBBCTopSportsStoryName() {
        // Navigate to bbc
        driver.get("http://bbc.co.uk");
        // Click Bottom iPlayer link!
        driver.findElement(By.cssSelector("#orb-aside .orb-nav-iplayer a")).click();

        // Navigate to bbc
        driver.get("http://bbc.co.uk");
        // Get text from top sports story
        String topStoryText = driver.findElement(By.cssSelector("section.hp-module--duo div.hp-top-stories--sport-palette div:first-child .top-story__content h3")).getText();

        // Assert the top story text is what we expected
        assertEquals(topStoryText, "LiveSportsday - rolling football news");
    }

}
