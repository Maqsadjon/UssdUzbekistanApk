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

public class Beeline_ussd extends AppCompatActivity implements View.OnClickListener {

        private CardView balans;
        private CardView Mb;
        private CardView Sms;
        private CardView Daqiqa;
        private CardView mynomer;
        private CardView treja;
        private CardView qushxizmat;
        private CardView mbtarmoq;
        private CardView restart;
        private CardView qarz;
        private CardView ojidaniya;
        private CardView xizuchirish;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_beeline_ussd);

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
            getWindow().setStatusBarColor(Color.parseColor("#F6B71B"));

        }

    @SuppressLint("WrongViewCast")


        private void initObjects(){

            balans=findViewById(R.id.beeline_balans);
            Mb=findViewById(R.id.beeline_mb);
            Sms=findViewById(R.id.beeline_sms);
            Daqiqa=findViewById(R.id.beeline_daqiqa);
            mynomer=findViewById(R.id.beeline_mynomer);
            treja=findViewById(R.id.beeline_treja);
            qushxizmat=findViewById(R.id.beeline_qushxizmat);
            mbtarmoq=findViewById(R.id.beeline_mbtarmoq);
            restart=findViewById(R.id.beeline_restart);
            qarz=findViewById(R.id.beeline_qarz);
            ojidaniya=findViewById(R.id.beeline_ojidaniya);
            xizuchirish=findViewById(R.id.beeline_xizuchirish);
            ojidaniya.setOnClickListener(this);
            balans.setOnClickListener(this);
            Sms.setOnClickListener(this);
            Mb.setOnClickListener(this);
            qarz.setOnClickListener(this);
            Daqiqa.setOnClickListener(this);
            mynomer.setOnClickListener(this);
            treja.setOnClickListener(this);
            qushxizmat.setOnClickListener(this);
            mbtarmoq.setOnClickListener(this);
            restart.setOnClickListener(this);
            xizuchirish.setOnClickListener(this);


        }




        @Override
        public void onClick(View v) {

            switch (v.getId()){

                case R.id.beeline_balans:


                    String cUssd = "102";
                    String cToSend = "tel:*" + cUssd + Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend)));
                    }
                    break;
                case R.id.beeline_mb:

                    String cUssd1 = "103";
                    String cToSend1 = "tel:*" + cUssd1 + Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend1)));
                    }

                    break;
                case R.id.beeline_sms:

                    String cUssd2 = "105";
                    String cToSend2 = "tel:*" + cUssd2 + Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend2)));
                    }

                    break;
                case R.id.beeline_daqiqa:

                    String cUssd3 = "106";
                    String cToSend3 = "tel:*" + cUssd3 + Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend3)));
                    }
                    break;
                case R.id.beeline_mynomer:
                    String cUssd4 = "303";
                    String cToSend4 = "tel:*" + cUssd4 + Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend4)));
                    }


                    break;
                case R.id.beeline_treja:

                    String cUssd5 = "110*05";
                    String cToSend5 = "tel:*" + cUssd5+ Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend5)));
                    }
                    break;
                case R.id.beeline_qushxizmat:

                    String cUssd6 = "110*09";
                    String cToSend6 = "tel:*" + cUssd6+ Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend6)));
                    }
                    break;
                case R.id.beeline_mbtarmoq:

                    String cUssd7 = "101";
                    String cToSend7 = "tel:*" + cUssd7+ Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend7)));
                    }
                    break;
                case R.id.beeline_restart:

                    String cUssd8 = "5";
                    String cToSend8 = "tel:*" + cUssd8+ Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend8)));
                    }
                    break;
                case R.id.beeline_qarz:
                    String cUssd9 = "141";
                    String cToSend9 = "tel:*" + cUssd9+ Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend9)));
                    }
                    break;
                case R.id.beeline_ojidaniya:

                    String cUssd10 = "43";
                    String cToSend10 = "tel:*" + cUssd10+ Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend10)));
                    }
                    break;
                case R.id.beeline_xizuchirish:

                    String cUssd11 = "115";
                    String cToSend11 = "tel:*" + cUssd11+ Uri.encode("#");

                    if (ContextCompat.checkSelfPermission(Beeline_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Beeline_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                    }
                    else
                    {
                        startActivity(new Intent("android.intent.action.CALL",
                                Uri.parse(cToSend11)));
                    }
                    break;



            }


        }

    }
