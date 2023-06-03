package com.example.passwordmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {

    Button signinButton, signupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signin(View view) {
        signinButton = findViewById(R.id.signinButtonID);

        Intent myIntent = new Intent(this, SignIn.class);
        startActivity(myIntent);
    }

    public void signup(View view) {
        signupButton = findViewById(R.id.signupButtonID);

        Intent myIntent = new Intent(this, SignUp.class);
        startActivity(myIntent);
    }
}