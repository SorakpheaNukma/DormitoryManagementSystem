package com.example.dormitorymanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvNoAccount, tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Ánh xạ các thành phần từ layout XML
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvNoAccount = findViewById(R.id.tvNoAccount);
        tvRegister = findViewById(R.id.tvRegister);

        // Thiết lập sự kiện khi nhấn nút Đăng nhập
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đoạn mã xử lý khi nhấn nút Đăng nhập
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Ở đây bạn có thể thực hiện logic kiểm tra đăng nhập
                // Ví dụ đơn giản: Nếu email và password hợp lệ, chuyển hướng đến màn hình khác
                // Nếu không, hiển thị thông báo lỗi hoặc thực hiện các xử lý khác
                if (isValid(email, password)) {
                    // Ví dụ: Chuyển hướng đến màn hình chính
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Đóng Activity hiện tại sau khi chuyển hướng
                } else {
                    // Xử lý khi đăng nhập không thành công (vd: hiển thị thông báo lỗi)
                }
            }
        });

        // Thiết lập sự kiện khi nhấn vào TextView "Bạn chưa có tài khoản?"
        tvNoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi nhấn vào TextView "Bạn chưa có tài khoản?"
                // Ví dụ: Chuyển hướng đến màn hình đăng ký
                Intent intent = new Intent(login.this, sign_up.class);
                startActivity(intent);
            }
        });
    }

    // Hàm kiểm tra tính hợp lệ của thông tin đăng nhập (Bạn có thể thay đổi logic kiểm tra tại đây)
    private boolean isValid(String email, String password) {
        return !email.isEmpty() && !password.isEmpty();
    }
}

