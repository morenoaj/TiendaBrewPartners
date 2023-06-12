package com.example.tiendabrewpartners;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContactoActivity extends MainActivity implements OnMapReadyCallback {

    private MapView mapView;
    private TextView wasa, insta;
    String nombre;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        // Inicializar el mapa
        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);

        // Obtener las referencias a los elementos de la interfaz de usuario
        wasa = findViewById(R.id.tv_whatsApp);
        insta = findViewById(R.id.tv_instagram);

        // Establecer el texto para los elementos de la interfaz de usuario
        wasa.setText("WhatsApp: 6066-9987 / 6150-9211"+'\n');
        insta.setText("Instagram: @brewpartners");

        nombre = getIntent().getStringExtra("nombre");
    }

    public void regresar(View view){
        Intent i = new Intent(this, MenuActivity.class);
        i.putExtra("nombre", nombre);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Configurar las coordenadas de latitud y longitud de la dirección predefinida (UTP)
        LatLng utpLocation = new LatLng(9.022108, -79.532034);

        // Agregar un marcador en la ubicación predefinida (UTP)
        googleMap.addMarker(new MarkerOptions().position(utpLocation).title("Universidad Tecnológica de Panamá"));

        // Mover la cámara del mapa a la ubicación predefinida (UTP)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(utpLocation, 15));
    }

    public void openMaps(View view) {
        // Abrir la aplicación de Google Maps con la dirección predefinida (UTP)
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=9.022108,-79.532034(UTP)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
