package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void SetCurrentTemperatureValid() {
        Conditioner condition = new Conditioner();
        condition.setName("Panasonic");
        condition.setMaxTemperature(25);
        condition.setMinTemperature(17);
        condition.setOn(true);
        condition.setCurrentTemperature(20);
        int actual = condition.getCurrentTemperature();
        int expected = 20;
        assertEquals(expected, actual);

    }

    @Test
    public void SetCurrentTemperatureInvalidMax() {
        Conditioner condition = new Conditioner();
        condition.setName("Panasonic");
        condition.setMaxTemperature(25);
        condition.setMinTemperature(17);
        condition.setOn(true);
        condition.setCurrentTemperature(30);
        int actual = condition.getCurrentTemperature();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void SetCurrentTemperatureInvalidMin() {
        Conditioner condition = new Conditioner();
        condition.setName("Panasonic");
        condition.setMaxTemperature(25);
        condition.setMinTemperature(17);
        condition.setOn(true);
        condition.setCurrentTemperature(15);
        int actual = condition.getCurrentTemperature();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseCurrentTemperatureValid() {
        Conditioner condition = new Conditioner();
        condition.setName("Panasonic");
        condition.setMaxTemperature(25);
        condition.setMinTemperature(17);
        condition.setOn(true);
        condition.setCurrentTemperature(20);
        condition.increaseCurrentTemperature();
        assertEquals(21, condition.getCurrentTemperature());


    }

    @Test
    public void increaseCurrentTemperatureInvalid() {
        Conditioner condition = new Conditioner();
        condition.setName("Panasonic");
        condition.setMaxTemperature(25);
        condition.setMinTemperature(17);
        condition.setOn(true);
        condition.setCurrentTemperature(25);
        condition.increaseCurrentTemperature();
        assertEquals(25, condition.getCurrentTemperature());


    }

    @Test
    public void decreaseCurrentTemperatureValid() {
        Conditioner condition = new Conditioner();
        condition.setName("Panasonic");
        condition.setMaxTemperature(25);
        condition.setMinTemperature(17);
        condition.setOn(true);
        condition.setCurrentTemperature(19);
        condition.decreaseCurrentTemperature();
        assertEquals(18, condition.getCurrentTemperature());

    }

    @Test
    public void decreaseCurrentTemperatureInvalid() {
        Conditioner condition = new Conditioner();
        condition.setName("Panasonic");
        condition.setMaxTemperature(25);
        condition.setMinTemperature(17);
        condition.setOn(true);
        condition.setCurrentTemperature(17);
        condition.decreaseCurrentTemperature();
        assertEquals(17, condition.getCurrentTemperature());

    }
}