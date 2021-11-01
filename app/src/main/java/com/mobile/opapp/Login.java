package com.mobile.opapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Login extends AppCompatActivity {

    Button button;
    EditText editText1,ED2;
    TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText1=findViewById(R.id.txtuser);
        ED2=findViewById(R.id.txtpass);
        button=findViewById(R.id.btnconnect);
        txtv=findViewById(R.id.btninscri);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String txt1=editText1.getText().toString().trim();
                String txt2=ED2.getText().toString().trim();


                if (txt1.isEmpty() && txt2.isEmpty()){

                    new SweetAlertDialog(Login.this, SweetAlertDialog.WARNING_TYPE)
                            .setTitleText("Attention")
                            .setContentText("Remplissez les champs vide svp")
                            .setConfirmText("Ok")
                            .show();


                }else if (txt1.equals("test") && txt2.equals("1234")){

                    Intent HomeIten=new Intent(Login.this, MainActivity.class);
                    startActivity(HomeIten);


                }else {

                    new SweetAlertDialog(Login.this, SweetAlertDialog.WARNING_TYPE)
                            .setTitleText("Attention")
                            .setContentText("Mot de passse incorrect")
                            .setConfirmText("ok")
                            .show();
                }


            }
        });

        txtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent HomeItesn=new Intent(Login.this, Register.class);
                startActivity(HomeItesn);
            }
        });

    }

}
