package ru.geekbrains.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonP;
    private TextView display;
    private float a = 0;
    private float b = 0;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_constraint);

            //digit buttons
            button1 = findViewById(R.id.key_1);
            button2 = findViewById(R.id.key_2);
            button3 = findViewById(R.id.key_3);
            button4 = findViewById(R.id.key_4);
            button5 = findViewById(R.id.key_5);
            button6 = findViewById(R.id.key_6);
            button7 = findViewById(R.id.key_7);
            button8 = findViewById(R.id.key_8);
            button9 = findViewById(R.id.key_9);
            button0 = findViewById(R.id.key_0);
            buttonP = findViewById(R.id.key_point);

            display = findViewById(R.id.display);

            button1.setOnClickListener(clickListener);

    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.key_1){
                a = 1;
                display.setText("1");
            }

            if(v.getId() == R.id.key_2){
                a = 2;
                display.setText("2");
            }

            if(v.getId() == R.id.key_3){
                a = 3;
                display.setText("3");
            }

            if(v.getId() == R.id.key_4){
                a = 4;
                display.setText("4");
            }

            if(v.getId() == R.id.key_5){
                a = 5;
                display.setText("5");
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




}