package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    private final Math math = new Math();

    @Test
    void minTest() {
        assertEquals(2, math.min(2, 3));
    }
}
