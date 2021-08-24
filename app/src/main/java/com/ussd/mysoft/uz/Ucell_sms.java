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

public class Ucell_sms extends AppCompatActivity implements View.OnClickListener {

    private CardView ucell_50sms;
    private CardView ucell_150sms;
    private CardView ucell_500sms;
    private CardView ucell_25sms;
    private CardView ucell_40sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucell_sms);

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

        ucell_50sms=findViewById(R.id.ucell_50sms);
        ucell_50sms.setOnClickListener(this);
        ucell_150sms=findViewById(R.id.ucell_150sms);
        ucell_150sms.setOnClickListener(this);
        ucell_500sms=findViewById(R.id.ucell_500sms);
        ucell_500sms.setOnClickListener(this);
        ucell_25sms=findViewById(R.id.ucell_25sms);
        ucell_25sms.setOnClickListener(this);
        ucell_40sms=findViewById(R.id.ucell_40sms);
        ucell_40sms.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ucell_50sms:


                String cUssducelsms1 = "147*1*1";
                String cToSenducelsns1= "tel:*" + cUssducelsms1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Ucell_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ucell_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns1)));
                }
                break;
            case R.id.ucell_150sms:


                String cUssducelsms2 = "147*1*2";
                String cToSenducelsns2= "tel:*" + cUssducelsms2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Ucell_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ucell_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns2)));
                }
                break;
            case R.id.ucell_500sms:


                String cUssducelsms3 = "147*1*3";
                String cToSenducelsns3= "tel:*" + cUssducelsms3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Ucell_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ucell_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns3)));
                }
                break;
            case R.id.ucell_25sms:


                String cUssducelsms4 = "148*1*1";
                String cToSenducelsns4= "tel:*" + cUssducelsms4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Ucell_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ucell_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns4)));
                }
                break;
            case R.id.ucell_40sms:


                String cUssducelsms5 = "148*1*2";
                String cToSenducelsns5= "tel:*" + cUssducelsms5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Ucell_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ucell_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns5)));
                }
                break;




        }


    }

}