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

public class Uzmobile_tarifreja extends AppCompatActivity implements View.OnClickListener {

    private CardView uzmobile_street;
    private CardView uzmobile_streetupgrate;
    private CardView uzmobile_oddiy10;
    private CardView uzmobile_flash;
    private CardView uzmobile_flashupgrate;
    private CardView uzmobile_royal;
    private CardView uzmobile_ishbilarmon;
    private CardView uzmobile_unites1500;
    private CardView uzmobile_unites8000;
    private CardView uzmobile_unites4000;
    private CardView uzmobile_unites11000;
    private CardView uzmobile_unites14000;
    private CardView uzmobile_unites18000;
    private CardView uzmobile_unites22000;
    private CardView uzmobile_onlime;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzmobile_tarifreja);

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

        uzmobile_street=findViewById(R.id.uzmobile_street);
        uzmobile_street.setOnClickListener(this);
        uzmobile_streetupgrate=findViewById(R.id.uzmobile_streetupgrate);
        uzmobile_streetupgrate.setOnClickListener(this);
        uzmobile_oddiy10=findViewById(R.id.uzmobile_oddiy10);
        uzmobile_oddiy10.setOnClickListener(this);
        uzmobile_flash=findViewById(R.id.uzmobile_flash);
        uzmobile_flash.setOnClickListener(this);
        uzmobile_flashupgrate=findViewById(R.id.uzmobile_flashupgrate);
        uzmobile_flashupgrate.setOnClickListener(this);
        uzmobile_royal=findViewById(R.id.uzmobile_royal);
        uzmobile_royal.setOnClickListener(this);
        uzmobile_ishbilarmon=findViewById(R.id.uzmobile_ishbilarmon);
        uzmobile_ishbilarmon.setOnClickListener(this);
        uzmobile_unites1500=findViewById(R.id.uzmobile_unites1500);
        uzmobile_unites1500.setOnClickListener(this);
        uzmobile_unites4000=findViewById(R.id.uzmobile_unites4000);
        uzmobile_unites4000.setOnClickListener(this);
        uzmobile_unites8000=findViewById(R.id.uzmobile_unites8000);
        uzmobile_unites8000.setOnClickListener(this);
        uzmobile_unites11000=findViewById(R.id.uzmobile_unites11000);
        uzmobile_unites11000.setOnClickListener(this);
        uzmobile_unites14000=findViewById(R.id.uzmobile_unites14000);
        uzmobile_unites14000.setOnClickListener(this);
        uzmobile_unites18000=findViewById(R.id.uzmobile_unites18000);
        uzmobile_unites18000.setOnClickListener(this);
        uzmobile_unites22000=findViewById(R.id.uzmobile_unites22000);
        uzmobile_unites22000.setOnClickListener(this);
        uzmobile_onlime=findViewById(R.id.uzmobile_onlime);
        uzmobile_onlime.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.uzmobile_street:


                String cUssdubdaq1 = "111*2*11*1*1";
                String cToSendubdaq1= "tel:*" + cUssdubdaq1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq1)));
                }
                break;
            case R.id.uzmobile_streetupgrate:


                String cUssdubdaq2 = "111*2*11*4*1";
                String cToSendubdaq2= "tel:*" + cUssdubdaq2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq2)));
                }
                break;
            case R.id.uzmobile_oddiy10:


                String cUssdubdaq3 = "111*2*11*12*1";
                String cToSendubdaq3= "tel:*" + cUssdubdaq3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq3)));
                }
                break;
            case R.id.uzmobile_flash:


                String cUssdubdaq4 = "111*2*11*2*1";
                String cToSendubdaq4= "tel:*" + cUssdubdaq4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq4)));
                }
                break;

            case R.id.uzmobile_flashupgrate:


                String cUssdubdaq5 = "111*1*11*5*1";
                String cToSendubdaq5= "tel:*" + cUssdubdaq5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq5)));
                }
                break;
            case R.id.uzmobile_royal:


                String cUssdubdaq6 = "111*2*11*3*1";
                String cToSendubdaq6= "tel:*" + cUssdubdaq6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq6)));
                }
                break;
            case R.id.uzmobile_ishbilarmon:


                String cUssdubdaq7 = "111*1*11*10*1";
                String cToSendubdaq7= "tel:*" + cUssdubdaq7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq7)));
                }
                break;
            case R.id.uzmobile_unites1500:


                String cUssdubdaq8 = "777*1";
                String cToSendubdaq8= "tel:*" + cUssdubdaq8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq8)));
                }
                break;
            case R.id.uzmobile_unites8000:


                String cUssdubdaq9 = "777*4";
                String cToSendubdaq9= "tel:*" + cUssdubdaq9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq9)));
                }
                break;
            case R.id.uzmobile_unites4000:


                String cUssdubdaq10 = "777*3";
                String cToSendubdaq10= "tel:*" + cUssdubdaq10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq10)));
                }
                break;
            case R.id.uzmobile_unites11000:


                String cUssdubdaq11 = "777*5";
                String cToSendubdaq11= "tel:*" + cUssdubdaq11 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq11)));
                }
                break;
            case R.id.uzmobile_unites14000:


                String cUssdubdaq12 = "777*6";
                String cToSendubdaq12 = "tel:*" + cUssdubdaq12 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq12)));
                }
                break;
            case R.id.uzmobile_unites18000:


                String cUssdubdaq13 = "777*7";
                String cToSendubdaq13 = "tel:*" + cUssdubdaq13 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq13)));
                }
                break;
            case R.id.uzmobile_unites22000:


                String cUssdubdaq14 = "777*8";
                String cToSendubdaq14 = "tel:*" + cUssdubdaq14 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq14)));
                }
                break;
            case R.id.uzmobile_onlime:


                String cUssdubdaq15 = "111*1*11*6*1";
                String cToSendubdaq15 = "tel:*" + cUssdubdaq15 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(Uzmobile_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Uzmobile_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendubdaq15)));
                }
                break;




        }


    }

}