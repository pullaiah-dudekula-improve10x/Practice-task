package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);

        Button back6Btn = findViewById(R.id.back6_btn);
        back6Btn.setOnClickListener(view -> {
            finish();
        });
        Button next6Btn = findViewById(R.id.next6_btn);
        next6Btn.setOnClickListener(view -> {
            Intent addressIntent = getIntent();
            Bundle bundle = addressIntent.getExtras();
            Intent birthIntent = new Intent(this,ProfessionalActivity.class);
            EditText dateOfBirthTxt = findViewById(R.id.dateof_bitrth_txt);
            String dateOfBirthText = dateOfBirthTxt.getText().toString();
            EditText placeOfBirthTxt = findViewById(R.id.placeof_birth_txt);
            String placeOfBirthText = placeOfBirthTxt.getText().toString();
            birthIntent.putExtras(bundle);
            birthIntent.putExtra("dateOfBirthText", dateOfBirthText);
            birthIntent.putExtra("placeOfBirthText", placeOfBirthText);
            startActivity(birthIntent);
        });
    }
}