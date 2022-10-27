package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        Intent professionalIntent = getIntent();
        Bundle bundle = professionalIntent.getExtras();
        Button back3Btn = findViewById(R.id.back3_btn);
        back3Btn.setOnClickListener(view -> {
            finish();
        });
        Button next3Btn = findViewById(R.id.next3_btn);
        next3Btn.setOnClickListener(view -> {

            EditText bankNameTxt = findViewById(R.id.bank_name_txt);
            String bankNameText = bankNameTxt.getText().toString();
            EditText accountHolderNameTxt = findViewById(R.id.accountholder_name_txt);
            String accountHolderNameText = accountHolderNameTxt.getText().toString();
            EditText accountNumberTxt = findViewById(R.id.accountnumber_txt);
            String accountNumberText = accountNumberTxt.getText().toString();
            EditText ifscCode = findViewById(R.id.ifsc_code_txt);
            String ifscText = ifscCode.getText().toString();
            Intent bankIntent = new Intent(this, CreditCardDetailsActivity.class);
            bankIntent.putExtras(bundle);
            bankIntent.putExtra("bankNameText", bankNameText);
            bankIntent.putExtra("accountHolderNameText", accountHolderNameText);
            bankIntent.putExtra("accountNumberText", accountNumberText);
            bankIntent.putExtra("ifscText", ifscText);
            startActivity(bankIntent);
        });
    }
}