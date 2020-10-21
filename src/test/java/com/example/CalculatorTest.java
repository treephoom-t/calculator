package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addTest() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void subtractTest() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void multiplyTest() {
        assertEquals(5, calculator.subtract(10, 5));
    }
}
