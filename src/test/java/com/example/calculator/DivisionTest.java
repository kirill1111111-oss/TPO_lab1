package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void testExecute() {
        Division division = new Division();
        assertEquals(2.0, division.execute(6.0, 3.0));
        assertEquals(-2.0, division.execute(-6.0, 3.0));
        assertEquals(0.0, division.execute(0.0, 5.0));
    }

    @Test
    void testDivisionByZero() {
        Division division = new Division();
        assertThrows(IllegalArgumentException.class, () -> division.execute(5.0, 0.0));
    }
}