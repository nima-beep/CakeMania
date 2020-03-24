package com.example.cakemania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class picturesActivity extends AppCompatActivity  implements View.OnClickListener {
     Button exit;

    private ImageView black_forest,blueberrycake,coldcoffee,hotchocklet,redvelvet,oreocheesecake,cappuccino,latte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        black_forest=findViewById(R.id.black_forestid);
        blueberrycake=findViewById(R.id.blurberrycakeid);
        coldcoffee=findViewById(R.id.coldcoffeeid);
       hotchocklet=findViewById(R.id.hotchockletid);
       redvelvet=findViewById(R.id.redvelvetid);
        oreocheesecake=findViewById(R.id.oreocheesecakeid);
        cappuccino=findViewById(R.id.cappachinoid);
        latte=findViewById(R.id.latteid);

        black_forest.setOnClickListener(this);
        blueberrycake.setOnClickListener(this);
       coldcoffee.setOnClickListener(this);
       hotchocklet.setOnClickListener(this);
       redvelvet.setOnClickListener(this);
       oreocheesecake.setOnClickListener(this);
        cappuccino.setOnClickListener(this);
       latte.setOnClickListener(this);


exit = findViewById(R.id.exitid);
exit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(picturesActivity.this, ABC.class);
        startActivity(intent);
        finish();


    }
});

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.black_forestid)
        {
            black_forest.setVisibility(v.GONE);
           redvelvet.setVisibility(v.VISIBLE);
           oreocheesecake.setVisibility(v.GONE);
           blueberrycake.setVisibility(v.GONE);
           hotchocklet.setVisibility(v.GONE);
           coldcoffee.setVisibility(v.GONE);
           cappuccino.setVisibility(v.GONE);
            latte.setVisibility(v.GONE);
            Toast.makeText(this, "This is Red Velvet cake", Toast.LENGTH_SHORT).show();


        }

        else if(v.getId()==R.id.redvelvetid)
        {
            black_forest.setVisibility(v.GONE);
            redvelvet.setVisibility(v.GONE);
            oreocheesecake.setVisibility(v.VISIBLE);
            blueberrycake.setVisibility(v.GONE);
            hotchocklet.setVisibility(v.GONE);
            coldcoffee.setVisibility(v.GONE);
            cappuccino.setVisibility(v.GONE);
            latte.setVisibility(v.GONE);


            Toast.makeText(this, "This is Oreocheese cake", Toast.LENGTH_SHORT).show();
        }

        else if(v.getId()==R.id.oreocheesecakeid)
        {
            black_forest.setVisibility(v.GONE);
            redvelvet.setVisibility(v.GONE);
            oreocheesecake.setVisibility(v.GONE);
            blueberrycake.setVisibility(v.VISIBLE);
            hotchocklet.setVisibility(v.GONE);
            coldcoffee.setVisibility(v.GONE);
            cappuccino.setVisibility(v.GONE);
            latte.setVisibility(v.GONE);

            Toast.makeText(this, "This is Blueberrycheese  cake", Toast.LENGTH_SHORT).show();
        }

        else if(v.getId()==R.id.blurberrycakeid)
        {
            black_forest.setVisibility(v.GONE);
            redvelvet.setVisibility(v.GONE);
            oreocheesecake.setVisibility(v.GONE);
            blueberrycake.setVisibility(v.GONE);
            hotchocklet.setVisibility(v.VISIBLE);
            coldcoffee.setVisibility(v.GONE);
            cappuccino.setVisibility(v.GONE);
            latte.setVisibility(v.GONE);

            Toast.makeText(this, "This is Hotchocolet coffee", Toast.LENGTH_SHORT).show();
        }

        else if(v.getId()==R.id.hotchockletid)
        {
            black_forest.setVisibility(v.GONE);
            redvelvet.setVisibility(v.GONE);
            oreocheesecake.setVisibility(v.GONE);
            blueberrycake.setVisibility(v.GONE);
            hotchocklet.setVisibility(v.GONE);
            coldcoffee.setVisibility(v.VISIBLE);
            cappuccino.setVisibility(v.GONE);
            latte.setVisibility(v.GONE);

            Toast.makeText(this, "This is Cold coffee", Toast.LENGTH_SHORT).show();
        }

        else if(v.getId()==R.id.coldcoffeeid)
        {
            black_forest.setVisibility(v.GONE);
            redvelvet.setVisibility(v.GONE);
            oreocheesecake.setVisibility(v.GONE);
            blueberrycake.setVisibility(v.GONE);
            hotchocklet.setVisibility(v.GONE);
            coldcoffee.setVisibility(v.GONE);
            cappuccino.setVisibility(v.VISIBLE);
            latte.setVisibility(v.GONE);

            Toast.makeText(this, "This is Cappuccino Coffee ", Toast.LENGTH_SHORT).show();
        }

        else if(v.getId()==R.id.cappachinoid)
        {
            black_forest.setVisibility(v.GONE);
            redvelvet.setVisibility(v.GONE);
            oreocheesecake.setVisibility(v.GONE);
            blueberrycake.setVisibility(v.GONE);
            hotchocklet.setVisibility(v.GONE);
            coldcoffee.setVisibility(v.GONE);
            cappuccino.setVisibility(v.GONE);
            latte.setVisibility(v.VISIBLE);

            Toast.makeText(this, "This is Latte Coffee", Toast.LENGTH_SHORT).show();
        }

        else if(v.getId()==R.id.latteid)
        {
            black_forest.setVisibility(v.VISIBLE);
            redvelvet.setVisibility(v.GONE);
            oreocheesecake.setVisibility(v.GONE);
            blueberrycake.setVisibility(v.GONE);
            hotchocklet.setVisibility(v.GONE);
            coldcoffee.setVisibility(v.GONE);
            cappuccino.setVisibility(v.GONE);
            latte.setVisibility(v.GONE);

            Toast.makeText(this, "This is Black forest cake ", Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(picturesActivity.this,BackgroundService.class));
    }
}
