package com.example.merchandov2;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

import javax.security.auth.login.LoginException;


public class Login extends AppCompatActivity implements View.OnClickListener{
    Button b,b1,b2;
    String user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        super.onCreate(savedInstanceState);
//        EditText edit =  (EditText) findViewById(R.id.username);
//        user=edit.getText().toString();
//        pass=edit.getText().toString();
        b=findViewById(R.id.btn);
        b1=(Button)findViewById(R.id.forgotpassword);
        b2=(Button)findViewById(R.id.btn1);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(this,"forgot password?",Toast.LENGTH_SHORT).show();
//            }
//        });
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextInputEditText edit1 = (TextInputEditText) findViewById(R.id.username);
        TextInputEditText edit2 = (TextInputEditText) findViewById(R.id.password);
        user=edit1.getText().toString();
        pass=edit2.getText().toString();
        System.out.println(user);
        System.out.println(pass);
        switch (v.getId()){
            case R.id.forgotpassword:
                Toast.makeText(this,"Forgot The password",Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn1:
                Intent intent=new Intent(Login.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn:
                if (user.equals("uday") && pass.equals("Uday@177")){
                    Toast.makeText(this,"Welcome To Merchando "+user,Toast.LENGTH_SHORT).show();
                    Intent int1=new Intent(Login.this,MainActivity.class);
                    startActivity(int1);
                }
                else{
                    Toast.makeText(this,"Incorrect Credentials",Toast.LENGTH_SHORT).show();
                }
        }


    }
}