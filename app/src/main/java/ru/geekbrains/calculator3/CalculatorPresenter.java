package ru.geekbrains.calculator3;

import android.view.View;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorPresenter {

    private final CalculatorView view;
    private final Calculator calculator;

    private int argumentOne = 0;
    private int argumentTwo = 0;
    private boolean isFirstArgument = true;

    private Operator operator = null;

    public CalculatorPresenter(CalendarView view, Calculator calculator){

        this.view = view;
        this.calculator = calculator;

        publishArgument();
    }

    public void keyOnePressed(){
        computeArg(1);
        publishArgument();
    }

    public void keyTwoPressed(){
        computeArg(2);
        publishArgument();
    }

    public void keyThreePressed(){
        computeArg(3);
        publishArgument();
    }

    public void keyFourPressed(){
        computeArg(4);
        publishArgument();
    }

    public void keyFivePressed(){
        computeArg(5);
        publishArgument();
    }

    public void keySixPressed(){
        computeArg(6);
        publishArgument();
    }

    public void keySevenPressed(){
        computeArg(7);
        publishArgument();
    }

    public void keyEightPressed(){
        computeArg(8);
        publishArgument();
    }

    public void keyNinePressed(){
        computeArg(9);
        publishArgument();
    }

    public void keyZeroPressed(){
        computeArg(0);
        publishArgument();
    }

    public void keyPlusPressed(){

        isFirstArgument = false;

        if (operator != null){
            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        operator = Operator.ADD;
    }

    public void keyMinusPressed(){

        isFirstArgument = false;

        if (operator != null){
            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }

        operator = Operator.ADD;
    }


    private void publishArgument() {

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

    

}
