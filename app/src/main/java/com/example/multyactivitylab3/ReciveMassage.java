package com.example.multyactivitylab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReciveMassage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_massage);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        System.out.println(msg);
        TextView msgBox = (TextView) findViewById(R.id.resciveMsgBox);
        msgBox.setText(msg);

    }

}