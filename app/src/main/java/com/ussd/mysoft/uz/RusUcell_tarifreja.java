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

public class RusUcell_tarifreja extends AppCompatActivity implements View.OnClickListener {

    private CardView ucell_yaxshikayifyat;
    private CardView ucell_active45;
    private CardView ucell_zorkayfiyat;
    private CardView ucell_alokayfiyat;
    private CardView ucell_active70;
    private CardView ucell_active100;
    private CardView ucell_yengilhafta;
    private CardView ucell_yangiijobiy;
    private CardView ucell_cosmo16;
    private CardView ucell_cosmo23;
    private CardView ucell_cosmo28;
    private CardView ucell_special35;
    private CardView ucell_special55;
    private CardView ucell_special80;
    private CardView ucell_special125;
    private CardView ucell_specialunlim;
    private CardView ucell_tantana;
    private CardView ucell_kattatantana;
    private CardView ucell_drive;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_ucell_tarifreja);

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

        ucell_yaxshikayifyat=findViewById(R.id.ucell_yaxshikayifyat);
        ucell_yaxshikayifyat.setOnClickListener(this);
        ucell_active45=findViewById(R.id.ucell_active45);
        ucell_active45.setOnClickListener(this);
        ucell_zorkayfiyat=findViewById(R.id.ucell_zorkayfiyat);
        ucell_zorkayfiyat.setOnClickListener(this);
        ucell_alokayfiyat=findViewById(R.id.ucell_alokayfiyat);
        ucell_alokayfiyat.setOnClickListener(this);
        ucell_active70=findViewById(R.id.ucell_active70);
        ucell_active70.setOnClickListener(this);
        ucell_active100=findViewById(R.id.ucell_active100);
        ucell_active100.setOnClickListener(this);
        ucell_yengilhafta=findViewById(R.id.ucell_yengilhafta);
        ucell_yengilhafta.setOnClickListener(this);
        ucell_yangiijobiy=findViewById(R.id.ucell_yangiijobiy);
        ucell_yangiijobiy.setOnClickListener(this);
        ucell_cosmo16=findViewById(R.id.ucell_cosmo16);
        ucell_cosmo16.setOnClickListener(this);
        ucell_cosmo23=findViewById(R.id.ucell_cosmo23);
        ucell_cosmo23.setOnClickListener(this);
        ucell_cosmo28=findViewById(R.id.ucell_cosmo28);
        ucell_cosmo28.setOnClickListener(this);
        ucell_special35=findViewById(R.id.ucell_special35);
        ucell_special35.setOnClickListener(this);
        ucell_special55=findViewById(R.id.ucell_special55);
        ucell_special55.setOnClickListener(this);
        ucell_special80=findViewById(R.id.ucell_special80);
        ucell_special80.setOnClickListener(this);
        ucell_special125=findViewById(R.id.ucell_special125);
        ucell_special125.setOnClickListener(this);
        ucell_specialunlim=findViewById(R.id.ucell_specialunlim);
        ucell_specialunlim.setOnClickListener(this);
        ucell_tantana=findViewById(R.id.ucell_tantana);
        ucell_tantana.setOnClickListener(this);
        ucell_kattatantana=findViewById(R.id.ucell_kattatantana);
        ucell_kattatantana.setOnClickListener(this);
        ucell_drive=findViewById(R.id.ucell_drive);
        ucell_drive.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ucell_yaxshikayifyat:


                String cUssducelsms1 = "120*2";
                String cToSenducelsns1= "tel:*" + cUssducelsms1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns1)));
                }
                break;
            case R.id.ucell_active45:


                String cUssducelsms2 = "120";
                String cToSenducelsns2= "tel:*" + cUssducelsms2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns2)));
                }
                break;
            case R.id.ucell_zorkayfiyat:


                String cUssducelsms3 = "120*2";
                String cToSenducelsns3= "tel:*" + cUssducelsms3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns3)));
                }
                break;
            case R.id.ucell_alokayfiyat:


                String cUssducelsms4 = "120*2";
                String cToSenducelsns4= "tel:*" + cUssducelsms4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns4)));
                }
                break;
            case R.id.ucell_active70:


                String cUssducelsms5 = "120*2";
                String cToSenducelsns5= "tel:*" + cUssducelsms5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns5)));
                }
                break;
            case R.id.ucell_active100:


                String cUssducelsms6 = "120*2";
                String cToSenducelsns6= "tel:*" + cUssducelsms6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns6)));
                }
                break;
            case R.id.ucell_yengilhafta:


                String cUssducelsms7 = "120*2";
                String cToSenducelsns7= "tel:*" + cUssducelsms7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns7)));
                }
                break;
            case R.id.ucell_yangiijobiy:


                String cUssducelsms8 = "120*2";
                String cToSenducelsns8= "tel:*" + cUssducelsms8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns8)));
                }
                break;
            case R.id.ucell_cosmo16:


                String cUssducelsms9 = "120*2";
                String cToSenducelsns9= "tel:*" + cUssducelsms9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns9)));
                }
                break;
            case R.id.ucell_cosmo23:


                String cUssducelsms10 = "120*2";
                String cToSenducelsns10= "tel:*" + cUssducelsms10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns10)));
                }
                break;
            case R.id.ucell_cosmo28:


                String cUssducelsms11 = "120*2";
                String cToSenducelsns11= "tel:*" + cUssducelsms11 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns11)));
                }
                break;
            case R.id.ucell_special35:


                String cUssducelsms12 = "120*2";
                String cToSenducelsns12= "tel:*" + cUssducelsms12 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns12)));
                }
                break;
            case R.id.ucell_special55:


                String cUssducelsms13 = "120*2";
                String cToSenducelsns13= "tel:*" + cUssducelsms13 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns13)));
                }
                break;
            case R.id.ucell_special80:


                String cUssducelsms14 = "120*2";
                String cToSenducelsns14= "tel:*" + cUssducelsms14 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns14)));
                }
                break;
            case R.id.ucell_special125:


                String cUssducelsms15 = "120*2";
                String cToSenducelsns15= "tel:*" + cUssducelsms15 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns15)));
                }
                break;
            case R.id.ucell_specialunlim:


                String cUssducelsms16 = "120*2";
                String cToSenducelsns16= "tel:*" + cUssducelsms16 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns16)));
                }
                break;
            case R.id.ucell_tantana:


                String cUssducelsms17 = "120*2";
                String cToSenducelsns17= "tel:*" + cUssducelsms17 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns17)));
                }
                break;
            case R.id.ucell_kattatantana:


                String cUssducelsms18 = "120*2";
                String cToSenducelsns18= "tel:*" + cUssducelsms18 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns18)));
                }
                break;
            case R.id.ucell_drive:


                String cUssducelsms19 = "120*2";
                String cToSenducelsns19= "tel:*" + cUssducelsms19 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_tarifreja.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_tarifreja.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducelsns19)));
                }
                break;





        }


    }

}