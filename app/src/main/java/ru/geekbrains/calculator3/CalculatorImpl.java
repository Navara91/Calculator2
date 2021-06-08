package ru.geekbrains.calculator3;

public class CalculatorImpl implements Calculator{
    @Override
    public int performBinaryOperator(int argOne, int argTwo, Operator operator) {
        return argOne + argTwo;
    }
}
