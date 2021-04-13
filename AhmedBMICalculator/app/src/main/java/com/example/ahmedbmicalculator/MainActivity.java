package com.example.ahmedbmicalculator;

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
    public void bmiClick(View view){
        Intent intent = new Intent(this, BMIdisplay.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String name = editText.getText().toString();
        String msg1 = editText2.getText().toString();
        float height = Float.parseFloat(msg1);
        String msg2 = editText3.getText().toString();
        float weight = Float.parseFloat(msg2);
        intent.putExtra("name", name);
        intent.putExtra("height", height);
        intent.putExtra("weight", weight);
        startActivity(intent);
    }

    protected void onResume( ) {
        super.onResume( );
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("");
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setText("");
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        editText3.setText("");
    }


}
