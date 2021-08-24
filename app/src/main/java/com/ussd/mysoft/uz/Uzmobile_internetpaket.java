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

public class Uzmobile_internetpaket extends AppCompatActivity implements View.OnClickListener {

    private CardView uzmobile_1000;
    private CardView uzmobile_1500;
    private CardView uzmobile_3000;
    private CardView uzmobile_5000;
    private CardView uzmobile_8000;
    private CardView uzmobile_12000;
    private CardView uzmobile_16000;
    private CardView uzmobile_20000;
    private CardView uzmobile_30000;
    private CardView uzmobile_50000;
    private CardView uzmobile_75000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzmobile_internetpaket);
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

        uzmobile_1000=findViewById(R.id.uzmobile_1000);
        uzmobile_1000.setOnClickListener(this);
        uzmobile_1500=findViewById(R.id.uzmobile_1500);
        uzmobile_1500.setOnClickListener(this);
        uzmobile_3000=findViewById(R.id.uzmobile_3000);
        uzmobile_3000.setOnClickListener(this);
        uzmobile_5000=findViewById(R.id.uzmobile_5000);
        uzmobile_5000.setOnClickListener(this);
        uzmobile_8000=findViewById(R.id.uzmobile_8000);
        uzmobile_8000.setOnClickListener(this);
        uzmobile_12000=findViewById(R.id.uzmobile_12000);
        uzmobile_12000.setOnClickListener(this);
        uzmobile_16000=findViewById(R.id.uzmobile_16000);
        uzmobile_16000.setOnClickListener(this);
        uzmobile_20000=findViewById(R.id.uzmobile_20000);
        uzmobile_20000.setOnClickListener(this);
        uzmobile_30000=findViewById(R.id.uzmobile_30000);
        uzmobile_30000.setOnClickListener(this);
        uzmobile_50000=findViewById(R.id.uzmobile_50000);
        uzmobile_50000.setOnClickListener(this);
        uzmobile_75000=findViewById(R.id.uzmobile_75000);
        uzmobile_75000.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.uzmobile_1000:


                String cUssdubst1 = "147*10072*76447";
                String cToSendubst1= "tel:*" + cUssdubst1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst1)));
                }
                break;
            case R.id.uzmobile_1500:


                String cUssdubst2 = "147*10073*76447";
                String cToSendubst21= "tel:*" + cUssdubst2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst21)));
                }
                break;
            case R.id.uzmobile_3000:


                String cUssdubst3 = "147*10074*76447";
                String cToSendubst3= "tel:*" + cUssdubst3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst3)));
                }
                break;
            case R.id.uzmobile_5000:
                String cUssdubst4 = "147*10075*76447";
                String cToSendubst4= "tel:*" + cUssdubst4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst4)));
                }
                break;
            case R.id.uzmobile_8000:
                String cUssdubst5 = "147*10076*76447";
                String cToSendubst5= "tel:*" + cUssdubst5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst5)));
                }
                break;
            case R.id.uzmobile_12000:
                String cUssdubst6 = "147*10077*76447";
                String cToSendubst6= "tel:*" + cUssdubst6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst6)));
                }
                break;
            case R.id.uzmobile_16000:
                String cUssdubst7 = "147*10267*76447";
                String cToSendubst7= "tel:*" + cUssdubst7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst7)));
                }
                break;
            case R.id.uzmobile_20000:
                String cUssdubst8 = "147*10078*76447";
                String cToSendubst8= "tel:*" + cUssdubst8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst8)));
                }
                break;
            case R.id.uzmobile_30000:
                String cUssdubst9 = "147*10079*76447";
                String cToSendubst9= "tel:*" + cUssdubst9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst9)));
                }
                break;
            case R.id.uzmobile_50000:
                String cUssdubst10 = "147*10080*76447";
                String cToSendubst10= "tel:*" + cUssdubst10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst10)));
                }
                break;
            case R.id.uzmobile_75000:
                String cUssdubst11 = "147*10150*76447";
                String cToSendubst11= "tel:*" + cUssdubst11 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubst11)));
                }
                break;


        }


    }

}