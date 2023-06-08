package com.example.tiendabrewpartners;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends MainActivity {

    private TextView txt;
    String nombre;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        txt = (TextView) findViewById(R.id.tv_txt);
        nombre = getIntent().getStringExtra("nombre");
        txt.setText("Bienvenido a BrewPartners " + nombre);
    }

    public void tienda(View view){
        Intent i = new Intent(this, TiendaActivity.class);
        startActivity(i);
    }

    public void horario(View view){
        Intent i = new Intent(this, HorarioActivity.class);
        startActivity(i);
    }

    public void contacto(View view){
        Intent i = new Intent(this, ContactoActivity.class);
        startActivity(i);
    }
}
