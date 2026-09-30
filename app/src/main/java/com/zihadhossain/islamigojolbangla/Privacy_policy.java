package com.zihadhossain.islamigojolbangla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Privacy_policy extends AppCompatActivity {

    WebView pWebView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.privacy_policy);
        pWebView=findViewById(R.id.pWebView);


        pWebView.getSettings().setJavaScriptEnabled(true);
        pWebView.loadUrl("https://sites.google.com/view/islami-gojol-bangla/home");
    }
}