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

public class RusUzmobile_ussd extends AppCompatActivity implements View.OnClickListener {

    private CardView uzmobile_balans;
    private CardView uzmobile_mynomer;
    private CardView uzmobile_daqiqalimit;
    private CardView uzmobile_restart;
    private CardView uzmobile_4gyoqish;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_uzmobile_ussd);
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

        uzmobile_balans=findViewById(R.id.uzmobile_balans);
        uzmobile_balans.setOnClickListener(this);
        uzmobile_mynomer=findViewById(R.id.uzmobile_mynomer);
        uzmobile_mynomer.setOnClickListener(this);
        uzmobile_daqiqalimit=findViewById(R.id.uzmobile_daqiqalimit);
        uzmobile_daqiqalimit.setOnClickListener(this);
        uzmobile_restart=findViewById(R.id.uzmobile_restart);
        uzmobile_restart.setOnClickListener(this);
        uzmobile_4gyoqish=findViewById(R.id.uzmobile_4gyoqish);
        uzmobile_4gyoqish.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.uzmobile_balans:


                String cUssdubs1 = "107";
                String cToSendubs1= "tel:*" + cUssdubs1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUzmobile_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUzmobile_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubs1)));
                }
                break;
            case R.id.uzmobile_mynomer:


                String cUssdubs2 = "100*4";
                String cToSendubs2= "tel:*" + cUssdubs2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUzmobile_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUzmobile_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubs2)));
                }
                break;
            case R.id.uzmobile_daqiqalimit:


                String cUssdubs3 = "100*2";
                String cToSendubs3= "tel:*" + cUssdubs3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUzmobile_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUzmobile_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubs3)));
                }
                break;
            case R.id.uzmobile_restart:


                String cUssdubs4 = "555";
                String cToSendubs4= "tel:*" + cUssdubs4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUzmobile_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUzmobile_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubs4)));
                }
                break;

            case R.id.uzmobile_4gyoqish:


                String cUssdubs5 = "111*2*7*1";
                String cToSendubs5= "tel:*" + cUssdubs5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUzmobile_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUzmobile_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubs5)));
                }
                break;



        }


    }

}