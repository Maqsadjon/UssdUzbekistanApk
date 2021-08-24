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

public class RusUcell_internetpaket extends AppCompatActivity implements View.OnClickListener {

    private CardView ucell_1gb;
    private CardView ucell_1500;
    private CardView ucell_2gb;
    private CardView ucell_4gb;
    private CardView ucell_7gb;
    private CardView ucell_10gb;
    private CardView ucell_13gb;
    private CardView ucell_20gb;
    private CardView ucell_30gb;
    private CardView ucell_50gb;
    private CardView ucell_80gb;
    private CardView ucell_90gb;
    private CardView ucell_135gb;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_ucell_internetpaket);

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

        ucell_1gb=findViewById(R.id.ucell_1gb);
        ucell_1gb.setOnClickListener(this);
        ucell_1500=findViewById(R.id.ucell_1500);
        ucell_1500.setOnClickListener(this);
        ucell_2gb=findViewById(R.id.ucell_2gb);
        ucell_2gb.setOnClickListener(this);
        ucell_4gb=findViewById(R.id.ucell_4gb);
        ucell_4gb.setOnClickListener(this);
        ucell_7gb=findViewById(R.id.ucell_7gb);
        ucell_7gb.setOnClickListener(this);
        ucell_10gb=findViewById(R.id.ucell_10gb);
        ucell_10gb.setOnClickListener(this);
        ucell_13gb=findViewById(R.id.ucell_13gb);
        ucell_13gb.setOnClickListener(this);
        ucell_20gb=findViewById(R.id.ucell_20gb);
        ucell_20gb.setOnClickListener(this);
        ucell_30gb=findViewById(R.id.ucell_30gb);
        ucell_30gb.setOnClickListener(this);
        ucell_50gb=findViewById(R.id.ucell_50gb);
        ucell_50gb.setOnClickListener(this);
        ucell_80gb=findViewById(R.id.ucell_80gb);
        ucell_80gb.setOnClickListener(this);
        ucell_90gb=findViewById(R.id.ucell_90gb);
        ucell_90gb.setOnClickListener(this);
        ucell_135gb=findViewById(R.id.ucell_135gb);
        ucell_135gb.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ucell_1gb:

                String cUssducellint1 = "558*555*3*1*22523";
                String cToSenducellint1= "tel:*" + cUssducellint1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint1)));
                }
                break;
            case R.id.ucell_1500:


                String cUssducellint2 = "558*555*3*2*22523";
                String cToSenducellint2= "tel:*" + cUssducellint2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint2)));
                }
                break;
            case R.id.ucell_2gb:


                String cUssducellint3 = "558*555*3*3*22523";
                String cToSenducellint3= "tel:*" + cUssducellint3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint3)));
                }
                break;
            case R.id.ucell_4gb:


                String cUssducellint4 = "558*555*3*4*22523";
                String cToSenducellint4= "tel:*" + cUssducellint4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint4)));
                }
                break;
            case R.id.ucell_7gb:


                String cUssducellint5 = "558*555*3*5*22523";
                String cToSenducellint5= "tel:*" + cUssducellint5 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint5)));
                }
                break;
            case R.id.ucell_10gb:


                String cUssducellint6 = "558*555*3*13*22523";
                String cToSenducellint6= "tel:*" + cUssducellint6 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint6)));
                }
                break;
            case R.id.ucell_13gb:


                String cUssducellint7 = "558*555*3*6*22523";
                String cToSenducellint7= "tel:*" + cUssducellint7 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint7)));
                }
                break;
            case R.id.ucell_20gb:


                String cUssducellint8 = "558*555*3*7*22523";
                String cToSenducellint8= "tel:*" + cUssducellint8 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint8)));
                }
                break;
            case R.id.ucell_30gb:


                String cUssducellint9 = "558*555*3*8*22523";
                String cToSenducellint9= "tel:*" + cUssducellint9 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint9)));
                }
                break;
            case R.id.ucell_50gb:


                String cUssducellint10 = "558*555*3*9*22523";
                String cToSenducellint10= "tel:*" + cUssducellint10 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint10)));
                }
                break;
            case R.id.ucell_80gb:


                String cUssducellint11 = "558*555*3*10*22523";
                String cToSenducellint11= "tel:*" + cUssducellint11 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint11)));
                }
                break;
            case R.id.ucell_90gb:


                String cUssducellint12 = "558*555*3*11*22523";
                String cToSenducellint12= "tel:*" + cUssducellint12 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint12)));
                }
                break;


            case R.id.ucell_135gb:


                String cUssducellint13 = "558*555*3*12*22523";
                String cToSenducellint13= "tel:*" + cUssducellint13 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusUcell_internetpaket.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusUcell_internetpaket.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSenducellint13)));
                }
                break;


        }


    }

}