package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    @Test
    public void shouldAddPosters() {
        FilmManager manager = new FilmManager();
        manager.addPoster("Poster1");
        manager.addPoster("Poster2");
        manager.addPoster("Poster3");

        String[] expected = {"Poster1", "Poster2", "Poster3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void PostersFromLastToFirst() {
        FilmManager manager = new FilmManager();
        manager.addPoster("Poster1");
        manager.addPoster("Poster2");
        manager.addPoster("Poster3");

        String[] expected = {
                "Poster3",
                "Poster2",
                "Poster1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    public void anotherNumberOfPosters() {
        FilmManager manager = new FilmManager(2);
        manager.addPoster("Poster1");
        manager.addPoster("Poster2");
        manager.addPoster("Poster3");

        String[] expected = {"Poster1", "Poster2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    public void PostersFromLastToFirstInLimit() {
        FilmManager manager = new FilmManager(2);
        manager.addPoster("Poster1");
        manager.addPoster("Poster2");
        manager.addPoster("Poster3");

        String[] expected = { "Poster3", "Poster2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}