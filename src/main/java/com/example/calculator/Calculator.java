package com.example.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<String, Operation> operations = new HashMap<>();
    public Calculator(Map<String, Operation> operations) {
        this.operations = operations;
    }
    public Calculator() {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }


    public double calculate(double operand1, double operand2, String operator) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return operation.execute(operand1, operand2);
    }
}