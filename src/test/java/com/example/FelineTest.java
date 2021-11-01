package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline;

    @Before public void initialize() {
        Feline feline = new Feline();
        this.feline = feline;
    }

    @Test
    public void checkingCallWithArgumentEqualsOne() {
        int actual = feline.getKittens(1);
        assertEquals(1, actual);
    }

    @Test
    public void eatMeat() throws Exception {
        List<String> actual = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getFamily() {
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittens() {
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void testGetKittens() {
        Random random = new Random();

        int expected = random.nextInt();
        int actual = feline.getKittens(expected);
        assertEquals(expected, actual);
    }
}