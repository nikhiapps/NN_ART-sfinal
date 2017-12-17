package com.niksumapps.nn_art;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class effects extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effects);
        btn1=(Button)findViewById(R.id.effects1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent effects1= new Intent(effects.this,Effects1.class);
                startActivity(effects1);
            }
        });
        btn2=(Button)findViewById(R.id.effects2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent effects2= new Intent(effects.this,Effects2.class);
                startActivity(effects2);
            }
        });
        btn3=(Button)findViewById(R.id.effects3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent effects3= new Intent(effects.this,Effects3.class);
                startActivity(effects3);
            }
        });


    }
}
