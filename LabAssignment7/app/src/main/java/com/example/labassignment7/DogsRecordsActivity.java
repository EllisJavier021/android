package com.example.labassignment7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DogsRecordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs_records2);

        Intent myIntent = getIntent();
        Bundle args = myIntent.getBundleExtra("dogsData");
        assert args != null;
        ArrayList<Dog> dogs = (ArrayList<Dog>)args.getSerializable("dogsArrayList");
        TextView myView = findViewById(R.id.textView);

        myView.setText("");
        for(Dog d: dogs){
            myView.append(d.toString());
            myView.append("\n\n");
        }
    }
}
