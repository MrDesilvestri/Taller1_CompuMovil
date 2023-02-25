package com.example.tallercompumovil;

import android.annotation.SuppressLint;
import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryActivity extends AppCompatActivity {

    Button ComeButton;
    ListView Clist;
    ArrayList<String> CountryNames = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_activity);

        ComeButton = findViewById(R.id.CcomeButton);
        Clist = (ListView) findViewById(R.id.CountryList);

        CountryActivity activity = new CountryActivity();

        CountriesFromJson archivo = new CountriesFromJson();
        try {
            archivo.loadCountriesByJson(getAssets().open(CountriesFromJson.COUNTRIES_FILE));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> paises = new ArrayList<>();

        for (int i = 0; i < archivo.getSize(); i++) {
            try {
                CountryNames.add(archivo.getCountries().getJSONObject(i).getString("NativeName"));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

        }



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, CountryNames);
        Clist.setAdapter(adapter);
        Clist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                JSONObject pais = null;
                try {
                    pais = archivo.getCountries().getJSONObject(position);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
                String nombreEnIngles = pais.optString("Name");
                String codigoIso = pais.optString("Alpha2Code");
                String Region = pais.optString("Region");
                String FlagPng = pais.optString("FlagPng");
                Intent intent = new Intent(CountryActivity.this, DescriptionActivity.class);
                //intent.putExtra("nombre",nombreEnIngles);
                //intent.putExtra("Region",Region);
                //intent.putExtra("Codigo",codigoIso);
                //intent.putExtra("FlagPng",FlagPng);
                startActivity(intent);
            }
        });


        ComeButton.setOnClickListener(v -> {

            Intent intent = new Intent(CountryActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

}
