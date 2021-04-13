package com.example.labassignment7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.math.*;

import java.util.ArrayList;

public class DogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);

        Intent in = getIntent();
        Bundle args = in.getBundleExtra("dogsData");
        ArrayList<Dog> dogs = (ArrayList<Dog>)args.getSerializable("dogsArrayList");
        TextView myView = (TextView)findViewById(R.id.textView2);

        myView.setText("");
        for(int i = 0; i<6; i++) {
            String tmp = dogs.get((int) (Math.random() * 48)).bark();
            myView.append(tmp);
            myView.append("\n\n");
        }

        for(int i = 0; i<6; i++){
            String tmp = dogs.get((int)(Math.random()*48)).growl();
            myView.append(tmp);
            myView.append("\n\n");
        }
    }
}
