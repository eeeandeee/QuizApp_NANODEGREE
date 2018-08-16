package com.example.ee.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class PYK extends AppCompatActivity {
    String username = "";
    int score = 0;

    //variables for score values


    // a check to receive passed values from one


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyk);
        }

    //calculating score value for question1
        public void answer1 (View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.option1A: {
                if (checked){
                    score += 25;
                }
            }
            break;
            case R.id.option1B: {
                    if (checked){
                        score += 0;
                    }
                }
                break;
            case R.id.option1C: {
                if (checked){
                    score += 0;
                }
            }
            break;
            case R.id.option1D: {
                if (checked){
                    score += 0;
                }
            }
            break;
    }

    }


    //calculation for question 2
 public void answer2 (View view) {
     boolean checked = ((CheckBox) view).isChecked();
     switch ((view.getId())) {
         case R.id.nok: {
             if (checked)
                 score = score + 13;
             else {
                 score += 0;
             }
             break;
         }
         case R.id.ban: {
             if (checked)
                 score += 0;

            break;
         }
         case R.id.sok: {
             if (checked)
                 score = score + 12;
             else {
                 score += 0;
             }
             break;
         }
     }
 }
//calculating score for question 3


    public void answer3(View view) {
        EditText editTextInput = findViewById(R.id.answer3);
        String text = editTextInput.getText().toString().trim();
        if (text.trim().equalsIgnoreCase("bugs"));

        {
            score = score + 25;
        }
    }
//Calculating for question 4

    public void answer4 (View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch ((view.getId())){
            case R.id.option4A:{
                if (checked){
                    score += 0;
                }
            }
            break;
            case R.id.option4B:{
                if (checked){
                    score += 0;
                }
            }
            break;
            case R.id.option4C:{
                if (checked){
                    score = score + 25;
                }
            }
            break;
            case R.id.option4D:{
                if (checked){
                    score += 0;
                }
            }
            break;
        }
    }

        //This controls the submit button to initiate the toast message
        public void submit (View view){
            Toast.makeText(this, "Dear " + username + ", you have a total score of " + score, Toast.LENGTH_LONG).show();
        }
    }
