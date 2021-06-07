package ru.geekbrains.calculator3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

    private void initViews() {
        initTextViews();
        initButtons();
    }

    private void initTextViews() {
        enterText = findViewById(R.id.display);
        //resultText = findViewById(R.id.display);
    }

    public void initButtons() {
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
        for (Button button : buttons) {
            clickButton(button);
        }

    }

    private void clickButton(Button button) {
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.key_1) {
            addEnterText('1');
        }

        if (v.getId() == R.id.key_2) {
            addEnterText('2');
        }

        if (v.getId() == R.id.key_3) {
            addEnterText('3');
        }

        if (v.getId() == R.id.key_4) {
            addEnterText('4');
        }

        if (v.getId() == R.id.key_5) {
            addEnterText('5');
        }

        if (v.getId() == R.id.key_6) {
            addEnterText('6');
        }

        if (v.getId() == R.id.key_7) {
            addEnterText('7');
        }

        if (v.getId() == R.id.key_8) {
            addEnterText('8');
        }

        if (v.getId() == R.id.key_9) {
            addEnterText('9');
        }

        if (v.getId() == R.id.key_0) {
            addEnterText('0');
        }

        if (v.getId() == R.id.key_point) {

        }

        if (v.getId() == R.id.key_plus) {

        }

        if (v.getId() == R.id.key_minus) {

        }

        if (v.getId() == R.id.key_multi) {

        }

        if (v.getId() == R.id.key_division) {

        }

        if (v.getId() == R.id.key_clear) {

        }

        if (v.getId() == R.id.key_equal) {

        }

    }

    private void addEnterText(char c) {
        stringEnterText = String.format("%s%c", stringEnterText, c);
        enterText.setText(stringEnterText);
    }

    private void clearTextView(){
        stringEnterText = "";
        stringResultText = "0";
        enterText.setText(stringEnterText);
        resultText.setText(stringResultText);
    }






}