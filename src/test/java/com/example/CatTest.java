package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        String actual = cat.getSound();
        assertEquals("Мяу", actual);
    }

    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
}