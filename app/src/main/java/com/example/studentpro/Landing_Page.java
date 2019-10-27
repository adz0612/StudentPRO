package com.example.studentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import java.sql.BatchUpdateException;

public class Landing_Page extends AppCompatActivity {
     float i=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing__page);

        final TextView scrl2,scrl3,scrl4,scrl5,scrl6,scrl7,scrl8,scrl9,scrl10,progress_123;
        progress_123 = findViewById(R.id.Progress_123);

        final Button scrl1;
         scrl1 = findViewById(R.id.textView90);
        scrl2 = findViewById(R.id.textView91);
        scrl3 = findViewById(R.id.textView92);
        scrl4 = findViewById(R.id.textView93);
        scrl5 = findViewById(R.id.textView94);
        scrl6 = findViewById(R.id.textView95);
        scrl7 = findViewById(R.id.textView96);
        scrl8 = findViewById(R.id.textView97);
        scrl9 = findViewById(R.id.textView98);
        scrl10 = findViewById(R.id.textView99);









        scrl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                i++;


                float a = (i/10)*100;

                progress_123.setText(""+a+"%/100%");


scrl1.setEnabled(false);
scrl1.setText("Completed");

            }
        });



        scrl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scrl2.setEnabled(false);

                scrl2.setText("Completed");

i++;
                float a = (i/10)*100;
                progress_123.setText(""+a+"%/100%");

            }
        });
        scrl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrl3.setText("Completed");

                scrl3.setEnabled(false);
                i++;

                float a = (i/10)*100;
                progress_123.setText(""+a+"%/100%");

            }
        });
        scrl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrl4.setText("Completed");

                scrl4.setEnabled(false);
                i++;

                float a = (i/10)*100;
                progress_123.setText(""+a+"%/100%");

            }
        });
        scrl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrl5.setEnabled(false);
                scrl5.setText("Completed");

                i++;

                float a = (i/10)*100;
                progress_123.setText(""+a+"%/100%");

            }
        });
        scrl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrl6.setEnabled(false);
                scrl6.setText("Completed");

                i++;

                float a = (i/10)*100;
                progress_123.setText(""+a+"%/100%");

            }
        });
        scrl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrl7.setEnabled(false);
                scrl7.setText("Completed");

                i++;

                float a = (i/10)*100;
                progress_123.setText(""+a+"%/100%");

            }
        });
        scrl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrl8.setEnabled(false);
                scrl8.setText("Completed");

                i++;

                float a = (i/10)*100;
                progress_123.setText(""+a+"%/100%");

            }
        });
        scrl9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrl9.setEnabled(false);
                scrl9.setText("Completed");

                i++;

                float a = (i/10)*100;
                progress_123.setText(""+a+"%/100%");

            }
        });


     scrl10.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             scrl10.setEnabled(false);
             scrl10.setText("Completed");

             i++;

             float a = (i/10)*100;
             progress_123.setText(""+a+"%/100%");




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
