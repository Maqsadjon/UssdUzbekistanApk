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

public class RusBeeline_internetpaket extends AppCompatActivity implements View.OnClickListener {

    private CardView beeline_internet1000;
    private CardView beeline_internet3000;
    private CardView beeline_internet6000;
    private CardView beeline_internet9000;
    private CardView beeline_internet12000;
    private CardView beeline_internet15000;
    private CardView beeline_internet20000;
    private CardView beeline_internet30000;
    private CardView beeline_internet75000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_beeline_internetpaket);

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

        beeline_internet1000=findViewById(R.id.beeline_internet1000);
        beeline_internet1000.setOnClickListener(this);
        beeline_internet3000=findViewById(R.id.beeline_internet3000);
        beeline_internet3000.setOnClickListener(this);
        beeline_internet6000=findViewById(R.id.beeline_internet6000);
        beeline_internet6000.setOnClickListener(this);
        beeline_internet9000=findViewById(R.id.beeline_internet9000);
        beeline_internet9000.setOnClickListener(this);
        beeline_internet12000=findViewById(R.id.beeline_internet12000);
        beeline_internet12000.setOnClickListener(this);
        beeline_internet15000=findViewById(R.id.beeline_internet15000);
        beeline_internet15000.setOnClickListener(this);
        beeline_internet20000=findViewById(R.id.beeline_internet20000);
        beeline_internet20000.setOnClickListener(this);
        beeline_internet30000=findViewById(R.id.beeline_internet30000);
        beeline_internet30000.setOnClickListener(this);
        beeline_internet75000=findViewById(R.id.beeline_internet75000);
        beeline_internet75000.setOnClickListener(this);




    }




    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.beeline_internet1000:


                String cUssdi1 = "1*1*0518";
                String cToSendi1 = "tel:*" + cUssdi1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi1)));
                }
                break;
            case R.id.beeline_internet3000:


                String cUssdi2 = "1*2*0518";
                String cToSendi2 = "tel:*" + cUssdi2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi2)));
                }
                break;

            case R.id.beeline_internet6000:


                String cUssdi3 = "1*3*0518";
                String cToSendi3 = "tel:*" + cUssdi3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi3)));
                }
                break;
            case R.id.beeline_internet9000:


                String cUssdi4 = "1*4*0518";
                String cToSendi4 = "tel:*" + cUssdi4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi4)));
                }
                break;
            case R.id.beeline_internet12000:


                String cUssdi5 = "1*5*0518";
                String cToSendi5 = "tel:*" + cUssdi5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi5)));
                }
                break;
            case R.id.beeline_internet15000:


                String cUssdi6 = "1*6*0518";
                String cToSendi6 = "tel:*" + cUssdi6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi6)));
                }
                break;
            case R.id.beeline_internet20000:


                String cUssdi7 = "1*7*0518";
                String cToSendi7 = "tel:*" + cUssdi7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi7)));
                }
                break;
            case R.id.beeline_internet30000:


                String cUssdi8 = "1*8*0518";
                String cToSendi8 = "tel:*" + cUssdi8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi8)));
                }
                break;
            case R.id.beeline_internet75000:


                String cUssdi9 = "1*9*0518";
                String cToSendi9 = "tel:*" + cUssdi9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusBeeline_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusBeeline_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendi9)));
                }
                break;


        }


    }

}
