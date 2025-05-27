package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

class CalculatorMockitoTest {

    private Calculator calculator;
    private Operation operationMock;
    private Map<String, Operation> operations;

    @BeforeEach
    void setUp() {
        operationMock = Mockito.mock(Operation.class);
        operations = new HashMap<>();
        operations.put("+", operationMock);
        operations.put("-", operationMock);
        operations.put("*", operationMock);
        operations.put("/", operationMock);
        calculator = new Calculator(operations);
    }

    @Test
    void testCalculate_success() {
        // Arrange
        when(operationMock.execute(anyDouble(), anyDouble())).thenReturn(10.0);

        // Act
        double result = calculator.calculate(2.0, 3.0, "+");

        // Assert
        assertEquals(10.0, result);
        Mockito.verify(operationMock).execute(2.0, 3.0);
    }

    @Test
    void testCalculate_invalidOperator() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(2.0, 3.0, "%");
        });

        assertEquals("Invalid operator: %", exception.getMessage());
        Mockito.verify(operationMock, Mockito.never()).execute(anyDouble(), anyDouble());
    }
}