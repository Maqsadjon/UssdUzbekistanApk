package com.ussd.mysoft.uz;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class RusMobiuz_daqiqa extends AppCompatActivity implements View.OnClickListener {

    private CardView mobiuz_daq60;
    private CardView mobiuz_daq120;
    private CardView mobiuz_daq180;
    private CardView mobiuz_daq300;
    private CardView mobiuz_daq900;
    private CardView mobiuz_daq1200;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_mobiuz_daqiqa);

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

        mobiuz_daq60=findViewById(R.id.mobiuz_daq60);
        mobiuz_daq60.setOnClickListener(this);
        mobiuz_daq120=findViewById(R.id.mobiuz_daq120);
        mobiuz_daq120.setOnClickListener(this);
        mobiuz_daq180=findViewById(R.id.mobiuz_daq180);
        mobiuz_daq180.setOnClickListener(this);
        mobiuz_daq300=findViewById(R.id.mobiuz_daq300);
        mobiuz_daq300.setOnClickListener(this);
        mobiuz_daq900=findViewById(R.id.mobiuz_daq900);
        mobiuz_daq900.setOnClickListener(this);
        mobiuz_daq1200=findViewById(R.id.mobiuz_daq1200);
        mobiuz_daq1200.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.mobiuz_daq60:


                String cUssduip1 = "171*103*60*011000253";
                String cToSenduip1= "tel:*" + cUssduip1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip1)));
                }
                break;
            case R.id.mobiuz_daq120:


                String cUssduip2 = "171*103*120*011000253";
                String cToSenduip2= "tel:*" + cUssduip2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip2)));
                }
                break;
            case R.id.mobiuz_daq180:


                String cUssduip3 = "171*103*180*011000253";
                String cToSenduip3= "tel:*" + cUssduip3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip3)));
                }
                break;
            case R.id.mobiuz_daq300:


                String cUssduip4 = "171*180*300*011000253";
                String cToSenduip4= "tel:*" + cUssduip4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip4)));
                }
                break;
            case R.id.mobiuz_daq900:


                String cUssduip5 = "171*103*900*011000253";
                String cToSenduip5= "tel:*" + cUssduip5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip5)));
                }
                break;
            case R.id.mobiuz_daq1200:


                String cUssduip6 = "171*103*1200*011000253";
                String cToSenduip6= "tel:*" + cUssduip6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip6)));
                }
                break;




        }


    }

}