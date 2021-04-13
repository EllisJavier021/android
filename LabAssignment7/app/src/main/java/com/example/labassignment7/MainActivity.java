package com.example.labassignment7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scanner inFile = new Scanner(this.getResources().openRawResource(R.raw.dogs));
        String name, breed;
        int age;
        float weight, height;
        while (inFile.hasNext( ) )
        {
            name = inFile.next();
            age = inFile.nextInt();
            breed = inFile.next();
            weight = inFile.nextFloat();
            height = inFile.nextFloat();

            Dog info = new Dog(name, age, breed, weight, height);
            dogs.add(info);
        }
    }

    public void recordClick(View view){
        Intent myIntent = new Intent(this, DogRecordsListActivty.class);
        Bundle dogsData = new Bundle();
        dogsData.putSerializable("dogsArrayList",(Serializable)dogs);
        myIntent.putExtra("dogsData", dogsData);
        startActivity(myIntent);
    }

    public void activityClick(View view){
        Intent in = new Intent(this, DogsActivity.class);
        Bundle dogsData = new Bundle();
        dogsData.putSerializable("dogsArrayList",(Serializable)dogs);
        in.putExtra("dogsData", dogsData);
        startActivity(in);

    }
}
