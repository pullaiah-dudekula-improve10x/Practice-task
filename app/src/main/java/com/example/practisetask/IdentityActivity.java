package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);

        Button back7Btn = findViewById(R.id.back7_btn);
        back7Btn.setOnClickListener(view -> {
            finish();
        });
        Button next7Btn = findViewById(R.id.next7_btn);
        next7Btn.setOnClickListener(view -> {
            Intent creditCardIntent = getIntent();
            Bundle bundle = creditCardIntent.getExtras();
            Intent identityIntent =new Intent(this,SuccesfullActivity.class);
            EditText panNumberTxt = findViewById(R.id.pannumber_txt);
            String panNumberText = panNumberTxt.getText().toString();
            EditText aadharNumberTxt = findViewById(R.id.adharNumber_txt);
            String aadharNumberText = aadharNumberTxt.getText().toString();
            identityIntent.putExtras(bundle);
            identityIntent.putExtra("adharNumberText", aadharNumberText);
            identityIntent.putExtra("panNumberText",panNumberText);
            startActivity(identityIntent);
        });
    }
}