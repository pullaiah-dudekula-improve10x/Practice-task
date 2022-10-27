package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        Button back5Btn = findViewById(R.id.back5_btn);
        back5Btn.setOnClickListener(view -> {
            finish();
        });
        Button next5Btn = findViewById(R.id.next5_btn);
        next5Btn.setOnClickListener(view -> {
            Intent personalIntent = getIntent();
            Bundle bundle = personalIntent.getExtras();
            Intent addressIntent = new Intent(this,BirthDetailsActivity.class);
            EditText apartmentTxt = findViewById(R.id.apartment_txt);
            String apartmentText = apartmentTxt.getText().toString();
            EditText streetTxt = findViewById(R.id.street_txt);
            String streetText = streetTxt.getText().toString();
            EditText cityTxt = findViewById(R.id.city_txt);
            String cityText = cityTxt.getText().toString();
            EditText stateTxt = findViewById(R.id.state_txt);
            String stateText = stateTxt.getText().toString();
            EditText countryTxt = findViewById(R.id.country_txt);
            String countryText = countryTxt.getText().toString();
            addressIntent.putExtras(bundle);
            addressIntent.putExtra("apartmentText", apartmentText);
            addressIntent.putExtra("streetText", streetText);
            addressIntent.putExtra("cityText", cityText);
            addressIntent.putExtra("stateText", stateText);
            addressIntent.putExtra("countryText", countryText);
            startActivity(addressIntent);
        });
    }
}