package com.example.cakemania;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText  Name,Password;
    Button Log;

    String name="Nima",pass="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log=findViewById(R.id.login);
        Name=findViewById(R.id.name);
        Password=findViewById(R.id.password);

        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Name.getText().toString().equals(name) && Password.getText().toString().equals(pass)){
                    startActivity(new Intent(login.this,MainActivity.class));

                }else {
                    Toast.makeText(login.this, "Wrong Name or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
