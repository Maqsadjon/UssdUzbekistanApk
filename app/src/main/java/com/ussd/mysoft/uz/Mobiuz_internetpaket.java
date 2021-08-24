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

public class Mobiuz_internetpaket extends AppCompatActivity implements View.OnClickListener {

    private CardView mobiuz_paket300;
    private CardView mobiuz_paket500;
    private CardView mobiuz_paket1000;
    private CardView mobiuz_paket2000;
    private CardView mobiuz_paket3000;
    private CardView mobiuz_paket5000;
    private CardView mobiuz_paket10000;
    private CardView mobiuz_paket20000;
    private CardView mobiuz_paket30000;
    private CardView mobiuz_paket50000;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobiuz_internetpaket);

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

        mobiuz_paket300=findViewById(R.id.mobiuz_paket300);
        mobiuz_paket300.setOnClickListener(this);
        mobiuz_paket500=findViewById(R.id.mobiuz_paket500);
        mobiuz_paket500.setOnClickListener(this);
        mobiuz_paket1000=findViewById(R.id.mobiuz_paket1000);
        mobiuz_paket1000.setOnClickListener(this);
        mobiuz_paket2000=findViewById(R.id.mobiuz_paket2000);
        mobiuz_paket2000.setOnClickListener(this);
        mobiuz_paket3000=findViewById(R.id.mobiuz_paket3000);
        mobiuz_paket3000.setOnClickListener(this);
        mobiuz_paket5000=findViewById(R.id.mobiuz_paket5000);
        mobiuz_paket5000.setOnClickListener(this);
        mobiuz_paket10000=findViewById(R.id.mobiuz_paket10000);
        mobiuz_paket10000.setOnClickListener(this);
        mobiuz_paket20000=findViewById(R.id.mobiuz_paket20000);
        mobiuz_paket20000.setOnClickListener(this);
        mobiuz_paket30000=findViewById(R.id.mobiuz_paket30000);
        mobiuz_paket30000.setOnClickListener(this);
        mobiuz_paket50000=findViewById(R.id.mobiuz_paket50000);
        mobiuz_paket50000.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.mobiuz_paket300:


                String cUssduip1 = "171*019*1*011500323*1";
                String cToSenduip1= "tel:*" + cUssduip1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip1)));
                }
                break;
            case R.id.mobiuz_paket500:
                String cUssduip2 = "171*019*7*011500323*1";
                String cToSenduip2= "tel:*" + cUssduip2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip2)));
                }
                break;
            case R.id.mobiuz_paket1000:
                String cUssduip3 = "171*019*2*011500323*1";
                String cToSenduip3= "tel:*" + cUssduip3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip3)));
                }
                break;
            case R.id.mobiuz_paket2000:
                String cUssduip4 = "171*019*5*011500323*1";
                String cToSenduip4 = "tel:*" + cUssduip4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip4)));
                }
                break;

            case R.id.mobiuz_paket3000:
                String cUssduip5 = "171*019*3*011500323*1";
                String cToSenduip5 = "tel:*" + cUssduip5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip5)));
                }
                break;
            case R.id.mobiuz_paket5000:
                String cUssduip6 = "171*019*4*011500323*1";
                String cToSenduip6 = "tel:*" + cUssduip6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip6)));
                }
                break;
            case R.id.mobiuz_paket10000:
                String cUssduip7 = "171*019*6*011500323*1";
                String cToSenduip7 = "tel:*" + cUssduip7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip7)));
                }
                break;
            case R.id.mobiuz_paket20000:
                String cUssduip8 = "171*019*8*011500323*1";
                String cToSenduip8 = "tel:*" + cUssduip8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip8)));
                }
                break;

            case R.id.mobiuz_paket30000:
                String cUssduip9 = "171*019*9*011500323*1";
                String cToSenduip9 = "tel:*" + cUssduip9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip9)));
                }
                break;
            case R.id.mobiuz_paket50000:
                String cUssduip10 = "171*019*10*011500323*1";
                String cToSenduip10 = "tel:*" + cUssduip10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Mobiuz_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Mobiuz_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenduip10)));
                }
                break;



        }


    }

}
