package com.ussd.mysoft.uz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;


public class RusMainMenu extends AppCompatActivity implements View.OnClickListener {

    private CardView ussd;
    private CardView tarifrejalar;
    private CardView internetpaket;
    private CardView beelidedaqiqa;
    private CardView smsbil;
    private CardView beelinexizmatlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus_main_menu);

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

        getWindow().setStatusBarColor(Color.parseColor("#F6B71B"));

    }

    @SuppressLint("WrongViewCast")
    private void initObjects(){

        ussd=findViewById(R.id.ussd);
        tarifrejalar=findViewById(R.id.tarifrejalar);
        internetpaket=findViewById(R.id.internetpaket);
        beelidedaqiqa=findViewById(R.id.beelidedaqiqa);
        smsbil=findViewById(R.id.smsbil);
        beelinexizmatlar=findViewById(R.id.beelinexizmatlar);
        ussd.setOnClickListener(this);
        tarifrejalar.setOnClickListener(this);
        internetpaket.setOnClickListener(this);
        beelidedaqiqa.setOnClickListener(this);
        smsbil.setOnClickListener(this);
        beelinexizmatlar.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ussd:
                startActivity(new Intent(RusMainMenu.this,RusBeeline_ussd.class));
                break;
            case R.id.smsbil:

                startActivity(new Intent(RusMainMenu.this,RusBeeline_sms.class));
                break;
            case R.id.internetpaket:

                startActivity(new Intent(RusMainMenu.this,RusBeeline_internetpaket.class));
                break;
            case R.id.beelidedaqiqa:

                startActivity(new Intent(RusMainMenu.this,RusBeeline_daqiqa.class));
                break;
            case R.id.tarifrejalar:

                startActivity(new Intent(RusMainMenu.this,RusBeeline_tarifreja.class));
                break;
            case R.id.beelinexizmatlar:

                startActivity(new Intent(RusMainMenu.this,RusBeeline_xizmatlar.class));
                break;

        }


    }
}
