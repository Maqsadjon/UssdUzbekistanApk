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

public class Beeline_daqiqa extends AppCompatActivity implements View.OnClickListener {

    private CardView beeline_daqextra200;
    private CardView beeline_daqextra400;
    private CardView beeline_daqextra600;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beeline_daqiqa);
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

        beeline_daqextra200=findViewById(R.id.beeline_daqextra200);
        beeline_daqextra200.setOnClickListener(this);
        beeline_daqextra400=findViewById(R.id.beeline_daqextra400);
        beeline_daqextra400.setOnClickListener(this);
        beeline_daqextra600=findViewById(R.id.beeline_daqextra600);
        beeline_daqextra600.setOnClickListener(this);





    }




    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.beeline_daqextra200:


                String cUssdd1 = "110*500";
                String cToSendd1 = "tel:*" + cUssdd1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendd1)));
                }
                break;
            case R.id.beeline_daqextra400:


                String cUssdd2 = "110*501";
                String cToSendd2 = "tel:*" + cUssdd2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendd2)));
                }
                break;
            case R.id.beeline_daqextra600:


                String cUssdd3 = "110*502";
                String cToSendd3 = "tel:*" + cUssdd3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Beeline_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Beeline_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendd3)));
                }
                break;



        }


    }

}
