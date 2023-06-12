package com.example.tiendabrewpartners;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

        // Obtener el nombre pasado como extra del Intent
        nombre = getIntent().getStringExtra("nombre");
    }

    public void regresar(View view) {
        // Abrir la actividad MenuActivity y pasar el nombre como extra
        Intent i = new Intent(this, MenuActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }

    public void nacionales(View view){
        // Crear una nueva intención para abrir la actividad de "NacionalesActivity"
        Intent i = new Intent(this, NacionalesActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }

    public void importadas(View view){
        // Crear una nueva intención para abrir la actividad de "ImportadasActivity"
        Intent i = new Intent(this, ImportadasActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }

    public void artesanales(View view){
        // Crear una nueva intención para abrir la actividad de "ArtesanalesActivity"
        Intent i = new Intent(this, ArtesanalesActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }

    public void ligeras(View view){
        // Crear una nueva intención para abrir la actividad de "LigerasActivity"
        Intent i = new Intent(this, LigerasActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }

    public void oscuras(View view){
        // Crear una nueva intención para abrir la actividad de "OscurasActivity"
        Intent i = new Intent(this, OscurasActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }
}
