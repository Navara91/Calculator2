package ru.geekbrains.calculator3;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class operations {

    private int argumentOne = 0;
    private int getArgumentTwo = 0;
    private boolean isFirstArgument = true;

    public operations (){

    }

    public void keyOnePressed(){
        computeArg(1);
        publishArgument();
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
