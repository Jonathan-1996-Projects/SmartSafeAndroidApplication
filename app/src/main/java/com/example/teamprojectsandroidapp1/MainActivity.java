package com.example.teamprojectsandroidapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int pin;

    private Button ALButton;//Activity Log button
    private Button PinButton;
    private Button UnlockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ALButton = (Button) findViewById(R.id.ALButton);
        ALButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        PinButton = (Button) findViewById(R.id.PinButton);
        PinButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        UnlockButton = (Button) findViewById(R.id.UnlockButton);
        UnlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //does nothing right now, need to get pin from pi on startup and send pin to pi on click
            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

}