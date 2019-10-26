package com.example.studentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Prof extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof);


        Button wallet,chat;

        wallet = findViewById(R.id.wallet);
        chat = findViewById(R.id.chat);
       Button internship = findViewById(R.id.internship);






        internship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Prof.this , Internship.class));

            }
        });



        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Prof.this , Wallet_2.class));

            }
        });


        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(Prof.this , Chat.class));
                    }
                },4000);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Toast.makeText(getApplicationContext(), "Connecting to consultant... ", Toast.LENGTH_SHORT).show();
                    }
                },0000);



                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Toast.makeText(getApplicationContext(), "Connected. ", Toast.LENGTH_SHORT).show();
                    }
                },3000);



            }
        });







    }
}
