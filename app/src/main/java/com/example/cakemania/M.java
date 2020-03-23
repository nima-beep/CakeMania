package com.example.cakemania;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class M extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent=new Intent(M.this,BackgroundService.class);
       // startService(intent);
        startActivity(new Intent(M.this,login.class));
        finish();

    }
}
