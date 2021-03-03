package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class loginScreen extends AppCompatActivity {
    EditText FirstNameEt;
    EditText passEt;
    EditText lastEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        
        init();
        getDetails();
    }

    private void getDetails() {
        String firstname=FirstNameEt.getText().toString();
        String lastname=lastEt.getText().toString();
        String password=passEt.getText().toString();

        if (firstname.isEmpty()){
            FirstNameEt.setError("Firstname Required");
        }
        else if (lastname.isEmpty()){
            lastEt.setError("Lastname Required");
        }
        else if (password.isEmpty()){
            passEt.setError("Password Required");
        }
        else{
            Intent nextscreen = new Intent(loginScreen.this,SingupScreen.class);
            startActivity(nextscreen);
        }
    }

    private void init() {
        FirstNameEt=findViewById(R.id.FirstNameEt);
        passEt=findViewById(R.id.passEt);
        lastEt=findViewById(R.id.lastEt);
    }

    public void login01(View view) {
        getDetails();


    }
}
