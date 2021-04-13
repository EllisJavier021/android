package com.example.weightconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View view) {
        Toast.makeText(getApplicationContext(), "INVALID INPUT", Toast.LENGTH_SHORT).show();
    }
    public void clickConvert(View view){
        Intent intent = new Intent(this, results.class);
        EditText editText = findViewById(R.id.editText);
        String value = editText.getText().toString();
        double weight = Double.parseDouble(value);
        if(weight<=0 || weight==NULL){
            displayMessage(view);
        }
        else {
            intent.putExtra("weight", weight);
            startActivity(intent);
        }
    }
    protected void onResume(){
        super.onResume();
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
    }
}
