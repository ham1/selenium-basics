package fota.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Intro {

    @Test
    public void additionTest() {
        assertEquals(Adder.add(1, 2), 3, "additionTest method not working");
    }

    @Test
    public void additionTestAgain() {
        assertEquals(Adder.add(2, 1), 3, "additionTestAgain method not working");
    }
}
