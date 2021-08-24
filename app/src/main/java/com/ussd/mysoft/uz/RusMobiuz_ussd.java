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

public class RusMobiuz_ussd extends AppCompatActivity implements View.OnClickListener {

    private CardView balans;
    private CardView mobiuz_internetqoldiq;
    private CardView mobiuz_daqqoldiq;
    private CardView mobiuz_smsqoldiq;
    private CardView mobiuz_mservise;
    private CardView mobiuz_4glte;
    private CardView mobiuz_qarzolish;
    private CardView mobiuz_reklamanitaqiqlash;
    private CardView mobiuz_mynumer;
    private CardView mobiuz_myrasxod;
    private CardView mobiuz_lastpay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_mobiuz_ussd);

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

        balans=findViewById(R.id.mobiuz_balans);
        balans.setOnClickListener(this);
        mobiuz_internetqoldiq=findViewById(R.id.mobiuz_internetqoldiq);
        mobiuz_internetqoldiq.setOnClickListener(this);
        mobiuz_daqqoldiq=findViewById(R.id.mobiuz_daqqoldiq);
        mobiuz_daqqoldiq.setOnClickListener(this);
        mobiuz_smsqoldiq=findViewById(R.id.mobiuz_smsqoldiq);
        mobiuz_smsqoldiq.setOnClickListener(this);
        mobiuz_mservise=findViewById(R.id.mobiuz_mservise);
        mobiuz_mservise.setOnClickListener(this);
        mobiuz_4glte=findViewById(R.id.mobiuz_4glte);
        mobiuz_4glte.setOnClickListener(this);
        mobiuz_qarzolish=findViewById(R.id.mobiuz_qarzolish);
        mobiuz_qarzolish.setOnClickListener(this);
        mobiuz_reklamanitaqiqlash=findViewById(R.id.mobiuz_reklamanitaqiqlash);
        mobiuz_reklamanitaqiqlash.setOnClickListener(this);
        mobiuz_mynumer=findViewById(R.id.mobiuz_mynumer);
        mobiuz_mynumer.setOnClickListener(this);
        mobiuz_myrasxod=findViewById(R.id.mobiuz_myrasxod);
        mobiuz_myrasxod.setOnClickListener(this);
        mobiuz_lastpay=findViewById(R.id.mobiuz_lastpay);
        mobiuz_lastpay.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.mobiuz_balans:


                String cUssd = "100";
                String cToSend = "tel:*" + cUssd + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSend)));
                }
                break;
            case R.id.mobiuz_internetqoldiq:


                String cUssdu1 = "102";
                String cToSendu1 = "tel:*" + cUssdu1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu1)));
                }
                break;

            case R.id.mobiuz_daqqoldiq:


                String cUssdu2 = "103";
                String cToSendu2 = "tel:*" + cUssdu2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu2)));
                }
                break;
            case R.id.mobiuz_smsqoldiq:


                String cUssdu3 = "104";
                String cToSendu3 = "tel:*" + cUssdu3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu3)));
                }
                break;
            case R.id.mobiuz_mservise:


                String cUssdu4 = "140";
                String cToSendu4 = "tel:*" + cUssdu4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu4)));
                }
                break;
            case R.id.mobiuz_4glte:


                String cUssdu5 = "222*1";
                String cToSendu5 = "tel:*" + cUssdu5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu5)));
                }
                break;

            case R.id.mobiuz_qarzolish:


                String cUssdu6 = "111*32";
                String cToSendu6 = "tel:*" + cUssdu6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu6)));
                }
                break;
            case R.id.mobiuz_reklamanitaqiqlash:


                String cUssdu7 = "111*0271";
                String cToSendu7 = "tel:*" + cUssdu7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu7)));
                }
                break;
            case R.id.mobiuz_mynumer:


                String cUssdu8 = "150";
                String cToSendu8 = "tel:*" + cUssdu8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu8)));
                }
                break;
            case R.id.mobiuz_myrasxod:


                String cUssdu9 = "111*025";
                String cToSendu9 = "tel:*" + cUssdu9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu9)));
                }
                break;
            case R.id.mobiuz_lastpay:


                String cUssdu10 = "111*015";
                String cToSendu10 = "tel:*" + cUssdu10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendu10)));
                }
                break;




        }


    }

}
