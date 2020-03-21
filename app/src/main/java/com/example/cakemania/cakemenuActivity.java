package com.example.cakemania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cakemenuActivity extends AppCompatActivity {

    Button  coffeemenubutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakemenu);


        coffeemenubutton= findViewById(R.id.coffeemenubutton);

        coffeemenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( cakemenuActivity.this, coffemenuActivity.class);
                startActivity(intent);
            }
        });



    }
    }

