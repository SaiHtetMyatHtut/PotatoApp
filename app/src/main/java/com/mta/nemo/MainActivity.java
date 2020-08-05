package com.mta.nemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usrname,usrpasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usrname = findViewById(R.id.usrname);
        usrpasswd = findViewById(R.id.passwd);
    }

    public void Login(View view) {
        String name = usrname.getText().toString();
        String password = usrpasswd.getText().toString();
        if (name.equals("Admin") && password.equals("123456")){
            Intent toHome = new Intent(MainActivity.this,Home.class);
            startActivity(toHome);
        }else{
            Toast.makeText(MainActivity.this, "Invalid UserName Or Password", Toast.LENGTH_SHORT).show();
        }
    }

    public void Register(View view) {
        Intent toRegister = new Intent(MainActivity.this,Register.class);
        startActivity(toRegister);
    }
}