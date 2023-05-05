package com.example.hellomessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView message_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        message_textview = findViewById(R.id.message_textview);

        Bundle bundle = getIntent().getExtras();

        String message = bundle.getString("key_message");

        message_textview.setText(message);
    }
}