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

public class Uzmobile_daqiqa extends AppCompatActivity implements View.OnClickListener {

    private CardView uzmobile_minut100;
    private CardView uzmobile_minut300;
    private CardView uzmobile_minut600;
    private CardView uzmobile_minut1200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzmobile_daqiqa);

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

        uzmobile_minut100=findViewById(R.id.uzmobile_minut100);
        uzmobile_minut100.setOnClickListener(this);
        uzmobile_minut300=findViewById(R.id.uzmobile_minut300);
        uzmobile_minut300.setOnClickListener(this);
        uzmobile_minut600=findViewById(R.id.uzmobile_minut600);
        uzmobile_minut600.setOnClickListener(this);
        uzmobile_minut1200=findViewById(R.id.uzmobile_minut1200);
        uzmobile_minut1200.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.uzmobile_minut100:


                String cUssdubdaqiqa1 = "111*2*3*1";
                String cToSendubdaqiqa1= "tel:*" + cUssdubdaqiqa1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaqiqa1)));
                }
                break;
            case R.id.uzmobile_minut300:
                String cUssdubdaqiqa2 = "111*2*3*2";
                String cToSendubdaqiqa2= "tel:*" + cUssdubdaqiqa2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaqiqa2)));
                }
                break;
            case R.id.uzmobile_minut600:
                String cUssdubdaqiqa3 = "111*2*3*3";
                String cToSendubdaqiqa3= "tel:*" + cUssdubdaqiqa3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaqiqa3)));
                }
                break;
            case R.id.uzmobile_minut1200:
                String cUssdubdaqiqa4 = "111*2*3*4";
                String cToSendubdaqiqa4= "tel:*" + cUssdubdaqiqa4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaqiqa4)));
                }
                break;




        }


    }

}