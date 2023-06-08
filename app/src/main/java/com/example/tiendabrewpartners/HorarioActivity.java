package com.example.tiendabrewpartners;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class HorarioActivity extends MainActivity{

    private TextView horario, wasa, insta;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        // Obtener referencia al TextView en el diseño
        horario = findViewById(R.id.tv_horario);

        // Establecer el texto con el horario de atención en el TextView
        horario.setText("Horario de atención " + '\n'
                + "De Lunes a Jueves de 11:00 a.m a 10:00 p.m " + '\n'
                + "De Viernes a Domingo de 11:00 a.m a 2:00 a.m " + '\n');
    }
}
