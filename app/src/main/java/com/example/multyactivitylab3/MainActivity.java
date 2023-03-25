package com.example.multyactivitylab3;

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

    public void onSendMessage(View view) {
        //EditText messageView = (EditText) findViewById(R.id.message);
        EditText msgBox = (EditText) findViewById(R.id.msgBox);
        // Get the text from the editable text field (messageView)
        String messageText = msgBox.getText().toString();

        //Intent intent = new Intent(this, ReceiveMessageActivity.class);

        // putExtra() puts extra information in an intent
        // "message is a String name for the value being passed in. value is the value"
        // putExtra() overloaded to value has many possible types

        /*
        //put massage data to intent object
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        intent.putExtra("message", messageText);
        */

        // Instead of creating an Intent that's explicitly for receivingMessageActivity, creating
        // an intent that uses a send action.
        Intent intent = new Intent(this, ReciveMassage.class);
        intent.putExtra("msg", messageText);

        startActivity(intent);
    }


}