package ru.geekbrains.calculator3;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements CalculatorView {

    private final static String counter = "CalculatorPresenter";
    private TextView resultText;
    private CalculatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_constraint);

        resultText = findViewById(R.id.result);

        presenter = new CalculatorPresenter(this, new CalculatorImpl());

        findViewById(R.id.key_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyOnePressed();
            }
        });

        findViewById(R.id.key_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyTwoPressed();
            }
        });

        findViewById(R.id.key_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyThreePressed();
            }
        });

        findViewById(R.id.key_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyFourPressed();
            }
        });

        findViewById(R.id.key_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyFivePressed();
            }
        });

        findViewById(R.id.key_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keySixPressed();
            }
        });

        findViewById(R.id.key_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keySevenPressed();
            }
        });

        findViewById(R.id.key_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyEightPressed();
            }
        });

        findViewById(R.id.key_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyNinePressed();
            }
        });

        findViewById(R.id.key_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyZeroPressed();
            }
        });

        findViewById(R.id.key_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyPlusPressed();
            }
        });

        findViewById(R.id.key_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyMinusPressed();
            }
        });

        findViewById(R.id.key_multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyMultiPressed();
            }
        });

        findViewById(R.id.key_division).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyDivisionPressed();
            }
        });

        findViewById(R.id.key_equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyEqualPressed();
            }
        });

        findViewById(R.id.key_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.keyClearPressed();
            }
        });

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(counter, presenter);
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        presenter = (CalculatorPresenter) savedInstanceState.getSerializable(counter);
    }

    @Override
    public void showResult(String result) {
        resultText.setText(result);
    }


}