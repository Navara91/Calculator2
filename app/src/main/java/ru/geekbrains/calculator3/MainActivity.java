package ru.geekbrains.calculator3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements CalculatorView, View.OnClickListener {

    private final static String COUNTER = "CalculatorPresenter";
    private TextView resultText;
    private CalculatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_constraint);

        resultText = findViewById(R.id.result);

        presenter = new CalculatorPresenter(this, new CalculatorImpl());

        initViews();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.key_1:
                presenter.keyOnePressed();
                break;

            case R.id.key_2:
                presenter.keyTwoPressed();
                break;
            case R.id.key_3:
                presenter.keyThreePressed();
                break;

            case R.id.key_4:
                presenter.keyFourPressed();
                break;
            case R.id.key_5:
                presenter.keyFivePressed();
                break;

            case R.id.key_6:
                presenter.keySixPressed();
                break;
            case R.id.key_7:
                presenter.keySevenPressed();
                break;

            case R.id.key_8:
                presenter.keyEightPressed();
                break;
            case R.id.key_9:
                presenter.keyNinePressed();
                break;

            case R.id.key_0:
                presenter.keyZeroPressed();
                break;

            case R.id.key_plus:
                presenter.keyPlusPressed();
                break;

            case R.id.key_minus:
                presenter.keyMinusPressed();
                break;

            case R.id.key_multi:
                presenter.keyMultiPressed();
                break;

            case R.id.key_division:
                presenter.keyDivisionPressed();
                break;

            case R.id.key_equal:
                presenter.keyEqualPressed();
                break;

            case R.id.key_clear:
                presenter.keyClearPressed();
                break;
        }

    }

    private void initViews(){

        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButton0ClickListener();
        initButtonPlusClickListener();
        initButtonMinusClickListener();
        initButtonMultiClickListener();
        initButtonDivisionClickListener();
        initButtonEqualClickListener();
        initButtonClearClickListener();
    }

    private void initButton1ClickListener(){
        Button key_1 = findViewById(R.id.key_1);
        key_1.setOnClickListener(this);
    }

    private void initButton2ClickListener(){
        Button key_2 = findViewById(R.id.key_2);
        key_2.setOnClickListener(this);
    }

    private void initButton3ClickListener(){
        Button key_3 = findViewById(R.id.key_3);
        key_3.setOnClickListener(this);
    }

    private void initButton4ClickListener(){
        Button key_4 = findViewById(R.id.key_4);
        key_4.setOnClickListener(this);
    }

    private void initButton5ClickListener(){
        Button key_5 = findViewById(R.id.key_5);
        key_5.setOnClickListener(this);
    }

    private void initButton6ClickListener(){
        Button key_6 = findViewById(R.id.key_6);
        key_6.setOnClickListener(this);
    }

    private void initButton7ClickListener(){
        Button key_7 = findViewById(R.id.key_7);
        key_7.setOnClickListener(this);
    }

    private void initButton8ClickListener(){
        Button key_8 = findViewById(R.id.key_8);
        key_8.setOnClickListener(this);
    }

    private void initButton9ClickListener(){
        Button key_9 = findViewById(R.id.key_9);
        key_9.setOnClickListener(this);
    }

    private void initButton0ClickListener(){
        Button key_0 = findViewById(R.id.key_1);
        key_0.setOnClickListener(this);
    }

    private void initButtonPlusClickListener(){
        Button key_plus = findViewById(R.id.key_plus);
        key_plus.setOnClickListener(this);
    }

    private void initButtonMinusClickListener(){
        Button key_minus = findViewById(R.id.key_minus);
        key_minus.setOnClickListener(this);
    }

    private void initButtonMultiClickListener(){
        Button key_multi = findViewById(R.id.key_multi);
        key_multi.setOnClickListener(this);
    }

    private void initButtonDivisionClickListener(){
        Button key_division = findViewById(R.id.key_division);
        key_division.setOnClickListener(this);
    }

    private void initButtonEqualClickListener(){
        Button key_equal = findViewById(R.id.key_equal);
        key_equal.setOnClickListener(this);
    }

    private void initButtonClearClickListener(){
        Button key_clear = findViewById(R.id.key_clear);
        key_clear.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putSerializable(COUNTER, presenter);
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        presenter = (CalculatorPresenter) instanceState.getSerializable(COUNTER);
        presenter.setView(this);
//        presenter.publishArgument();
    }

    @Override
    public void showResult(String result) {
        resultText.setText(result);
    }



}