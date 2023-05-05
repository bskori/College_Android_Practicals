package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username_editview;
    EditText password_edittext;
    Button signin_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String demo_user = "demouser";
        String demo_password = "demo@1234";

        username_editview = findViewById(R.id.edit_text_username);
        password_edittext = findViewById(R.id.edit_text_password);
        signin_btn = findViewById(R.id.btn_sign_in);

        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = username_editview.getText().toString();
                String password = password_edittext.getText().toString();

                if(username.equals(demo_user) && password.equals((demo_password))){

                    Toast.makeText(MainActivity.this, "Succesfully logged in.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), LoginMessage.class);
                    intent.putExtra("key_username","DemoUser");
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect credentials..", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}