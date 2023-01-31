package com.example.hw_7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private boolean isOperationClick;
    private String operaichin;
    private  Integer rezault;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
        MaterialButton button = findViewById(R.id.result_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("result",rezault.toString());
                startActivity(intent);
            }
        });
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                    break;
                }
            case R.id.btn_three:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                    break;
                }
            case R.id.btn_four:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                    break;
                }
            case R.id.btn_five:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                    break;
                }
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                    break;
                }
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                    break;
                }
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                    break;

                }
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                    break;

                }
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;

    }

    private void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                operaichin = "+";
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                operaichin = "-";
                break;
            case R.id.btn_multiplication:
                first = Integer.valueOf(textView.getText().toString());
                operaichin = "*";
                break;
            case R.id.btn_division:
                first = Integer.valueOf(textView.getText().toString());
                operaichin = "/";
                break;
            case R.id.btn_equal:
                second = Integer.valueOf(textView.getText().toString());
                switch (operaichin){
                    case "+":
                        rezault=first+second;
                        textView.setText(rezault.toString());
                        break;
                    case "-":
                        rezault=first-second;
                        textView.setText(rezault.toString());
                        break;
                    case "*":
                        rezault=first*second;
                        textView.setText(rezault.toString());
                        break;
                    case "/":
                        rezault=first/second;
                        textView.setText(rezault.toString());
                        break;
                }
                ((MaterialButton) findViewById(R.id.result_button)).setVisibility(View.VISIBLE);

        }
        isOperationClick = true;
    }

}
   


