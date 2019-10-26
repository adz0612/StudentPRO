package com.example.studentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Voucher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher);


        Button book = findViewById(R.id.button3);
        Button dominos = findViewById(R.id.buttton);

dominos.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/great-deals/gift-vouchers"));
        startActivity(i);
    }
});



        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://in.bookmyshow.com/offers/diwali-dhamaka-on-bookmyshow/DIWALI2019"));
                startActivity(i);

            }
        });
    }


}
