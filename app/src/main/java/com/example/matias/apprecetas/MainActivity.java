package com.example.matias.apprecetas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imagenMain;
    private LinearLayout recetas;
    private LinearLayout queCocino;
    private LinearLayout compartir;
    private LinearLayout info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenMain = (ImageView)findViewById(R.id.imagenMain);
        recetas = (LinearLayout)findViewById(R.id.linearRecetas);
        queCocino = (LinearLayout)findViewById(R.id.linearQueCocino);
        compartir = (LinearLayout)findViewById(R.id.linearCompartir);
        info = (LinearLayout)findViewById(R.id.linearInfo);

        recetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), Recetas.class);
                startActivity(intent);
            }
        });

        queCocino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), QueCocino.class);
                startActivity(intent);
            }
        });

        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), Compartir.class);
                startActivity(intent);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), Info.class);
                startActivity(intent);
            }
        });
    }
}
