package ru.geekbrains.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView enterText;
    private TextView resultText;
    private String stringEnterText = "";
    private String stringResultText = "0";

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_constraint);

        initViews();
    }

    private void initViews(){
            initTextViews();
            initButtons();
    }

    private void initTextViews(){
            enterText = findViewById(R.id.display);
            //resultText = findViewById(R.id.display);
    }

    public void initButtons(){
        Button button1 = findViewById(R.id.key_1);
        Button button2 = findViewById(R.id.key_2);
        Button button3 = findViewById(R.id.key_3);
        Button button4 = findViewById(R.id.key_4);
        Button button5 = findViewById(R.id.key_5);
        Button button6 = findViewById(R.id.key_6);
        Button button7 = findViewById(R.id.key_7);
        Button button8 = findViewById(R.id.key_8);
        Button button9 = findViewById(R.id.key_9);
        Button button0 = findViewById(R.id.key_0);
        Button buttonP = findViewById(R.id.key_point);
        Button buttonPlus = findViewById(R.id.key_plus);
        Button buttonMinus = findViewById(R.id.key_minus);
        Button buttonMulti = findViewById(R.id.key_multi);
        Button buttonDivision = findViewById(R.id.key_division);
        Button buttonEqual = findViewById(R.id.key_equal);
        Button buttonClear = findViewById(R.id.key_clear);
        Button[] buttons = {button0, button1, button2, button3, button4, button5, button6,
                button7, button8, button9, buttonP, buttonPlus, buttonMinus, buttonMulti,
                buttonDivision, buttonEqual, buttonClear};
        for (Button button : buttons){
            clickButton(button);
        }

    }

    private void clickButton(Button button) {
            button.setOnClickListener(this);
    }


    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.key_1){
                a = 1;
                enterText.setText("1");
            }

            if(v.getId() == R.id.key_2){
                a = 2;
                enterText.setText("2");
            }

            if(v.getId() == R.id.key_3){
                a = 3;
                enterText.setText("3");
            }

            if(v.getId() == R.id.key_4){
                a = 4;
                enterText.setText("4");
            }

            if(v.getId() == R.id.key_5){
                a = 5;
                enterText.setText("5");
            }

            if(v.getId() == R.id.key_6){
                a = 6;
                display.setText("6");
            }

            if(v.getId() == R.id.key_7){
                a = 7;
                display.setText("7");
            }

            if(v.getId() == R.id.key_8){
                a = 8;
                display.setText("8");
            }

            if(v.getId() == R.id.key_9){
                a = 9;
                display.setText("9");
            }

            if(v.getId() == R.id.key_0){
                a = 0;
                display.setText("0");
            }

            if(v.getId() == R.id.key_point){

            }

            if(v.getId() == R.id.key_plus){
                b = a;

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
    };

        static void plus ()


    @Override
    public void onClick(View v) {

    }
}