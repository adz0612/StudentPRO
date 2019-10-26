package com.example.studentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Landing_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing__page);


Button proff, voucher , other;

proff = findViewById(R.id.proff);
        voucher = findViewById(R.id.vouch);

        other = findViewById(R.id.other);



        proff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Landing_Page.this , Prof.class));
                Toast.makeText(getApplicationContext(), "Switched to Professional Tab. ", Toast.LENGTH_LONG).show();






            }
        });

        voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Landing_Page.this , Voucher.class));
                Toast.makeText(getApplicationContext(), "Switched to Voucher Tab. ", Toast.LENGTH_LONG).show();

            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Landing_Page.this , Other.class));
                Toast.makeText(getApplicationContext(), "Switched to Other Tab. ", Toast.LENGTH_LONG).show();

            }
        });









    }
}
