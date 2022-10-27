package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_info);

        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,PersonalInfoActivity.class);
            EditText mailIdTxt = findViewById(R.id.mailid_txt);
            String emailId = mailIdTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String passwordText = passwordTxt.getText().toString();
            EditText confirmTxt = findViewById(R.id.confirmpass_txt);
            String confirmPasswordText = confirmTxt.getText().toString();
            intent.putExtra("emailId", emailId);
            startActivity(intent);

        });
    }
}