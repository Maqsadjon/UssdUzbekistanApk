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

public class Uzmobile_sms extends AppCompatActivity implements View.OnClickListener {

    private CardView uzmobile_sms50;
    private CardView uzmobile_sms100;
    private CardView uzmobile_sms10;
    private CardView uzmobile_smso50;
    private CardView uzmobile_smso200;
    private CardView uzmobile_smso500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzmobile_sms);

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

        uzmobile_sms50=findViewById(R.id.uzmobile_sms50);
        uzmobile_sms50.setOnClickListener(this);
        uzmobile_sms100=findViewById(R.id.uzmobile_sms100);
        uzmobile_sms100.setOnClickListener(this);
        uzmobile_sms10=findViewById(R.id.uzmobile_sms10);
        uzmobile_sms10.setOnClickListener(this);
        uzmobile_smso50=findViewById(R.id.uzmobile_smso50);
        uzmobile_smso50.setOnClickListener(this);
        uzmobile_smso200=findViewById(R.id.uzmobile_smso200);
        uzmobile_smso200.setOnClickListener(this);
        uzmobile_smso500=findViewById(R.id.uzmobile_smso500);
        uzmobile_smso500.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.uzmobile_sms50:


                String cUssdubsms1 = "111*2*19*1*1";
                String cToSendubsms1= "tel:*" + cUssdubsms1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubsms1)));
                }
                break;
            case R.id.uzmobile_sms100:


                String cUssdubsms2 = "111*2*19*2*1";
                String cToSendubsms2= "tel:*" + cUssdubsms2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubsms2)));
                }
                break;
            case R.id.uzmobile_sms10:


                String cUssdubsms3 = "111*2*1*1";
                String cToSendubsms3= "tel:*" + cUssdubsms3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubsms3)));
                }
                break;
            case R.id.uzmobile_smso50:


                String cUssdubsms4 = "111*2*1*2";
                String cToSendubsms4= "tel:*" + cUssdubsms4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubsms4)));
                }
                break;
            case R.id.uzmobile_smso200:


                String cUssdubsms5 = "111*2*1*3";
                String cToSendubsms5= "tel:*" + cUssdubsms5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubsms5)));
                }
                break;
            case R.id.uzmobile_smso500:


                String cUssdubsms6 = "111*2*1*4";
                String cToSendubsms6= "tel:*" + cUssdubsms6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubsms6)));
                }
                break;



        }


    }

}