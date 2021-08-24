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

public class Beeline_sms extends AppCompatActivity implements View.OnClickListener {

    private CardView beeline_sms20;
    private CardView beeline_sms50;
    private CardView beeline_sms100;
    private CardView beeline_sms500;
    private CardView beeline_sms1000;
    private CardView beeline_sms250;
    private CardView beeline_xsms25;
    private CardView beeline_xsms50;
    private CardView beeline_xsms100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beeline_sms);

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

        beeline_sms20=findViewById(R.id.beeline_sms20);
        beeline_sms50=findViewById(R.id.beeline_sms50);
        beeline_sms100=findViewById(R.id.beeline_sms100);
        beeline_sms500=findViewById(R.id.beeline_sms500);
        beeline_sms1000=findViewById(R.id.beeline_sms1000);
        beeline_sms250=findViewById(R.id.beeline_sms250);
        beeline_xsms25=findViewById(R.id.beeline_xsms25);
        beeline_xsms50=findViewById(R.id.beeline_xsms50);
        beeline_xsms100=findViewById(R.id.beeline_xsms100);
        beeline_sms20.setOnClickListener(this);
        beeline_sms50.setOnClickListener(this);
        beeline_sms100.setOnClickListener(this);
        beeline_sms500.setOnClickListener(this);
        beeline_sms1000.setOnClickListener(this);
        beeline_sms250.setOnClickListener(this);
        beeline_xsms25.setOnClickListener(this);
        beeline_xsms50.setOnClickListener(this);
        beeline_xsms100.setOnClickListener(this);



    }




    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.beeline_sms20:


                String cUssds1 = "110*161";
                String cToSends1 = "tel:*" + cUssds1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends1)));
                }
                break;
            case R.id.beeline_sms50:


                String cUssds2 = "110*162";
                String cToSends2 = "tel:*" + cUssds2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends2)));
                }
                break;
            case R.id.beeline_sms100:


                String cUssds10 = "110*044";
                String cToSends10 = "tel:*" + cUssds10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends10)));
                }
                break;
            case R.id.beeline_sms500:


                String cUssds4 = "110*045";
                String cToSends4 = "tel:*" + cUssds4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends4)));
                }
                break;
            case R.id.beeline_sms1000:


                String cUssds5 = "110*046";
                String cToSends5 = "tel:*" + cUssds5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends5)));
                }
                break;
            case R.id.beeline_sms250:


                String cUssds6 = "110*151";
                String cToSends6 = "tel:*" + cUssds6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends6)));
                }
                break;
            case R.id.beeline_xsms25:


                String cUssds7 = "110*041";
                String cToSends7 = "tel:*" + cUssds7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends7)));
                }
                break;
            case R.id.beeline_xsms50:


                String cUssds8 = "110*042";
                String cToSends8 = "tel:*" + cUssds8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends8)));
                }
                break;
            case R.id.beeline_xsms100:


                String cUssds9 = "110*043";
                String cToSends9 = "tel:*" + cUssds9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSends9)));
                }
                break;



        }


    }

}
