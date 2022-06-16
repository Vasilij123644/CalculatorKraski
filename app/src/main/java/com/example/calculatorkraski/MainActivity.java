package com.example.calculatorkraski;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText, editText2, editText3, editText4, editText5;
    RadioButton radioButton, radioButton2, radioButton3;
    TextView textView;
    double square = 0;
    double ParametrsPaint = 0;
    double Reserve = 0;
    char v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumberPassword);
        editText2 = findViewById(R.id.editTextNumberPassword2);
        editText3 = findViewById(R.id.editTextNumberPassword3);
        editText4 = findViewById(R.id.editTextNumberPassword4);
        editText5 = findViewById(R.id.editTextNumberPassword5);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        textView = findViewById(R.id.textView9);
    }
    public void Button(View view){
        square = Double.parseDouble(editText.getText().toString()) * Double.parseDouble(editText2.getText().toString());

        textView.setText(Double.toString(square));
    }
}