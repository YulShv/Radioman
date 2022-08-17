package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationAmount() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(30, radio.getStationAmount());

        radio.setCurrentStationNumber(12);
        Assertions.assertEquals(12, radio.getCurrentStationNumber());

        radio.setCurrentStationNumber(15);
        radio.nextStationNumber();

        Assertions.assertEquals(16, radio.getCurrentStationNumber());

        radio.setCurrentStationNumber(0);
        radio.prevStationNumber();
        Assertions.assertEquals(29, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(7);

        int expected = 7;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);
        radio.nextStationNumber();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);
        radio.prevStationNumber();

        int expected = 7;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNullIfStationNumberAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.nextStationNumber();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineIfStationNumberUnderMin() {
        Radio radio = new Radio();

        radio.prevStationNumber();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePlusOne() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumePlusOne() {
        Radio radio = new Radio();

        radio.increaseVolume();
        radio.increaseVolume();
        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeUnderMin() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAboveMax() {
        Radio radio = new Radio();

        for (int i = 0; i <= 100; i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
