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

public class RusMobiuz_sms extends AppCompatActivity implements View.OnClickListener {

    private CardView mobiuz_sms100;
    private CardView mobiuz_sms300;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_mobiuz_sms);
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

        mobiuz_sms100=findViewById(R.id.mobiuz_sms100);
        mobiuz_sms100.setOnClickListener(this);
        mobiuz_sms300=findViewById(R.id.mobiuz_sms300);
        mobiuz_sms300.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.mobiuz_sms100:


                String cUssdus1 = "171*018*1*011000253";
                String cToSendus1= "tel:*" + cUssdus1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendus1)));
                }
                break;
            case R.id.mobiuz_sms300:


                String cUssdus2 = "171*018*2*011000253";
                String cToSendus2= "tel:*" + cUssdus2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_sms.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_sms.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendus2)));
                }
                break;




        }


    }

}