package com.niksumapps.nn_art;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class paint extends AppCompatActivity {
    Button paint1;
    Button paint2;
    Button paint3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);
        paint1=(Button)findViewById(R.id.paint1);
        paint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paint1= new Intent(paint.this,Paint1.class);
                startActivity(paint1);
            }
        });
        paint2=(Button)findViewById(R.id.paint2);
        paint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paint2= new Intent(paint.this,Paint2.class);
                startActivity(paint2);
            }
        });
        paint3=(Button)findViewById(R.id.paint3);
        paint3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paint3= new Intent(paint.this,Paint3.class);
                startActivity(paint3);
            }
        });
    }
}