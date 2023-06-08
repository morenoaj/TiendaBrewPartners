package com.example.tiendabrewpartners;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TiendaActivity extends MainActivity{

    private TextView txt2;
    String nombre;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);
    }

    public void nacionales(View view){
        Intent i = new Intent(this, NacionalesActivity.class);
        startActivity(i);
    }

    public void importadas(View view){
        Intent i = new Intent(this, ImportadasActivity.class);
        startActivity(i);
    }

    public void artesanales(View view){
        Intent i = new Intent(this, ArtesanalesActivity.class);
        startActivity(i);
    }

    public void ligeras(View view){
        Intent i = new Intent(this, LigerasActivity.class);
        startActivity(i);
    }

    public void oscuras(View view){
        Intent i = new Intent(this, OscurasActivity.class);
        startActivity(i);
    }
}