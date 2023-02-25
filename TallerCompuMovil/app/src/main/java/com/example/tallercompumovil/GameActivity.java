package com.example.tallercompumovil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {
    int intentos = 0;
    Button ComeButton;
    Button Abutton;

    EditText editText;

    TextView infoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        Random rand = new Random();
        int numeroRandom = rand.nextInt(50);

        ComeButton = findViewById(R.id.GcomeButton);
        Abutton = findViewById(R.id.AButton);
        editText = findViewById(R.id.edit_text);
        infoView = findViewById(R.id.info_TextView);




        ComeButton.setOnClickListener(v -> {
            Intent intent = new Intent(GameActivity.this, MainActivity.class);
            startActivity(intent);
        });

        Abutton.setOnClickListener(v -> {
            intentos++;

            editText = findViewById(R.id.edit_text);
            infoView = findViewById(R.id.info_TextView);
            String texto = editText.getText().toString();
            int numeroInput = Integer.parseInt(texto);
            if(numeroInput > numeroRandom){
                infoView.setText("Fallaste, el numero dijitado es mas grande que el aleatorio "+ " numero de intentos: " + intentos);
            }else if(numeroInput < numeroRandom){
                infoView.setText("Fallaste, el numero dijitado es mas pequeño que el aleatorio" + " numero de intentos: " + intentos);
            }else{
                infoView.setText("acertaste, el numero digitado es igual que el numero aleatorio, el numero es: " +  numeroRandom + " numero de intentos: " + intentos);
            }

        });
    }

}
