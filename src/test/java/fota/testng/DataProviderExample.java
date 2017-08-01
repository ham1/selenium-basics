package fota.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "addition data")
    public Object[][] dataProvider() {
        return new Object[][]{{1, 2}, {7, -1}, {0, 0}};
    }

    @Test(dataProvider = "addition data")
    public void additionTest(Integer a, Integer b) {
        assertEquals(Adder.add(a, b), a + b);
    }
}
