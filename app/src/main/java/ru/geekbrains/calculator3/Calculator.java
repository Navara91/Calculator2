package ru.geekbrains.calculator3;

public interface Calculator {

    int performBinaryOperatorPlus(int argOne, int argTwo, Operator operator);
    int performBinaryOperatorMinus(int argOne, int argTwo, Operator operator);
    int performBinaryOperatorMulti(int argOne, int argTwo, Operator operator);
    int performBinaryOperatorDivision(int argOne, int argTwo, Operator operator);

}
