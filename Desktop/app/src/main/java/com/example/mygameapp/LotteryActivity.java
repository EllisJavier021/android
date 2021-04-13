package com.example.mygameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LotteryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery);
    }
    public void lottery(View view){
        Intent intent = new Intent(this, LotteryDisplay.class);

        EditText editText1 = findViewById(R.id.num1);
        EditText editText2 = findViewById(R.id.num2);
        EditText editText3 = findViewById(R.id.num3);
        String message1 = editText1.getText().toString().trim();
        int number1 = Integer.parseInt(message1);
        String message2 = editText2.getText().toString().trim();
        int number2 = Integer.parseInt(message2);
        String message3 = editText3.getText().toString().trim();
        int number3 = Integer.parseInt(message3);
        intent.putExtra("num1", number1);
        intent.putExtra("num2", number2);
        intent.putExtra("num3", number3);
        startActivity(intent);
    }
}
