package com.mobile.opapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cpro extends AppCompatActivity {


    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpro);

        cardView=findViewById(R.id.kinshaa);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent HomeIten=new Intent(Cpro.this, cpKin.class);
                startActivity(HomeIten);
            }
        });
    }
}