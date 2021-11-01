package com.mobile.opapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Cotisations extends AppCompatActivity {
ImageView view;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotisations);

       // view=findViewById(R.id.backcotisation);

       Spinner spinner=findViewById(R.id.spinnermoismo);
        Spinner spinners=findViewById(R.id.spinnermoiscote);
        Spinner spinnerss=findViewById(R.id.spinneranneee);


        button=findViewById(R.id.btnpayer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new SweetAlertDialog(Cotisations.this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Patientez svp")
                        .setContentText("Payement non effectué")
                        .setConfirmText("Ok")
                        .show();
            }
        });


        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.mois, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(genderSpinnerAdapter);


        ArrayAdapter genderSpinnerAdapters = ArrayAdapter.createFromResource(this, R.array.moiscot, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinners.setAdapter(genderSpinnerAdapters);

        ArrayAdapter genderSpinnerAdapterss = ArrayAdapter.createFromResource(this, R.array.annecot, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerss.setAdapter(genderSpinnerAdapterss);
    }


}