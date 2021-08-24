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

public class RusUcell_ussd extends AppCompatActivity implements View.OnClickListener {

    private CardView ucell_balans;
    private CardView ucell_inqoldiq;
    private CardView ucell_smsqoldiq;
    private CardView ucell_bonusqoldiq;
    private CardView ucell_mynomer;
    private CardView ucell_limitqoldiq;
    private CardView ucell_mobilavans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_ucell_ussd);

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

        ucell_balans=findViewById(R.id.ucell_balans);
        ucell_balans.setOnClickListener(this);
        ucell_inqoldiq=findViewById(R.id.ucell_inqoldiq);
        ucell_inqoldiq.setOnClickListener(this);
        ucell_smsqoldiq=findViewById(R.id.ucell_smsqoldiq);
        ucell_smsqoldiq.setOnClickListener(this);
        ucell_bonusqoldiq=findViewById(R.id.ucell_bonusqoldiq);
        ucell_bonusqoldiq.setOnClickListener(this);
        ucell_mynomer=findViewById(R.id.ucell_mynomer);
        ucell_mynomer.setOnClickListener(this);
        ucell_limitqoldiq=findViewById(R.id.ucell_limitqoldiq);
        ucell_limitqoldiq.setOnClickListener(this);
        ucell_mobilavans=findViewById(R.id.ucell_mobilavans);
        ucell_mobilavans.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ucell_balans:


                String cUssducelb1 = "100";
                String cToSenducelb1= "tel:*" + cUssducelb1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelb1)));
                }
                break;
            case R.id.ucell_inqoldiq:


                String cUssducelb2 = "107";
                String cToSenducelb2= "tel:*" + cUssducelb2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelb2)));
                }
                break;
            case R.id.ucell_smsqoldiq:


                String cUssducelb3 = "147";
                String cToSenducelb3= "tel:*" + cUssducelb3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelb3)));
                }
                break;
            case R.id.ucell_bonusqoldiq:


                String cUssducelb4 = "401";
                String cToSenducelb4= "tel:*" + cUssducelb4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelb4)));
                }
                break;
            case R.id.ucell_mynomer:


                String cUssducelb5 = "450";
                String cToSenducelb5= "tel:*" + cUssducelb5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelb5)));
                }
                break;
            case R.id.ucell_limitqoldiq:


                String cUssducelb6 = "103";
                String cToSenducelb6= "tel:*" + cUssducelb6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelb6)));
                }
                break;
            case R.id.ucell_mobilavans:


                String cUssducelb7 = "911";
                String cToSenducelb7= "tel:*" + cUssducelb7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_ussd.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_ussd.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelb7)));
                }
                break;



        }


    }

}