package com.georgiancollege.week12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1TextField;
    private EditText number2TextField;
    private Button submitButton;
    private TextView finalLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Initialize", "We are inside our First View.");

        // getting the ids from the view
        number1TextField = findViewById(R.id.editTextNumber);
        number2TextField = findViewById(R.id.editTextNumber2);
        submitButton = findViewById(R.id.button);
        finalLabel = findViewById(R.id.textView2);

        // hide the label
        finalLabel.setVisibility(View.INVISIBLE);

        // submit button click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Listener", "Submit Button is clicked!");
                finalLabel.setVisibility(View.VISIBLE);

                try {
                    int num1 = Integer.parseInt(number1TextField.getText().toString());
                    int num2 = Integer.parseInt(number2TextField.getText().toString());
                    Log.d("NumberValues", "Number 1: " + num1);
                    Log.d("NumberValues", "Number 2: " + num2);

                    // create an object
                    TwoNumber twoNumber = new TwoNumber(num1, num2);
                    Log.d("ModelValue", twoNumber.toString());

                    // get sum value and display it
                    finalLabel.setText(String.format("%d + %d = %d", num1, num2, twoNumber.sum()));

                } catch (Exception e) {
                    finalLabel.setText("Please enter both the numbers!");
                }
            }
        });
    }
}