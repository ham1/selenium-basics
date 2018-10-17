package fota.together.simple;

import static org.testng.Assert.assertEquals;

import fota.together.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Example2 extends BaseTest {

    @Test
    public void testBBCTopSportsStoryName() {
        // Navigate to bbc
        driver.get("http://bbc.co.uk");
        // Get text from top sports story
        String topStoryText = driver.findElement(By.cssSelector("TODO")).getText();

        // Assert the top story text is what we expected
        assertEquals(topStoryText, "TODO");
    }

}
