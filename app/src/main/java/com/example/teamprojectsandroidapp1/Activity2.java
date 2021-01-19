package com.example.teamprojectsandroidapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity2 extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        webView = (WebView) findViewById(R.id.ServerWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://i.pinimg.com/originals/e1/59/f4/e159f454b9411d0e92b6395b52258606.gif");//Displays a website as fullscreen activity
    }

    @Override
    /*
    Instead of back button closing app, goes back on website when possible.
     */
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}