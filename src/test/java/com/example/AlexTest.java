package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlexTest {

    @Test
    public void getKittens() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex();
        int actual = alex.getKittens(feline);
        assertEquals(0, actual);
    }

    @Test
    public void getFriends() throws Exception {
        Alex alex = new Alex();
        List<String> actual = alex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), actual);
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        Alex alex = new Alex();
        String actual = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский Зоопарк", actual);
    }
}