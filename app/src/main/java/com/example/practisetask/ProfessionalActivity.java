package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);
        Button back2Btn = findViewById(R.id.back2_btn);
        back2Btn.setOnClickListener(view -> {
            finish();
        });
        Button next2Btn = findViewById(R.id.next2_btn);
        next2Btn.setOnClickListener(view -> {
            Intent birthIntent = getIntent();
            Bundle bundle = birthIntent.getExtras();
            Intent professionalIntent  = new Intent(this,BankAccountActivity.class);
            EditText companyTxt = findViewById(R.id.company_txt);
            String companyText = companyTxt.getText().toString();
            EditText totalTxt = findViewById(R.id.total_txt);
            String totalText = totalTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designText = designationTxt.getText().toString();
            professionalIntent.putExtras(bundle);
            professionalIntent.putExtra("companyText", companyText);
            professionalIntent.putExtra("totalText", totalText);
            professionalIntent.putExtra("designText", designText);
            startActivity(professionalIntent);
        });
    }
}