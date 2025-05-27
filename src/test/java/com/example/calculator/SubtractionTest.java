package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void testExecute() {
        Subtraction subtraction = new Subtraction();
        assertEquals(-1.0, subtraction.execute(2.0, 3.0));
        assertEquals(-7.0, subtraction.execute(-4.0, 3.0));
        assertEquals(0.0, subtraction.execute(0.0, 0.0));
    }
}