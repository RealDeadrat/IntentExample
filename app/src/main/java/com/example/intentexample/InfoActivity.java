package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(My_NAME);
        String myAge = intent.getStringExtra(My_AGE);

        String strToDisplay = "My name is " + myName + " and I am " + myAge + " years old.";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }

    public static final String My_NAME = "name";
    public static final String My_AGE = "age";

}
