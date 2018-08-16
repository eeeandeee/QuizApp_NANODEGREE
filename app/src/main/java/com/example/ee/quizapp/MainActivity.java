package com.example.ee.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
//passing the data from the received player name input into second activity
    public void Q1 (View view){
       Intent pageintent = new Intent(MainActivity.this, PYK.class);
        EditText UN = findViewById(R.id.playerName);
        String username = UN.getEditableText().toString();
        pageintent.putExtra("name", username);
        MainActivity.this.startActivity(pageintent);
    }
}
