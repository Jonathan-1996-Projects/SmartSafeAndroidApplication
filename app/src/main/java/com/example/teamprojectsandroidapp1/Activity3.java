package com.example.teamprojectsandroidapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class Activity3 extends AppCompatActivity {

    int newPin;

    EditText NewPinTF;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        NewPinTF = (EditText) findViewById(R.id.PinTextField);
        submitButton = (Button) findViewById((R.id.submitPin));
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newPin = Integer.valueOf(NewPinTF.getText().toString());

                showInput(String.valueOf(newPin));
            }
        });
    }

    /*
            Displays integer input on screen
             */
    private void showInput(String pin) {
        Toast.makeText(Activity3.this, pin, Toast.LENGTH_SHORT).show();
    }
}