package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);

        Button back8Btn = findViewById(R.id.back9_btn);
        back8Btn.setOnClickListener(view -> {
            finish();
        });

        Button next8Btn = findViewById(R.id.next9_btn);
        next8Btn.setOnClickListener(view -> {
            Intent bankIntent = getIntent();
            Bundle bundle = bankIntent.getExtras();
            Intent creditCardIntent = new Intent(this,IdentityActivity.class);
            EditText cardNumberTxt = findViewById(R.id.cardnumber1_txt);
            String cardNumberText = cardNumberTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.cardholder_txt);
            String cardHolderText = cardHolderTxt.getText().toString();
            EditText expireTxt = findViewById(R.id.expire2_txt);
            String expireText = expireTxt.getText().toString();
            TextView cvvTxt = findViewById(R.id.cvv2_txt);
            String cvvText = cvvTxt.getText().toString();
            creditCardIntent.putExtras(bundle);
            creditCardIntent.putExtra("cardNumberText", cardNumberText);
            creditCardIntent.putExtra("cardHolderText", cardHolderText);
            creditCardIntent.putExtra("expireText", expireText);
            creditCardIntent.putExtra("cvvText", cvvText);
            startActivity(creditCardIntent);
        });


    }
}