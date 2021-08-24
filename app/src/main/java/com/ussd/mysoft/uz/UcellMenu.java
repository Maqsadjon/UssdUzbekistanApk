package com.ussd.mysoft.uz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;


public class UcellMenu extends AppCompatActivity implements View.OnClickListener {

    private CardView ussd_ucell;
    private CardView ucell_tarifrejalar;
    private CardView ucell_internetpaket;
    private CardView ucelldaqiqa;
    private CardView smsucell;
    private CardView ucellxizmatlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucell_menu);
        Toolbar toolbar = findViewById(R.id.toolbar_topbeel);
        ImageView arrow = toolbar.findViewById(R.id.backbeel);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setSupportActionBar(toolbar);
        setTitle("");
        initObjects();
        getWindow().setStatusBarColor(Color.parseColor("#AC89FB"));

    }
    @SuppressLint("WrongViewCast")



    private void initObjects(){

        ussd_ucell=findViewById(R.id.ussd_ucell);
        ucell_tarifrejalar=findViewById(R.id.ucell_tarifrejalar);
        ucell_internetpaket=findViewById(R.id.ucell_internetpaket);
        ucelldaqiqa=findViewById(R.id.ucelldaqiqa);
        smsucell=findViewById(R.id.smsucell);
        ucellxizmatlar=findViewById(R.id.ucellxizmatlar);
        ussd_ucell.setOnClickListener(this);
        ucell_tarifrejalar.setOnClickListener(this);
        ucell_internetpaket.setOnClickListener(this);
        ucelldaqiqa.setOnClickListener(this);
        smsucell.setOnClickListener(this);
        ucellxizmatlar.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ussd_ucell:


                startActivity(new Intent(UcellMenu.this,Ucell_ussd.class));

                break;
            case R.id.smsucell:

                startActivity(new Intent(UcellMenu.this,Ucell_sms.class));
                break;
            case R.id.ucell_internetpaket:

                startActivity(new Intent(UcellMenu.this,Ucell_internetpaket.class));
                break;
            case R.id.ucelldaqiqa:

                startActivity(new Intent(UcellMenu.this,Ucell_daqiqa.class));
                break;
            case R.id.ucell_tarifrejalar:

                startActivity(new Intent(UcellMenu.this,Ucell_tarifreja.class));
                break;
            case R.id.ucellxizmatlar:

                startActivity(new Intent(UcellMenu.this,Ucell_xizmatlar.class));
                break;


        }


    }
}
