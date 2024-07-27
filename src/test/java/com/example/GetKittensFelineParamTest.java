package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetKittensFelineParamTest {

    private final int checkedCount;
    private final int expectedCount;
    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    public GetKittensFelineParamTest(int checkedCount, int expectedCount) {
        this.checkedCount = checkedCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {10, 10},
                {2, 2},
                {0, 0},
        };
    }

    @Test
    public void getKittensTest() {
        assertEquals(expectedCount, feline.getKittens(checkedCount));
    }
}
