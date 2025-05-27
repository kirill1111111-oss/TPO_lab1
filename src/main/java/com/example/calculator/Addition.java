package com.example.calculator;

public class Addition implements Operation {
    @Override
    public double execute(double operand1, double operand2) {
        return operand1 + operand2;
    }
}