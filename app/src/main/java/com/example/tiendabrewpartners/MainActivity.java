package com.example.tiendabrewpartners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener la referencia al EditText en el diseño
        nombre = findViewById(R.id.pt_nombre);
    }

    public void menu(View view) {
        // Obtener el texto ingresado en el EditText
        String nombreText = nombre.getText().toString().trim();

        // Verificar si el campo de nombre está vacío
        if (TextUtils.isEmpty(nombreText)) {
            Toast.makeText(this, "Por favor ingrese un nombre", Toast.LENGTH_SHORT).show();
        }
        // Verificar si el nombre contiene números
        else if (!isNombreValido(nombreText)) {
            Toast.makeText(this, "Por favor ingrese un nombre válido", Toast.LENGTH_SHORT).show();
        }
        // Si el nombre es válido, proceder al menú
        else {
            // Formatear el nombre para que la primera letra esté en mayúscula y las demás en minúscula
            String nombreFormateado = formatearNombre(nombreText);

            // Crear un Intent para pasar a la actividad MenuActivity y enviar el nombre formateado como extra
            Intent intent = new Intent(this, MenuActivity.class);
            intent.putExtra("nombre", nombreFormateado);
            startActivity(intent);
        }
    }

    private boolean isNombreValido(String nombre) {
        // Verificar si el nombre contiene números utilizando una expresión regular
        Pattern pattern = Pattern.compile(".*\\d.*");
        return !pattern.matcher(nombre).matches();
    }

    private String formatearNombre(String nombre) {
        // Formatear el nombre para que la primera letra esté en mayúscula y las demás en minúscula
        return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
    }
}
