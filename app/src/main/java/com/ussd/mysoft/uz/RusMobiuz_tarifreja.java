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

public class RusMobiuz_tarifreja extends AppCompatActivity implements View.OnClickListener {

    private CardView mobiuz_chillalite;
    private CardView mobiuz_omad;
    private CardView mobiuz_shodlik;
    private CardView mobiuz_mobi20;
    private CardView mobiuz_mobi30;
    private CardView mobiuz_mobi40;
    private CardView mobiuz_mobi50;
    private CardView mobiuz_mobi70;
    private CardView mobiuz_mobi90;
    private CardView mobiuz_mobi110;
    private CardView mobiuz_mobi150;
    private CardView mobiuz_gapyoq;
    private CardView mobiuz_gapyoqpro;
    private CardView mobiuz_mobi25;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_mobiuz_tarifreja);
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

        mobiuz_chillalite=findViewById(R.id.mobiuz_chillalite);
        mobiuz_chillalite.setOnClickListener(this);
        mobiuz_omad=findViewById(R.id.mobiuz_omad);
        mobiuz_omad.setOnClickListener(this);
        mobiuz_shodlik=findViewById(R.id.mobiuz_shodlik);
        mobiuz_shodlik.setOnClickListener(this);
        mobiuz_mobi20=findViewById(R.id.mobiuz_mobi20);
        mobiuz_mobi20.setOnClickListener(this);
        mobiuz_mobi30=findViewById(R.id.mobiuz_mobi30);
        mobiuz_mobi30.setOnClickListener(this);
        mobiuz_mobi40=findViewById(R.id.mobiuz_mobi40);
        mobiuz_mobi40.setOnClickListener(this);
        mobiuz_mobi50=findViewById(R.id.mobiuz_mobi50);
        mobiuz_mobi50.setOnClickListener(this);
        mobiuz_mobi70=findViewById(R.id.mobiuz_mobi70);
        mobiuz_mobi70.setOnClickListener(this);
        mobiuz_mobi90=findViewById(R.id.mobiuz_mobi90);
        mobiuz_mobi90.setOnClickListener(this);
        mobiuz_mobi110=findViewById(R.id.mobiuz_mobi110);
        mobiuz_mobi110.setOnClickListener(this);
        mobiuz_mobi150=findViewById(R.id.mobiuz_mobi150);
        mobiuz_mobi150.setOnClickListener(this);
        mobiuz_gapyoq=findViewById(R.id.mobiuz_gapyoq);
        mobiuz_gapyoq.setOnClickListener(this);
        mobiuz_gapyoqpro=findViewById(R.id.mobiuz_gapyoqpro);
        mobiuz_gapyoqpro.setOnClickListener(this);
        mobiuz_mobi25=findViewById(R.id.mobiuz_mobi25);
        mobiuz_mobi25.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.mobiuz_chillalite:


                String cUssdutr1 = "171*042*011000253";
                String cToSendutr1= "tel:*" + cUssdutr1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr1)));
                }
                break;
            case R.id.mobiuz_omad:


                String cUssdutr2 = "171*043*011000253";
                String cToSendutr2= "tel:*" + cUssdutr2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr2)));
                }
                break;
            case R.id.mobiuz_shodlik:


                String cUssdutr3 = "171*125*011000253";
                String cToSendutr3= "tel:*" + cUssdutr3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr3)));
                }
                break;
            case R.id.mobiuz_mobi20:


                String cUssdutr4 = "171*120*011000253";
                String cToSendutr4= "tel:*" + cUssdutr4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr4)));
                }
                break;
            case R.id.mobiuz_mobi30:


                String cUssdutr5 = "171*128*011000253";
                String cToSendutr5= "tel:*" + cUssdutr5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr5)));
                }
                break;
            case R.id.mobiuz_mobi40:


                String cUssdutr6 = "171*122*011000253";
                String cToSendutr6= "tel:*" + cUssdutr6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr6)));
                }
                break;
            case R.id.mobiuz_mobi50:


                String cUssdutr7 = "171*129*011000253";
                String cToSendutr7= "tel:*" + cUssdutr7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr7)));
                }
                break;
            case R.id.mobiuz_mobi70:


                String cUssdutr8 = "171*131*011000253";
                String cToSendutr8= "tel:*" + cUssdutr8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr8)));
                }
                break;
            case R.id.mobiuz_mobi90:


                String cUssdutr9 = "171*132*011000253";
                String cToSendutr9= "tel:*" + cUssdutr9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr9)));
                }
                break;
            case R.id.mobiuz_mobi110:


                String cUssdutr10 = "171*133*011000253";
                String cToSendutr10= "tel:*" + cUssdutr10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr10)));
                }
                break;
            case R.id.mobiuz_mobi150:


                String cUssdutr11 = "171*134*011000253";
                String cToSendutr11 = "tel:*" + cUssdutr11 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr11)));
                }
                break;
            case R.id.mobiuz_gapyoq:


                String cUssdutr12 = "171*100*011000253";
                String cToSendutr12 = "tel:*" + cUssdutr12 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr12)));
                }
                break;
            case R.id.mobiuz_gapyoqpro:


                String cUssdutr13 = "171*101*011000253";
                String cToSendutr13 = "tel:*" + cUssdutr13 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr13)));
                }
                break;
            case R.id.mobiuz_mobi25:


                String cUssdutr14 = "171*102*011000253";
                String cToSendutr14 = "tel:*" + cUssdutr14 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendutr14)));
                }
                break;


        }


    }

}
