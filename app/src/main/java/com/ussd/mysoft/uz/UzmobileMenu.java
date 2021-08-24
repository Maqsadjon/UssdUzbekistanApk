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


public class UzmobileMenu extends AppCompatActivity implements View.OnClickListener {

    private CardView ussd_uzmobile;
    private CardView uzmobile_tarifrejalar;
    private CardView uzmobile_internetpaket;
    private CardView uzmobiledaqiqa;
    private CardView smsuzmobile;
    private CardView uzmobilexizmatlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzmobile_menu);
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
        getWindow().setStatusBarColor(Color.parseColor("#4EBEFA"));

    }
    @SuppressLint("WrongViewCast")

    private void initObjects(){

        ussd_uzmobile=findViewById(R.id.ussd_uzmobile);
        uzmobile_tarifrejalar=findViewById(R.id.uzmobile_tarifrejalar);
        uzmobile_internetpaket=findViewById(R.id.uzmobile_internetpaket);
        uzmobiledaqiqa=findViewById(R.id.uzmobiledaqiqa);
        smsuzmobile=findViewById(R.id.smsuzmobile);
        uzmobilexizmatlar=findViewById(R.id.uzmobilexizmatlar);
        ussd_uzmobile.setOnClickListener(this);
        uzmobile_tarifrejalar.setOnClickListener(this);
        uzmobile_internetpaket.setOnClickListener(this);
        uzmobiledaqiqa.setOnClickListener(this);
        smsuzmobile.setOnClickListener(this);
        uzmobilexizmatlar.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ussd_uzmobile:


                startActivity(new Intent(UzmobileMenu.this,Uzmobile_ussd.class));

                break;
            case R.id.smsuzmobile:

                startActivity(new Intent(UzmobileMenu.this,Uzmobile_sms.class));
                break;
            case R.id.uzmobile_internetpaket:

                startActivity(new Intent(UzmobileMenu.this,Uzmobile_internetpaket.class));
                break;
            case R.id.uzmobiledaqiqa:

                startActivity(new Intent(UzmobileMenu.this,Uzmobile_daqiqa.class));
                break;
            case R.id.uzmobile_tarifrejalar:

                startActivity(new Intent(UzmobileMenu.this,Uzmobile_tarifreja.class));
                break;
            case R.id.uzmobilexizmatlar:

                startActivity(new Intent(UzmobileMenu.this,Uzmobile_xizmatlar.class));
                break;


        }


    }
}
