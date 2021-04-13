package com.example.mygameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MadLibsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);
    }
    public void MadLibs(View view){
        Intent intent = new Intent(this, MadLibsDisplay.class);

        EditText editText1 = findViewById(R.id.word1);
        EditText editText2 = findViewById(R.id.word2);
        EditText editText3 = findViewById(R.id.word3);
        EditText editText4 = findViewById(R.id.word4);
        EditText editText5 = findViewById(R.id.word5);
        EditText editText6 = findViewById(R.id.word6);
        EditText editText7 = findViewById(R.id.word7);
        EditText editText8 = findViewById(R.id.word8);
        EditText editText9 = findViewById(R.id.word9);
        EditText editText10 = findViewById(R.id.word10);
        EditText editText11 = findViewById(R.id.word11);
        EditText editText12 = findViewById(R.id.word12);
        EditText editText13 = findViewById(R.id.word13);
        EditText editText14 = findViewById(R.id.word14);
        EditText editText15 = findViewById(R.id.word15);
        EditText editText16 = findViewById(R.id.word16);
        EditText editText17 = findViewById(R.id.word17);
        EditText editText18 = findViewById(R.id.word18);
        EditText editText19 = findViewById(R.id.word19);
        EditText editText20 = findViewById(R.id.word20);
        String msg1 =  editText1.getText().toString();
        String msg2 =  editText2.getText().toString();
        String msg3 =  editText3.getText().toString();
        String msg4 =  editText4.getText().toString();
        String msg5 =  editText5.getText().toString();
        String msg6 =  editText6.getText().toString();
        String msg7 =  editText7.getText().toString();
        String msg8 =  editText8.getText().toString().trim();
        int num = Integer.parseInt(msg8);
        String msg9 =  editText9.getText().toString();
        String msg10 =  editText10.getText().toString();
        String msg11 =  editText11.getText().toString();
        String msg12 =  editText12.getText().toString();
        String msg13=  editText13.getText().toString();
        String msg14 =  editText14.getText().toString();
        String msg15 =  editText15.getText().toString();
        String msg16 =  editText16.getText().toString();
        String msg17 =  editText17.getText().toString();
        String msg18 =  editText18.getText().toString();
        String msg19 =  editText19.getText().toString();
        String msg20=  editText20.getText().toString();

        intent.putExtra("word1",msg1);
        intent.putExtra("word2", msg2);
        intent.putExtra("word3", msg3);
        intent.putExtra("word4", msg4);
        intent.putExtra("word5", msg5);
        intent.putExtra("word6", msg6);
        intent.putExtra("word7", msg7);
        intent.putExtra("word8", num);
        intent.putExtra("word9", msg9);
        intent.putExtra("word10", msg10);
        intent.putExtra("word11", msg11);
        intent.putExtra("word12", msg12);
        intent.putExtra("word13", msg13);
        intent.putExtra("word14", msg14);
        intent.putExtra("word15", msg15);
        intent.putExtra("word16", msg16);
        intent.putExtra("word17", msg17);
        intent.putExtra("word18", msg18);
        intent.putExtra("word19", msg19);
        intent.putExtra("word20", msg20);

        startActivity(intent);
    }
}

