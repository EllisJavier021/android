package com.example.labassignment7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class DogRecordsListActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_records_list_activty);
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("dogsData");
        ArrayList<Dog> dogs = (ArrayList<Dog>) args.getSerializable("dogsArrayList");

        RecyclerView rv = findViewById(R.id.dogsList);
        DividerItemDecoration decoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        rv.addItemDecoration(decoration);

        rv.setHasFixedSize(true);

        rv.setLayoutManager(new LinearLayoutManager(this));

        DogsAdapter adapter = new DogsAdapter(dogs);

        rv.setAdapter(adapter);

    }
}
