package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();
    List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
    private static final int EXPECTED_KITTENS_COUNT = 1;

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoCountTest() {
        assertEquals(EXPECTED_KITTENS_COUNT, feline.getKittens());
    }

}
