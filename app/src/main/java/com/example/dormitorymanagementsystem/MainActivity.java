package com.example.dormitorymanagementsystem;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView welcomeText;
    private Button signUpButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeText = findViewById(R.id.welcome_text);
        signUpButton = findViewById(R.id.signup_button);
        loginButton = findViewById(R.id.login_button);


    }
}