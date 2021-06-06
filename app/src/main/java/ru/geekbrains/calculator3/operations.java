package ru.geekbrains.calculator3;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class operations extends AppCompatActivity implements View.OnClickListener{

    private int a = 0;

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.key_1){

            a = 1;
        }

        if(v.getId() == R.id.key_2){
            a = 2;
        }

        if(v.getId() == R.id.key_3){
            a = 3;
        }

        if(v.getId() == R.id.key_4){
            a = 4;
        }

        if(v.getId() == R.id.key_5){
            a = 5;
        }

        if(v.getId() == R.id.key_6){
            a = 6;
        }

        if(v.getId() == R.id.key_7){
            a = 7;
        }

        if(v.getId() == R.id.key_8){
            a = 8;
        }

        if(v.getId() == R.id.key_9){
            a = 9;
        }

        if(v.getId() == R.id.key_0){
            a = 0;
        }

        if(v.getId() == R.id.key_point){

        }

        if(v.getId() == R.id.key_plus){

        }

        if(v.getId() == R.id.key_minus){

        }

        if(v.getId() == R.id.key_multi){

        }

        if(v.getId() == R.id.key_division){

        }

        if(v.getId() == R.id.key_clear){

        }

        if(v.getId() == R.id.key_equal){

        }
    }

    static float calculatorLogic (int digit){


    }

}
