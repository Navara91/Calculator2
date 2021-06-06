package ru.geekbrains.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_constraint);

            //digit buttons
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

            button1.setOnClickListener(clickListener);

    }






}