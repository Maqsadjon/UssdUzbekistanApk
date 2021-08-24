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

public class RusUzmobile_xizmatlar extends AppCompatActivity implements View.OnClickListener {

    private CardView uzmobile_restart;
    private CardView uzmobile_oilauchun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_uzmobile_xizmatlar);

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
        getWindow().setStatusBarColor(Color.parseColor("#4EBEFA"));

    }
    @SuppressLint("WrongViewCast")



    private void initObjects(){

        uzmobile_restart=findViewById(R.id.uzmobile_restart);
        uzmobile_restart.setOnClickListener(this);
        uzmobile_oilauchun=findViewById(R.id.uzmobile_oilauchun);
        uzmobile_oilauchun.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.uzmobile_restart:
                String cUssdubdxiz1 = "111*2*3*1";
                String cToSendubdxiz1= "tel:*" + cUssdubdxiz1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUzmobile_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUzmobile_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdxiz1)));
                }
                break;
            case R.id.uzmobile_oilauchun:
                String cUssdubdxiz2 = "111*2*17*1*1";
                String cToSendubdxiz2= "tel:*" + cUssdubdxiz2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUzmobile_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUzmobile_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdxiz2)));
                }
                break;





        }


    }

}