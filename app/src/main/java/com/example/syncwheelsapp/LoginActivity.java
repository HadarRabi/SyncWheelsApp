package com.example.syncwheelsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        Button login = findViewById(R.id.loginbtn);

        //admin and admin

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("hadar") && password.getText().toString().equals("0532829792")){
                    //correct
                    Toast.makeText(getApplicationContext(),"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                }else
                    //incorrect
                    Toast.makeText(getApplicationContext(),"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
