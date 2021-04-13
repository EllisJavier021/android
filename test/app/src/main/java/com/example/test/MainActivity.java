package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view){

        Intent intent = new Intent(this, results.class);
        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);

        String name = editText.getText().toString();
        String name2 = editText2.getText().toString();
        String name3 = editText3.getText().toString();
        float height = Float.parseFloat(name2);
        float weight = Float.parseFloat(name3);

        intent.putExtra("name", name);
        intent.putExtra("height", height);
        intent.putExtra("weight", weight);
        startActivity(intent);


    }
}
