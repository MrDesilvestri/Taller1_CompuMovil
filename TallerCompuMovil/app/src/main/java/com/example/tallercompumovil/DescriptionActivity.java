package com.example.tallercompumovil;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;


public class DescriptionActivity  extends AppCompatActivity {
    TextView Sview;
    TextView Iview;
    TextView Cview;

    Button Dcome;

    ImageView Image;

    DescriptionActivity binding;
    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_activity);

        Sview = findViewById(R.id.SiglaText);
        Iview = findViewById(R.id.IntText);
        Cview = findViewById(R.id.CapText);
        Image = findViewById(R.id.FlagView);
        Dcome = findViewById(R.id.DcomeButton);

        /*
        String  nombre = getIntent().getExtras().getString("nombre");
        String region = getIntent().getExtras().getString("Region");
        String codigo = getIntent().getExtras().getString("Codigo");
        String IMG = getIntent().getExtras().getString("FlagPng");
        */
        //SetInfo(nombre,region,codigo,IMG);


        Dcome.setOnClickListener(v -> {
            Intent intent = new Intent(DescriptionActivity.this, CountryActivity.class);
            startActivity(intent);
        });
    }
    public void SetInfo(String nombre, String region, String codigo,String IMG){
        binding.Iview.setText(nombre);
        binding.Cview.setText(region);
        binding.Sview.setText(codigo);
        Picasso.get().load(IMG).into(Image);
    }
}
