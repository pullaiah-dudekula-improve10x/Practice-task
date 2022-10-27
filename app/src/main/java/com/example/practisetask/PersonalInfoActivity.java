package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Button backBtn = findViewById(R.id.back1_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
        Button next1Btn = findViewById(R.id.next2_btn);
        next1Btn.setOnClickListener(view -> {
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            Intent personalIntent = new Intent(this, AddressActivity.class);
            EditText userNameTxt = findViewById(R.id.username_txt);
            String userName = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.firstname_txt);
            String firstNameText = firstNameTxt.getText().toString();
            EditText lastnameTxt = findViewById(R.id.lastname_txt);
            String lastNameText = lastnameTxt.getText().toString();
            personalIntent.putExtras(bundle);
            personalIntent.putExtra("userName", userName);
            personalIntent.putExtra("firstNameText", firstNameText);
            personalIntent.putExtra("lastNameText", lastNameText);
            startActivity(personalIntent);

        });
    }
}