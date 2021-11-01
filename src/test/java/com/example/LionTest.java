package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    private final String[] sexes = new String[]{"Самец", "Самка"};

    @Test
    public void getKittens() throws Exception {
        for (String sex : sexes) {
            Lion lion = new Lion(sex, feline);
            Mockito.when(feline.getKittens()).thenReturn(1);
            int actual = lion.getKittens();
            assertEquals(1, actual);
        }

    }

    @Test(expected = Exception.class)
    public void expectedException() throws Exception {
        String sex = null;
        sex.length();
    }

    @Test
    public void doesHaveMane() throws Exception {
        for (String sex : sexes) {
            Lion lion = new Lion(sex, feline);
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
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
}