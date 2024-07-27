package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();
    List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

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
        assertEquals(1, feline.getKittens());
    }

}
