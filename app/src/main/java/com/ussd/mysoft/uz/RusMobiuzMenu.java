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


public class RusMobiuzMenu extends AppCompatActivity implements View.OnClickListener {

    private CardView ussd_ums;
    private CardView ums_tarifrejalar;
    private CardView ums_internetpaket;
    private CardView umsdaqiqa;
    private CardView smsums;
    private CardView umsxizmatlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_mobiuz_menu);
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
        getWindow().setStatusBarColor(Color.parseColor("#F83D34"));

    }
    @SuppressLint("WrongViewCast")

    private void initObjects(){

        ussd_ums=findViewById(R.id.ussd_ums);
        ums_tarifrejalar=findViewById(R.id.ums_tarifrejalar);
        ums_internetpaket=findViewById(R.id.ums_internetpaket);
        umsdaqiqa=findViewById(R.id.umsdaqiqa);
        smsums=findViewById(R.id.smsums);
        umsxizmatlar=findViewById(R.id.umsxizmatlar);
        ussd_ums.setOnClickListener(this);
        ums_tarifrejalar.setOnClickListener(this);
        ums_internetpaket.setOnClickListener(this);
        umsdaqiqa.setOnClickListener(this);
        smsums.setOnClickListener(this);
        umsxizmatlar.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ussd_ums:


                startActivity(new Intent(RusMobiuzMenu.this,RusMobiuz_ussd.class));

                break;
            case R.id.smsums:

                startActivity(new Intent(RusMobiuzMenu.this,RusMobiuz_sms.class));
                break;
            case R.id.ums_internetpaket:

                startActivity(new Intent(RusMobiuzMenu.this,RusMobiuz_internetpaket.class));
                break;
            case R.id.umsdaqiqa:

                startActivity(new Intent(RusMobiuzMenu.this,RusMobiuz_daqiqa.class));
                break;
            case R.id.ums_tarifrejalar:

                startActivity(new Intent(RusMobiuzMenu.this,RusMobiuz_tarifreja.class));
                break;
            case R.id.umsxizmatlar:

                startActivity(new Intent(RusMobiuzMenu.this,RusMobiuz_xizmatlar.class));
                break;


        }


    }
}
