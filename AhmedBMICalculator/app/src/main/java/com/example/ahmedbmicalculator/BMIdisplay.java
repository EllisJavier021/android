package com.example.ahmedbmicalculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BMIdisplay extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_idisplay);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        float height = intent.getFloatExtra("height",0);
        float weight = intent.getFloatExtra("weight",0);
        String calc = BMI.BMICalc(name, height, weight);
        TextView tv = (TextView) findViewById(R.id.textView5);
        tv.setText(calc);
    }

    public void goback(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
