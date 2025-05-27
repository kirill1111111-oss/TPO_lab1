package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void testExecute() {
        Multiplication multiplication = new Multiplication();
        assertEquals(6.0, multiplication.execute(2.0, 3.0));
        assertEquals(-12.0, multiplication.execute(-4.0, 3.0));
        assertEquals(0.0, multiplication.execute(0.0, 5.0));
    }
}