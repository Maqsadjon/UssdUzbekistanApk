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

public class RusUcell_xizmatlar extends AppCompatActivity implements View.OnClickListener {

    private CardView ucell_raqamyashirish;
    private CardView ucell_hisob;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_ucell_xizmatlar);

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

        ucell_raqamyashirish=findViewById(R.id.ucell_raqamyashirish);
        ucell_raqamyashirish.setOnClickListener(this);
        ucell_hisob=findViewById(R.id.ucell_hisob);
        ucell_hisob.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ucell_raqamyashirish:


                String cUssducelsdaqrys1 = "311*1";
                String cToSenducelsdaqrys1= "tel:*" + cUssducelsdaqrys1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsdaqrys1)));
                }
                break;
            case R.id.ucell_hisob:


                String cUssducelsms23 = "411";
                String cToSenducelsns23= "tel:*" + cUssducelsms23 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns23)));
                }
                break;





        }


    }

}