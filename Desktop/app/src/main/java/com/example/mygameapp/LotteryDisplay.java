package com.example.mygameapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LotteryDisplay extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery_display);
        Intent intent = getIntent();

        int number1 = intent.getIntExtra("num1",0);

        int number2 = intent.getIntExtra("num2",0);

        int number3 = intent.getIntExtra("num3",0);

        String poem = Game.AhmedLottery(number1,number2,number3);
        //display the messages in a TextView
        TextView tv = (TextView) findViewById(R.id.textView4);
        tv.setText(poem);

    }

}
