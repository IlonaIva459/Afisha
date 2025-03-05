package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsManagerTest {

    @Test
    public void shouldAddFilms() { //добавляет фильмы
        FilmsManager films = new FilmsManager();
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Джентльмены");

        String[] expected = {"Бладшот", "Вперёд", "Джентльмены"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLimitLessQuantity() {
        FilmsManager films = new FilmsManager(3);
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Отель Белград");
        films.add("Джентльмены");
        films.add("Человек - невидимка");
        films.add("Тролли.Мировой тур");
        films.add("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек - невидимка"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmsManager films = new FilmsManager();
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Отель Белград");

        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}