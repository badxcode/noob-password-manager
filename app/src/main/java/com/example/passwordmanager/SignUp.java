package com.example.passwordmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    EditText Username, Password, Email, ID;
    Button signupBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Username = findViewById(R.id.usernameID);
        Password = findViewById(R.id.passwordID);
        Email = findViewById(R.id.emailID);
        ID = findViewById(R.id.idtextID);


        signupBtn = findViewById(R.id.signupButtonID);
    }

    public void signupinfo(View view) {

        String username = Username.getText().toString();
        String password = Password.getText().toString();
        String email = Email.getText().toString();
        String id = ID.getText().toString();

        userRegistration userInfo = new userRegistration(id, username, email, password);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference();
        root.child(id).setValue(userInfo);

        Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_SHORT).show();

        ID.setText("");
        Username.setText("");
        Password.setText("");
        Email.setText("");

    }
}