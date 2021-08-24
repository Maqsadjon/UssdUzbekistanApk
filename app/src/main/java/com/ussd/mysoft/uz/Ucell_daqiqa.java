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

public class Ucell_daqiqa extends AppCompatActivity implements View.OnClickListener {

    private CardView ucell_200daq;
    private CardView ucell_600daq;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucell_daqiqa);

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
        getWindow().setStatusBarColor(Color.parseColor("#AC89FB"));

    }
    @SuppressLint("WrongViewCast")



    private void initObjects(){

        ucell_200daq=findViewById(R.id.ucell_200daq);
        ucell_200daq.setOnClickListener(this);
        ucell_600daq=findViewById(R.id.ucell_600daq);
        ucell_600daq.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ucell_200daq:


                String cUssducelsdaqs1 = "130";
                String cToSenducelsdaqs1= "tel:*" + cUssducelsdaqs1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Ucell_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ucell_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsdaqs1)));
                }
                break;
            case R.id.ucell_600daq:


                String cUssducelsms3 = "130";
                String cToSenducelsns3= "tel:*" + cUssducelsms3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Ucell_daqiqa.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ucell_daqiqa.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns3)));
                }
                break;





        }


    }

}