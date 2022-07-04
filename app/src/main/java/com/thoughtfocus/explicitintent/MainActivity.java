package com.thoughtfocus.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.edit1);
    }

    public void doSomething(View view) {
        Intent i1 = new Intent(this,SecondActivity.class);
        i1.putExtra("user",et1.getText().toString());
        startActivity(i1);
    }
}