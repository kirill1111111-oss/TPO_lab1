package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void testExecute() {
        Addition addition = new Addition();
        assertEquals(5.0, addition.execute(2.0, 3.0));
        assertEquals(-1.0, addition.execute(-4.0, 3.0));
        assertEquals(0.0, addition.execute(0.0, 0.0));
    }
}