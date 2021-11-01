package com.mobile.opapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class payecard extends AppCompatActivity {

Spinner spinner;

    Spinner spinnercot;

    Spinner spinnerannee;
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payecard);
         spinner=findViewById(R.id.spinnermois);
        spinnerannee=findViewById(R.id.spinnerannee);
        spinnercot=findViewById(R.id.spinnermoiscot);
         button=findViewById(R.id.btnpayerc);
         imageView=findViewById(R.id.backpaycart);
         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new SweetAlertDialog(payecard.this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Patientez svp")
                        .setContentText("Payement non effectué")
                        .setConfirmText("Ok")
                        .show();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });


        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.mois, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(genderSpinnerAdapter);




        ArrayAdapter genderSpinnerAdapters = ArrayAdapter.createFromResource(this, R.array.moiscot, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnercot.setAdapter(genderSpinnerAdapters);

        ArrayAdapter genderSpinnerAdapterss = ArrayAdapter.createFromResource(this, R.array.annecot, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerannee.setAdapter(genderSpinnerAdapterss);
    }
}