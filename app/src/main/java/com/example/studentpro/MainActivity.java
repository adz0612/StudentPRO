package com.example.studentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signin,signup;

        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);
       TextView user = (TextView) findViewById(R.id.user);
        TextView pass = (TextView) findViewById(R.id.pass);

      String user_str = user.getText().toString();
      String pass_str = pass.getText().toString();




// Sign in

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });


        // Sign UP

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , SignUp.class));


            }
        });




    }
}
