package com.example.test;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class results extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent =getIntent();
        String name = intent.getStringExtra("name");
        double height = intent.getFloatExtra("height", 0);
        double weight = intent.getFloatExtra("weight", 0);

        String calc1 = calc.bmicalc(name, height, weight);

        TextView tv = findViewById(R.id.textView5);
        tv.setText(calc1);


    }
}
