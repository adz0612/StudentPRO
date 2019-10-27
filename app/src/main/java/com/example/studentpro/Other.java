package com.example.studentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class Other extends AppCompatActivity {
private WebView mapps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);


        Button maps,other;

        maps = findViewById(R.id.button6);
        other = findViewById(R.id.button7);


        mapps = findViewById(R.id.mappss);



        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                WebSettings webSettings = mapps.getSettings();
                webSettings.setJavaScriptEnabled(true);
                mapps.setWebViewClient(new WebViewClient());
                mapps.loadUrl("https://www.google.com/maps/search/men+pg+near+me/@12.9300679,77.5275457,15z/data=!3m1!4b1");






            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebSettings webSettings = mapps.getSettings();
                webSettings.setJavaScriptEnabled(true);
                mapps.setWebViewClient(new WebViewClient());
mapps.loadUrl("https://www.google.com/maps/search/police+stations+near+me/@12.9300651,77.5012809,13z/data=!3m1!4b1");


            }
        });



    }
}
