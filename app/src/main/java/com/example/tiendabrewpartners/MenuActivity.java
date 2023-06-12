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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Obtener referencia al TextView en el diseño
        txt = findViewById(R.id.tv_txt);

        // Obtener el nombre pasado como extra del Intent
        nombre = getIntent().getStringExtra("nombre");

        // Establecer el texto de bienvenida con el nombre en el TextView
        txt.setText("Bienvenido a BrewPartners, " + nombre);
    }

    public void tienda(View view) {
        // Abrir la actividad TiendaActivity y pasar el nombre como extra
        Intent i = new Intent(this, TiendaActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }

    public void horario(View view){
        // Abrir la actividad HorarioActivity
        Intent i = new Intent(this, TiendaActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }

    public void contacto(View view){
        // Abrir la actividad ContactoActivity
        Intent i = new Intent(this, TiendaActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }
}
