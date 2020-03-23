package com.example.cakemania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class coffemenuActivity extends AppCompatActivity {

    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffemenu);

        B1= findViewById(R.id.coffemenubutton);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(coffemenuActivity.this, picturesActivity.class);
                startActivity(intent);
                finish();

            }
        });



    }
}