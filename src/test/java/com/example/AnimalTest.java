package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test(expected = Exception.class)
    public void expectedException() throws Exception {
        Animal animal = new Animal();
        String animalKind = null;
        List<String> actual = animal.getFood(animalKind);
    }

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actual);
    }
}