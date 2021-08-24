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

public class RusMobiuz_xizmatlar extends AppCompatActivity implements View.OnClickListener {

    private CardView mobiuz_konferensiya;
    private CardView mobiuz_chiquchitaqiq;
    private CardView mobiuz_kiruvchitaqiq;
    private CardView mobiuz_vamzvonil;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_mobiuz_xizmatlar);

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

        mobiuz_konferensiya=findViewById(R.id.mobiuz_konferensiya);
        mobiuz_konferensiya.setOnClickListener(this);
        mobiuz_chiquchitaqiq=findViewById(R.id.mobiuz_chiquchitaqiq);
        mobiuz_chiquchitaqiq.setOnClickListener(this);
        mobiuz_kiruvchitaqiq=findViewById(R.id.mobiuz_kiruvchitaqiq);
        mobiuz_kiruvchitaqiq.setOnClickListener(this);
        mobiuz_vamzvonil=findViewById(R.id.mobiuz_vamzvonil);
        mobiuz_vamzvonil.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.mobiuz_konferensiya:


                String cUssdux1 = "111*0061";
                String cToSendux1= "tel:*" + cUssdux1 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendux1)));
                }
                break;
            case R.id.mobiuz_chiquchitaqiq:


                String cUssdux2 = "33*0000";
                String cToSendux2= "tel:*" + cUssdux2 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendux2)));
                }
                break;
            case R.id.mobiuz_kiruvchitaqiq:


                String cUssdux3 = "35*0000";
                String cToSendux3= "tel:*" + cUssdux3 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendux3)));
                }
                break;
            case R.id.mobiuz_vamzvonil:


                String cUssdux4 = "111*0131";
                String cToSendux4= "tel:*" + cUssdux4 + Uri.encode("#");

                if (ContextCompat.checkSelfPermission(RusMobiuz_xizmatlar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(RusMobiuz_xizmatlar.this, new String[]{Manifest.permission.CALL_PHONE},100);
                }
                else
                {
                    startActivity(new Intent("android.intent.action.CALL",
                            Uri.parse(cToSendux4)));
                }
                break;




        }


    }

}