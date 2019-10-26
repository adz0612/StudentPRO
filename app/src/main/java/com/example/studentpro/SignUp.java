package com.example.studentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

Button signin , signup;
final TextView user_signup , user_sign_pass;
signin = findViewById(R.id.button2);
signup = findViewById(R.id.button);
user_signup = findViewById(R.id.user_signup);
user_sign_pass = findViewById(R.id.user_sign_pass);

String user_signup_str = user_signup.getText().toString();
String user_pass_str = user_signup.getText().toString();





 signin.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         startActivity(new Intent(SignUp.this , MainActivity.class));




     }
 });


 signup.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Toast.makeText(getApplicationContext(), "User Registered! ", Toast.LENGTH_LONG).show();

             }
         },2000);


     }
 });






    }
}
