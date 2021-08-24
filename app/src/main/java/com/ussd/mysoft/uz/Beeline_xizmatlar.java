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

public class Beeline_xizmatlar extends AppCompatActivity implements View.OnClickListener {

    private CardView beeline_perezagruzka;
    private CardView beeline_xabardorbol;
    private CardView beeline_meningmusiqam;
    private CardView beeline_internetxizmat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beeline_xizmatlar);

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

        beeline_perezagruzka=findViewById(R.id.beeline_perezagruzka);
        beeline_perezagruzka.setOnClickListener(this);
        beeline_xabardorbol=findViewById(R.id.beeline_xabardorbol);
        beeline_xabardorbol.setOnClickListener(this);
        beeline_meningmusiqam=findViewById(R.id.beeline_meningmusiqam);
        beeline_meningmusiqam.setOnClickListener(this);
        beeline_internetxizmat=findViewById(R.id.beeline_internetxizmat);
        beeline_internetxizmat.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.beeline_perezagruzka:


                String cUssdxz1 = "5";
                String cToSendxz1 = "tel:*" + cUssdxz1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendxz1)));
                }
                break;
            case R.id.beeline_xabardorbol:


                String cUssdxz2 = "110*051";
                String cToSendxz2 = "tel:*" + cUssdxz2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendxz2)));
                }
                break;
            case R.id.beeline_meningmusiqam:


                String cUssdxz3 = "110*311";
                String cToSendxz3 = "tel:*" + cUssdxz3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendxz3)));
                }
                break;
            case R.id.beeline_internetxizmat:


                String cUssdxz4 = "110*181";
                String cToSendxz4 = "tel:*" + cUssdxz4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendxz4)));
                }
                break;





        }


    }

}
