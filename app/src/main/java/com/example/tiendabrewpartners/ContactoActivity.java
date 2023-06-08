package com.example.tiendabrewpartners;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class ContactoActivity extends MainActivity{

    private TextView wasa, insta;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        wasa = findViewById(R.id.tv_whatsApp);
        insta = findViewById(R.id.tv_instagram);

        wasa.setText("WhatsApp: 6066-9987 / 6150-9211"+'\n');
        insta.setText("Instagram: @brewpartners");
    }
}
