package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginMessage extends AppCompatActivity {

    TextView message_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_message);

        message_textview = findViewById(R.id.messsage_textview);

        Bundle bundle = getIntent().getExtras();

        String username = bundle.getString("key_username");

        if(username != null){
            message_textview.setText(username);
        }

    }
}