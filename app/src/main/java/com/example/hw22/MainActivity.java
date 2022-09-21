package com.example.hw22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    TextView textView;
    EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button){
            if (editTextTextPersonName.getText().toString().contains("@")) {
                textView.setText("VALID");
            }
            else {
                textView.setText("NOT VALID");
            }
        }
    }

}