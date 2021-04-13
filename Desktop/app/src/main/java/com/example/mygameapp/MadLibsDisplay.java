package com.example.mygameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibsDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs_display);
        Intent intent = getIntent();

        String word1 = intent.getStringExtra("word1");


        String word2 = intent.getStringExtra("word2");

        String word3 = intent.getStringExtra("word3");

        String word4 = intent.getStringExtra("word4");

        String word5 = intent.getStringExtra("word5");

        String word6 = intent.getStringExtra("word6");

        String word7 = intent.getStringExtra("word7");

        int word8 = intent.getIntExtra("word8",0);

        String word9 = intent.getStringExtra("word9");

        String word10 = intent.getStringExtra("word10");

        String word11 = intent.getStringExtra("word11");

        String word12 = intent.getStringExtra("word12");

        String word13 = intent.getStringExtra("word13");

        String word14 = intent.getStringExtra("word14");

        String word15 = intent.getStringExtra("word15");

        String word16 = intent.getStringExtra("word16");

        String word17 = intent.getStringExtra("word17");

        String word18 = intent.getStringExtra("word18");

        String word19 = intent.getStringExtra("word19");

        String word20 = intent.getStringExtra("word20");

        int number2 = intent.getIntExtra("num2",0);

        int number3 = intent.getIntExtra("num3",0);

        String Madlibs = Game.AhmedMadLibs(word1,word2,word3,word4,word5,word6,word7,word8,word9,word10,word11,word12,word13,word14,word15,word16,word17,word18,word19,word20);
        //display the messages in a TextView
        TextView tv = (TextView) findViewById(R.id.textView5);
        tv.setText(Madlibs);
    }
}
