package com.mobile.opapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class payementotion extends AppCompatActivity {
    CardView paymomo;
    CardView paycart;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payementotion);
        paymomo=findViewById(R.id.momo);
        paycart=findViewById(R.id.cart);

        paymomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeIten=new Intent(payementotion.this, Cotisations.class);
                startActivity(HomeIten);
            }
        });


        paycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeIten=new Intent(payementotion.this, payecard.class);
                startActivity(HomeIten);
            }
        });
    }
}