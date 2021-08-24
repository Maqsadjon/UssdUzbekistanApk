package com.ussd.mysoft.uz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LanguageActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_ozbekcha;
    private Button ruscha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        initObjects();

    }
    private void initObjects(){

        btn_ozbekcha=findViewById(R.id.btn_ozbekcha);
        btn_ozbekcha.setOnClickListener(this);
        ruscha=findViewById(R.id.ruscha);
        ruscha.setOnClickListener(this);

            }
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_ozbekcha:
                startActivity(new Intent(LanguageActivity.this,MainActivity.class));
                break;
            case R.id.ruscha:
                startActivity(new Intent(LanguageActivity.this,RusMainActivity.class));
                break;



        }
    }
}