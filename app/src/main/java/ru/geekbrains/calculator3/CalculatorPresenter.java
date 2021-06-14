package ru.geekbrains.calculator3;

import android.os.Parcel;
import android.os.Parcelable;

public class CalculatorPresenter implements Parcelable {

    private final CalculatorView view;
    private final Calculator calculator;

    private int result;
    private int argumentOne = 0;
    private int argumentTwo = 0;
    private boolean isFirstArgument = true;

    private Operator operator = null;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {

        this.view = view;
        this.calculator = calculator;

        publishArgument();
    }

    protected CalculatorPresenter(CalculatorView view, Calculator calculator, Parcel in) {
        this.view = view;
        this.calculator = calculator;
        result = in.readInt();
        argumentOne = in.readInt();
        argumentTwo = in.readInt();
        isFirstArgument = in.readByte() != 0;
    }

    public static final Creator<CalculatorPresenter> CREATOR = new Creator<CalculatorPresenter>() {
        public CalculatorView view;
        public Calculator calculator;

        @Override
        public CalculatorPresenter createFromParcel(Parcel in) {
            return new CalculatorPresenter(view, calculator, in);
        }

        @Override
        public CalculatorPresenter[] newArray(int size) {
            return new CalculatorPresenter[size];
        }
    };

    public void keyOnePressed() {
        computeArg(1);
        publishArgument();
    }

    public void keyTwoPressed() {
        computeArg(2);
        publishArgument();
    }

    public void keyThreePressed() {
        computeArg(3);
        publishArgument();
    }

    public void keyFourPressed() {
        computeArg(4);
        publishArgument();
    }

    public void keyFivePressed() {
        computeArg(5);
        publishArgument();
    }

    public void keySixPressed() {
        computeArg(6);
        publishArgument();
    }

    public void keySevenPressed() {
        computeArg(7);
        publishArgument();
    }

    public void keyEightPressed() {
        computeArg(8);
        publishArgument();
    }

    public void keyNinePressed() {
        computeArg(9);
        publishArgument();
    }

    public void keyZeroPressed() {
        computeArg(0);
        publishArgument();
    }

    public void keyPlusPressed() {

        isFirstArgument = false;

        if (operator != null) {
            result = calculator.performBinaryOperatorPlus(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        operator = Operator.ADD;
    }

    public void keyMinusPressed() {

        isFirstArgument = false;

        if (operator != null) {
            result = calculator.performBinaryOperatorMinus(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        operator = Operator.MINUS;
    }

    public void keyMultiPressed() {

        isFirstArgument = false;

        if (operator != null) {
            result = calculator.performBinaryOperatorMulti(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        operator = Operator.MULTI;
    }

    public void keyDivisionPressed() {

        isFirstArgument = false;

        if (operator != null) {
            result = calculator.performBinaryOperatorDivision(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        operator = Operator.DIVISION;
    }

    public void keyEqualPressed() {

        if (operator == Operator.ADD) {
            result = calculator.performBinaryOperatorPlus(argumentOne, argumentTwo, operator);
            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        if (operator == Operator.MINUS) {
            result = calculator.performBinaryOperatorMinus(argumentOne, argumentTwo, operator);
            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        if (operator == Operator.MULTI) {
            result = calculator.performBinaryOperatorMulti(argumentOne, argumentTwo, operator);
            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        if (operator == Operator.DIVISION) {
            result = calculator.performBinaryOperatorDivision(argumentOne, argumentTwo, operator);
            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        operator = null;
    }

    public void keyClearPressed(){

        isFirstArgument = true;
        operator = null;
        argumentOne = 0;
        argumentTwo = 0;

        view.showResult(String.valueOf(argumentOne));
    }

    public void publishArgument() {

        if (isFirstArgument) {
            view.showResult(String.valueOf(argumentOne));
        } else {
            view.showResult(String.valueOf(argumentTwo));
        }
    }

    private void computeArg(int addition) {
        if (isFirstArgument) {
            argumentOne = argumentOne * 10 + addition;
        } else {
            argumentTwo = argumentTwo * 10 + addition;
        }
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(result);
        dest.writeInt(argumentOne);
        dest.writeInt(argumentTwo);
        dest.writeByte((byte) (isFirstArgument ? 1 : 0));
    }
}
