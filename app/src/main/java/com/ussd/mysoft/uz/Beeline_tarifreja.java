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

public class Beeline_tarifreja extends AppCompatActivity implements View.OnClickListener {

    private CardView beeline_tarifzor2;
    private CardView beeline_tarifzor6;
    private CardView beeline_tarifzor10;
    private CardView beeline_tarifallo;
    private CardView beeline_zor15;
    private CardView beeline_statussilver;
    private CardView beeline_statusNEWGOLD;
    private CardView beeline_statusnewplatini;
    private CardView beeline_oson10;
    private CardView beeline_CLICK;
    private CardView beeline_bolajon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beeline_tarifreja);

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

        beeline_tarifzor2=findViewById(R.id.beeline_tarifzor2);
        beeline_tarifzor2.setOnClickListener(this);
        beeline_tarifzor6=findViewById(R.id.beeline_tarifzor6);
        beeline_tarifzor6.setOnClickListener(this);
        beeline_tarifzor10=findViewById(R.id.beeline_tarifzor10);
        beeline_tarifzor10.setOnClickListener(this);
        beeline_tarifallo=findViewById(R.id.beeline_tarifallo);
        beeline_tarifallo.setOnClickListener(this);
        beeline_zor15=findViewById(R.id.beeline_zor15);
        beeline_zor15.setOnClickListener(this);
        beeline_statussilver=findViewById(R.id.beeline_statussilver);
        beeline_statussilver.setOnClickListener(this);
        beeline_statusNEWGOLD=findViewById(R.id.beeline_statusNEWGOLD);
        beeline_statusNEWGOLD.setOnClickListener(this);
        beeline_statusnewplatini=findViewById(R.id.beeline_statusnewplatini);
        beeline_statusnewplatini.setOnClickListener(this);
        beeline_oson10=findViewById(R.id.beeline_oson10);
        beeline_oson10.setOnClickListener(this);
        beeline_CLICK=findViewById(R.id.beeline_CLICK);
        beeline_CLICK.setOnClickListener(this);
        beeline_bolajon=findViewById(R.id.beeline_bolajon);
        beeline_bolajon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.beeline_tarifzor2:


                String cUssdtr1 = "110*36";
                String cToSendtr1 = "tel:*" + cUssdtr1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr1)));
                }
                break;
            case R.id.beeline_tarifzor6:


                String cUssdtr2 = "110*60";
                String cToSendtr2 = "tel:*" + cUssdtr2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr2)));
                }
                break;
            case R.id.beeline_tarifzor10:


                String cUssdtr3 = "110*38";
                String cToSendtr3 = "tel:*" + cUssdtr3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr3)));
                }
                break;
            case R.id.beeline_tarifallo:


                String cUssdtr4 = "110*40";
                String cToSendtr4 = "tel:*" + cUssdtr4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr4)));
                }
                break;
            case R.id.beeline_zor15:


                String cUssdtr5 = "110*39";
                String cToSendtr5 = "tel:*" + cUssdtr5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr5)));
                }
                break;
            case R.id.beeline_statussilver:


                String cUssdtr6 = "110*3";
                String cToSendtr6 = "tel:*" + cUssdtr6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr6)));
                }
                break;
            case R.id.beeline_statusNEWGOLD:


                String cUssdtr7 = "110*2";
                String cToSendtr7 = "tel:*" + cUssdtr7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr7)));
                }
                break;
            case R.id.beeline_statusnewplatini:


                String cUssdtr8 = "110*1";
                String cToSendtr8 = "tel:*" + cUssdtr8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr8)));
                }
                break;

            case R.id.beeline_oson10:


                String cUssdtr10 = "110*61";
                String cToSendtr10 = "tel:*" + cUssdtr10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr10)));
                }
                break;
            case R.id.beeline_CLICK:


                String cUssdtr11 = "110*22";
                String cToSendtr11 = "tel:*" + cUssdtr11 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr11)));
                }
                break;
            case R.id.beeline_bolajon:


                String cUssdtr12 = "110*538";
                String cToSendtr12 = "tel:*" + cUssdtr12 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendtr12)));
                }
                break;




        }


    }

}
