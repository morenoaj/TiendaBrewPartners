package com.example.tiendabrewpartners;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySplash extends AppCompatActivity {

    ProgressBar splashProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Obtener la referencia al ProgressBar en el diseño
        splashProgress = findViewById(R.id.splashProgress);

        // Crear una animación para el ProgressBar
        ObjectAnimator.ofInt(splashProgress, "progress", 100).setDuration(4000).start();

        // Esperar un tiempo antes de pasar a la siguiente actividad
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crear un Intent para pasar a la MainActivity
                Intent intent = new Intent(ActivitySplash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000); // Esperar 6 segundos antes de pasar a la siguiente actividad
    }
}
