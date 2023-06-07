package com.example.tiendabrewpartners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre  = findViewById(R.id.etxt_nombre);
    }

    public void menu(View view) {
        Intent intent=new Intent(this, MenuActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        startActivity(intent);
    }
}