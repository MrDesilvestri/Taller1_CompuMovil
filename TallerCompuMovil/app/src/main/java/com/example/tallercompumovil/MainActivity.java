package com.example.tallercompumovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button botonE;

    TextView Jtext;
    TextView Ctext;
    Button botonP;

    int cont1 = 1;
    int cont2 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botonE = findViewById(R.id.btnEmpezarJuego);
        botonP = findViewById(R.id.btnMostrarPaises);
        Jtext = findViewById(R.id.JtextView);
        Ctext = findViewById(R.id.CtextView);

        botonE.setOnClickListener(v -> {

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                LocalDate date = LocalDate.now();
                Month mes = date.getMonth();
                Jtext.setText("utilizado por ultima vez el "+date.getDayOfWeek()+" "+ date.getDayOfMonth()+" "+ ","+ mes.getDisplayName(TextStyle.FULL, Locale.ENGLISH)+", "+date.getYear() + "El boton se ha oprimido: " + cont1 + " veces");
            }

            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(intent);


            cont1++;
        });

        botonP.setOnClickListener(v -> {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                LocalDate date = LocalDate.now();
                Month mes = date.getMonth();
                Ctext.setText("utilizado por ultima vez el "+date.getDayOfWeek()+" "+ date.getDayOfMonth()+" "+ ","+ mes.getDisplayName(TextStyle.FULL, Locale.ENGLISH)+", "+date.getYear() + "El boton se ha oprimido: " + cont2 + " veces");
            }

            Intent intent = new Intent(MainActivity.this, CountryActivity.class);
            startActivity(intent);


            cont2++;
        });
    }


}