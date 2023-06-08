package com.example.tiendabrewpartners;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HorarioActivity extends MainActivity{

    private TextView horario, wasa, insta;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        horario = findViewById(R.id.tv_horario);

        horario.setText("Horario de atención " + '\n'
                + "De Lunes a Jueves de 11:00 a.m a 10:00 p.m " + '\n'
                + "De Viernes a Domingo de 11:00 a.m a 2:00 a.m " + '\n');

    }
}
