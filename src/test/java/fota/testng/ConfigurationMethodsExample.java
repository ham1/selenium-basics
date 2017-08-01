package fota.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigurationMethodsExample {

    @BeforeClass
    public void classInit() {
        System.out.println("Currently running BeforeClass");
    }

    @BeforeMethod
    public void testInit() {
        System.out.println("Currently running BeforeMethod");
    }

    @Test
    public void additionTest() {
        assertEquals(Adder.add(1, 2), 3);
    }

    @Test
    public void subtractionTest() {
        assertEquals(subtract(3, 2), 1);
    }

    @AfterMethod
    public void testTeardown() {
        System.out.println("Currently running AfterMethod");
    }

    private int subtract(int a, int b) {
        return a - b;
    }
}
