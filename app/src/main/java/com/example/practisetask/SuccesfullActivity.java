package com.example.practisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SuccesfullActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succesfull);

        Intent identityIntent = getIntent();
        String emailId = identityIntent.getStringExtra("emailId");
        String userName = identityIntent.getStringExtra("userName");
        String firstNameText = identityIntent.getStringExtra("firstNameText");
        String lastNameText = identityIntent.getStringExtra("lastNameText");
        String apartmentText = identityIntent.getStringExtra("apartmentText");
        String streetText = identityIntent.getStringExtra("streetText");
        String cityText = identityIntent.getStringExtra("cityText");
        String stateText = identityIntent.getStringExtra("stateText");
        String countryText = identityIntent.getStringExtra("countryText");
        String dateOfBirthText = identityIntent.getStringExtra("dateOfBirthText");
        String placeOfBirthText = identityIntent.getStringExtra("placeOfBirthText");
        String companyText = identityIntent.getStringExtra("companyText");
        String totalText = identityIntent.getStringExtra("totalText");
        String designText = identityIntent.getStringExtra("designText");
        String bankNameText = identityIntent.getStringExtra("bankNameText");
        String accountHolderNameText = identityIntent.getStringExtra("accountHolderNameText");
        String accountNumberText = identityIntent.getStringExtra("accountNumberText");
        String cardNumberText = identityIntent.getStringExtra("cardNumberText");
        String cardHolderText = identityIntent.getStringExtra("cardHolderText");
        String expireText = identityIntent.getStringExtra("expireText");
        String cvvText = identityIntent.getStringExtra("cvvText");
        String ifscText = identityIntent.getStringExtra("ifscText");
        String aadharNumberText = identityIntent.getStringExtra("adharNumberText");
        String panNumberText = identityIntent.getStringExtra("panNumberText");
        TextView mailIdTxt = findViewById(R.id.emailId5_txt);
        mailIdTxt.setText(emailId);
        TextView userNameTxt = findViewById(R.id.username1_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.firstname1_txt);
        firstNameTxt.setText(firstNameText);
        TextView lastNameTxt = findViewById(R.id.lastname1_txt);
        lastNameTxt.setText(lastNameText);
        TextView apartmentTxt = findViewById(R.id.apartment1_txt);
        apartmentTxt.setText(apartmentText);
        TextView streetTxt = findViewById(R.id.streetname1_txt);
        streetTxt.setText(streetText);
        TextView cityTxt = findViewById(R.id.city1_txt);
        cityTxt.setText(cityText);
        TextView stateTxt = findViewById(R.id.state1_txt);
        stateTxt.setText(stateText);
        TextView countryTxt = findViewById(R.id.country1_txt);
        countryTxt.setText(countryText);
        TextView dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        dateOfBirthTxt.setText(dateOfBirthText);
        TextView placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
        placeOfBirthTxt.setText(placeOfBirthText);
        TextView companyTxt = findViewById(R.id.currentcompany1_txt);
        companyTxt.setText(companyText);
        TextView totalExperienceTxt = findViewById(R.id.total_experiance_txt);
        totalExperienceTxt.setText(totalText);
        TextView designationTxt = findViewById(R.id.designation1_txt);
        designationTxt.setText(designText);
        TextView bankNameTxt = findViewById(R.id.bankname_txt);
        bankNameTxt.setText(bankNameText);
        TextView accountHolderNameTxt = findViewById(R.id.accountholder_txt);
        accountHolderNameTxt.setText(accountHolderNameText);
        TextView accountNumberTxt = findViewById(R.id.accountnumber1_txt);
        accountNumberTxt.setText(accountNumberText);
        TextView ifscTxt = findViewById(R.id.ifsc_txt);
        ifscTxt.setText(ifscText);
        TextView panNumberTxt = findViewById(R.id.numberpan_txt);
        panNumberTxt.setText(panNumberText);
        TextView adharNumberTxt = findViewById(R.id.numberadhar_txt);
        adharNumberTxt.setText(aadharNumberText);
        TextView cardNumberTxt = findViewById(R.id.cardnumber1_txt);
        cardNumberTxt.setText(cardNumberText);
        TextView cardHolderTxt = findViewById(R.id.cardholder1_txt);
        cardHolderTxt.setText(cardHolderText);
        TextView expireTxt = findViewById(R.id.expire1_txt);
        expireTxt.setText(expireText);
        TextView cvvTxt = findViewById(R.id.cvv1_txt);
        cvvTxt.setText(cvvText);
    }
}
