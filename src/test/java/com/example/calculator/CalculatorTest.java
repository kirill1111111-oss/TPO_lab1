package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5.0, calculator.calculate(2.0, 3.0, "+"));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1.0, calculator.calculate(2.0, 3.0, "-"));
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, calculator.calculate(2.0, 3.0, "*"));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.calculate(6.0, 3.0, "/"));
    }

    @Test
    void testDivisionByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(6.0, 0.0, "/");
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void testInvalidOperator() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(2.0, 3.0, "%");
        });
        assertEquals("Invalid operator: %", exception.getMessage());
    }
}