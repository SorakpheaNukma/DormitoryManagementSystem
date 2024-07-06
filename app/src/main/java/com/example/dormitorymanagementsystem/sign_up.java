package com.example.dormitorymanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sign_up extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName, editTextEmail, editTextPhone, editTextPassword, editTextConfirmPassword;
    private Button btnRegister;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        // Ánh xạ các thành phần trong giao diện
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
        tvLogin = findViewById(R.id.tvLogin);

        // Xử lý sự kiện khi nhấn nút Đăng ký
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Thực hiện đăng ký, có thể xử lý logic đăng ký tài khoản ở đây

                // Sau khi đăng ký thành công, có thể chuyển sang màn hình đăng nhập
                // Ví dụ đơn giản là chuyển về MainActivity khi nhấn nút Đăng ký thành công
                Intent intent = new Intent(sign_up.this, MainActivity.class);
                startActivity(intent);
                finish(); // Đóng SignUpActivity sau khi chuyển sang MainActivity
            }
        });

        // Xử lý sự kiện khi nhấn vào văn bản Đăng nhập
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình đăng nhập khi nhấn vào văn bản Đăng nhập
                Intent intent = new Intent(sign_up.this, login.class);
                startActivity(intent);
                finish(); // Đóng SignUpActivity sau khi chuyển sang LoginActivity
            }
        });

    }
}

