package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usernameEditText;
    EditText passwordEditText;
    Button submitbutton;
    //database
    String goodUsername = "Gagan";
    String goodpassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        submitbutton = findViewById(R.id.submit);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable usernameEditable = usernameEditText.getText();
                String username = usernameEditable.toString();
                Editable passwordEditable = passwordEditText.getText();
                String password = passwordEditable.toString();
                System.out.println();
                if (username.equals(goodUsername)&& password.equals(goodpassword))
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("username",username);
                startActivity(intent);
            }
            }
        });
    }
}

