package com.example.syncwheelsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

      //  FirebaseDatabase database = FirebaseDatabase.getInstance();
      //  DatabaseReference myRef = database.getReference("message");
      // myRef.setValue("");


        Button save = findViewById(R.id.savebtn);
        Button clear = findViewById(R.id.clearbtn);
        Button back = findViewById(R.id.backbtn);


        //checkBOx
        CheckBox checkBox11 = findViewById(R.id.sunday_morning_checkbox);
        CheckBox checkBox12 = findViewById(R.id.sunday_noon_checkbox);
        CheckBox checkBox13 = findViewById(R.id.sunday_evening_checkbox);
        CheckBox checkBox21 = findViewById(R.id.monday_morning_checkbox);
        CheckBox checkBox22 = findViewById(R.id.monday_noon_checkbox);
        CheckBox checkBox23 = findViewById(R.id.monday_evening_checkbox);
        CheckBox checkBox31 = findViewById(R.id.tuesday_morning_checkbox);
        CheckBox checkBox32 = findViewById(R.id.tuesday_noon_checkbox);
        CheckBox checkBox33 = findViewById(R.id.tuesday_evening_checkbox);
        CheckBox checkBox41 = findViewById(R.id.wednesday_morning_checkbox);
        CheckBox checkBox42 = findViewById(R.id.wednesday_noon_checkbox);
        CheckBox checkBox43 = findViewById(R.id.wednesday_evening_checkbox);
        CheckBox checkBox51 = findViewById(R.id.thursday_morning_checkbox);
        CheckBox checkBox52 = findViewById(R.id.thursday_noon_checkbox);
        CheckBox checkBox53 = findViewById(R.id.thursday_evening_checkbox);
        CheckBox checkBox61 = findViewById(R.id.friday_morning_checkbox);
        CheckBox checkBox62 = findViewById(R.id.friday_noon_checkbox);
        CheckBox checkBox63 = findViewById(R.id.friday_evening_checkbox);
        CheckBox checkBox71 = findViewById(R.id.saturday_morning_checkbox);
        CheckBox checkBox72 = findViewById(R.id.saturday_noon_checkbox);
        CheckBox checkBox73 = findViewById(R.id.saturday_evening_checkbox);

        //admin and admin

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox11.isChecked()){
                    checkBox11.setEnabled(false);}
                if (checkBox12.isChecked()){
                    checkBox12.setEnabled(false);
                }   if (checkBox13.isChecked()){
                    checkBox13.setEnabled(false);
                }   if (checkBox21.isChecked()){
                    checkBox21.setEnabled(false);
                }   if (checkBox22.isChecked()){
                    checkBox22.setEnabled(false);
                }   if (checkBox23.isChecked()){
                    checkBox23.setEnabled(false);
                }   if (checkBox31.isChecked()){
                    checkBox31.setEnabled(false);
                }   if (checkBox32.isChecked()){
                    checkBox32.setEnabled(false);
                }   if (checkBox33.isChecked()){
                    checkBox33.setEnabled(false);
                }   if (checkBox41.isChecked()){
                    checkBox41.setEnabled(false);
                }   if (checkBox42.isChecked()){
                    checkBox42.setEnabled(false);
                }   if (checkBox43.isChecked()){
                    checkBox43.setEnabled(false);
                }   if (checkBox51.isChecked()){
                    checkBox51.setEnabled(false);
                }   if (checkBox52.isChecked()){
                    checkBox52.setEnabled(false);
                }   if (checkBox53.isChecked()){
                    checkBox53.setEnabled(false);
                }   if (checkBox61.isChecked()){
                    checkBox61.setEnabled(false);
                }   if (checkBox62.isChecked()){
                    checkBox62.setEnabled(false);
                }   if (checkBox63.isChecked()){
                    checkBox63.setEnabled(false);
                }   if (checkBox71.isChecked()){
                    checkBox71.setEnabled(false);
                }   if (checkBox72.isChecked()){
                    checkBox72.setEnabled(false);
                }   if (checkBox73.isChecked()){
                    checkBox73.setEnabled(false);
                }
            }

        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox11.isChecked() ||checkBox12.isChecked() ||checkBox13.isChecked() ||checkBox21.isChecked() ||checkBox22.isChecked() ||checkBox23.isChecked()|| checkBox31.isChecked()|| checkBox32.isChecked()|| checkBox33.isChecked()|| checkBox41.isChecked()|| checkBox42.isChecked()|| checkBox43.isChecked()|| checkBox51.isChecked()|| checkBox52.isChecked()|| checkBox53.isChecked()|| checkBox61.isChecked()|| checkBox62.isChecked()|| checkBox63.isChecked() || checkBox71.isChecked() || checkBox72.isChecked()||checkBox73.isChecked() ) {
                    checkBox11.setChecked(false);
                    checkBox12.setChecked(false);
                    checkBox13.setChecked(false);
                    checkBox21.setChecked(false);
                    checkBox22.setChecked(false);
                    checkBox23.setChecked(false);
                    checkBox31.setChecked(false);
                    checkBox32.setChecked(false);
                    checkBox33.setChecked(false);
                    checkBox41.setChecked(false);
                    checkBox42.setChecked(false);
                    checkBox43.setChecked(false);
                    checkBox51.setChecked(false);
                    checkBox52.setChecked(false);
                    checkBox53.setChecked(false);
                    checkBox61.setChecked(false);
                    checkBox62.setChecked(false);
                    checkBox63.setChecked(false);
                    checkBox71.setChecked(false);
                    checkBox72.setChecked(false);
                    checkBox73.setChecked(false);
                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });



    }
}