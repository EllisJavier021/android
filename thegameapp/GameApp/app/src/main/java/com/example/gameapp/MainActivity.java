package com.example.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayMessage1(View view) {
        Toast.makeText(getApplicationContext(), "You chose the POEM game", Toast.LENGTH_SHORT).show();
    }

    public void displayMessage2(View view) {
        Toast.makeText(getApplicationContext(), "You chose the LOTTERY game", Toast.LENGTH_SHORT).show();
    }
    public void displayMessage3(View view) {
        Toast.makeText(getApplicationContext(), "You chose the FORTUNE TELLER game", Toast.LENGTH_SHORT).show();
    }
    public void displayMessage4(View view) {
        Toast.makeText(getApplicationContext(), "You chose the MADLIBS game", Toast.LENGTH_SHORT).show();
    }
}
