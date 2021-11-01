package com.mobile.opapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends AppCompatActivity {
    private static  int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Lanchhomepage();
    }

    private void Lanchhomepage(){
        new Handler().postDelayed(new Runnable(){

            public void run(){




                Intent HomeItent=new Intent(Splash.this, Login.class);

                startActivity(HomeItent);
                //startActivityForResult(new Intent(Splash.this, PermissionActivity.class), 0);
                finish();

            }

        },SPLASH_TIME_OUT);
    }
}