package com.example.merchandov2;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

public class SignIn extends AppCompatActivity implements View.OnClickListener{
    Button b;
//    FirebaseDatabase rootNode;
//    DatabaseReference reference;
    EditText uname,num,ema,pass,ag;
    RadioGroup rg;
    String team;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);



//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
//                RadioButton rb= (RadioButton) findViewById(checkedId);
//                team = rb.getText().toString();
//            }
//        });


        setContentView(R.layout.activity_sign_in);
        b=(Button)findViewById(R.id.register);

        b.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
//        rootNode = FirebaseDatabase.getInstance("https://merchando-44046-default-rtdb.firebaseio.com/");
//        reference = rootNode.getReference("user");
//        uname=(EditText)findViewById(R.id.name);
//        num=(EditText)findViewById(R.id.numb);
//        ema=(EditText)findViewById(R.id.email);
//        pass=(EditText)findViewById(R.id.password);
//        ag=(EditText)findViewById(R.id.age);
//
//        //values
//
//        String user=uname.getText().toString();
//        String numb=num.getText().toString();
//        String email=ema.getText().toString();
//        String password=pass.getText().toString();
//        String age=ag.getText().toString();
//
//        user_reg_details helper=new user_reg_details(user,numb,email,age,password,"");
//
//        reference.setValue(helper);
            Toast.makeText(this,"Data Saved Successfully",Toast.LENGTH_SHORT).show();
            Intent int1=new Intent(SignIn.this,HomePage.class);
            startActivity(int1);
    }
}