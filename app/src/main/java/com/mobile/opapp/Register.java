package com.mobile.opapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Register extends AppCompatActivity {


    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        spinner3=findViewById(R.id.spinnerprof);
        setupSpinnercommune();
        setupSpinnercommune2();
        setupSpinnercommune3();
        button=findViewById(R.id.btnsave);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeItesn=new Intent(Register.this, payementotion.class);
                startActivity(HomeItesn);

            }
        });
    }

    private void setupSpinnercommune()
    {

        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.cnop, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(genderSpinnerAdapter);
    }

    private void setupSpinnercommune2()
    {

        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.Tableau, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(genderSpinnerAdapter);
    }


    private void setupSpinnercommune3()
    {

        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.profession, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(genderSpinnerAdapter);
    }

}