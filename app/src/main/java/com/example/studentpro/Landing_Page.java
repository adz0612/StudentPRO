package com.example.studentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class Landing_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing__page);
        int i =0;
        TextView scrl2,scrl3,scrl4,scrl5,scrl6,scrl7,scrl8,scrl9;
        Button scrl1;
        scrl1 = findViewById(R.id.textView90);
        scrl2 = findViewById(R.id.textView91);
        scrl3 = findViewById(R.id.textView92);
        scrl4 = findViewById(R.id.textView93);
        scrl5 = findViewById(R.id.textView94);
        scrl6 = findViewById(R.id.textView95);
        scrl7 = findViewById(R.id.textView96);
        scrl8 = findViewById(R.id.textView97);
        scrl9 = findViewById(R.id.textView98);






        scrl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i =1;

                i++;
               int a = (i/9)*100;



                ProgressBar pb;
                pb = findViewById(R.id.progressBar);
                pb.setProgress(a);

            }
        });



























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
