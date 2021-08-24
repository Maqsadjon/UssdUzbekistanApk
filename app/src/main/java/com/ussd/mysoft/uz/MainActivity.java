package com.ussd.mysoft.uz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img;

    private Button btn_beeline;
    private Button btn_mobiuz;
    private Button btn_uzmobile;
    private Button btn_ucell;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initObjects();

    }
    private void initObjects(){

        btn_beeline=findViewById(R.id.btn_beeline);
        btn_beeline.setOnClickListener(this);
        btn_mobiuz=findViewById(R.id.btn_mobiuz);
        btn_mobiuz.setOnClickListener(this);
        btn_uzmobile=findViewById(R.id.btn_uzmobile);
        btn_uzmobile.setOnClickListener(this);
        btn_ucell=findViewById(R.id.btn_ucell);
        btn_ucell.setOnClickListener(this);



    }
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_beeline:
                startActivity(new Intent(MainActivity.this,MainMenu.class));
                break;
            case R.id.btn_mobiuz:
                startActivity(new Intent(MainActivity.this,MobiuzMenu.class));
                break;
            case R.id.btn_uzmobile:
                startActivity(new Intent(MainActivity.this,UzmobileMenu.class));
                break;
            case R.id.btn_ucell:
                startActivity(new Intent(MainActivity.this,UcellMenu.class));
                break;


        }
    }
}