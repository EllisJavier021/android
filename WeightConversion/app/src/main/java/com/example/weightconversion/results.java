package com.example.weightconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        double weight = intent.getDoubleExtra("weight", 0);
        String convert = weightConvert.pounds(weight);
        TextView view = findViewById(R.id.textView2);
        view.setText(convert);

    }
    public void goBack(View View){
        Intent myintent = new Intent(this, MainActivity.class);
        startActivity(myintent);
    }

}
