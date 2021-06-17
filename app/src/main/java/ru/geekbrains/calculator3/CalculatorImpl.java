package ru.geekbrains.calculator3;

public class CalculatorImpl implements Calculator{
    @Override
    public int performBinaryOperatorPlus(int argOne, int argTwo, Operator operator) {
        return argOne + argTwo;
    }

    @Override
    public int performBinaryOperatorMinus(int argOne, int argTwo, Operator operator) {
        return argOne - argTwo;
    }

    @Override
    public int performBinaryOperatorMulti(int argOne, int argTwo, Operator operator) {
        return argOne * argTwo;
    }

    @Override
    public int performBinaryOperatorDivision(int argOne, int argTwo, Operator operator) {
        return argOne / argTwo;
    }

}
