package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlexTest {

    Feline feline;
    Alex alex;

    @Before
    public void initialize() throws Exception {
        Feline feline = new Feline();
        this.feline = feline;
        Alex alex = new Alex(feline);
        this.alex = alex;
    }

    @Test
    public void getKittens() {
        int actual = alex.getKittens();
        assertEquals(0, actual);
    }

    @Test
    public void getFriends() {
        List<String> actual = alex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), actual);
    }

    @Test
    public void getPlaceOfLiving() {
        String actual = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский Зоопарк", actual);
    }
}