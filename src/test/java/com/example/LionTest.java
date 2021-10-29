package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    private final String[] sexes = new String[]{"Самец", "Самка"};

    @Test
    public void getKittens() throws Exception {
        Feline feline = new Feline();
        for (String sex : sexes) {
            Lion lion = new Lion(sex);
            int actual = lion.getKittens(feline);
            assertEquals(1, actual);
        }

    }

    @Test(expected = Exception.class)
    public void expectedException() throws Exception {
        String sex = null;
        Feline feline = new Feline();
        Lion lion = new Lion(sex);
        sex.length();
    }


    @Test
    public void doesHaveMane() throws Exception {
        for (String sex : sexes) {
            Lion lion = new Lion(sex);
            boolean actual = lion.doesHaveMane();
            if (sex.equals("Самец")) {
                assertTrue(actual);
            } else if (sex.equals("Самка")) {
                assertFalse(actual);
            }
        }
    }

    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец");

        List<String> actual = lion.getFood(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
}