package com.example.tiendabrewpartners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OscurasActivity extends MainActivity{

    String nombre;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oscuras);

        nombre = getIntent().getStringExtra("nombre");
    }

    public void regresar(View view){
        Intent i = new Intent(this, TiendaActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }
}
