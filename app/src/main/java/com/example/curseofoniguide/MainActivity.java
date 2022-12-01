package com.example.curseofoniguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    public void OPEN_activity_historia_personagens(View view){
        Intent historia_personagens = new Intent(this, historia_personagens.class);
        startActivity(historia_personagens);
    }
    public void OPEN_activity_locais_mapa(View view){
        Intent locais_mapa = new Intent(this, locais_mapa.class);
        startActivity(locais_mapa);
    }
    public void OPEN_activity_inspiracoes(View view){
        Intent inspiracoes = new Intent(this, inspiracoes.class);
        startActivity(inspiracoes);
    }
    public void OPEN_activity_curiosidades_producao(View view){
        Intent curiosidades_producao = new Intent(this, curiosidades_producao.class);
        startActivity(curiosidades_producao);
    }
    public void OPEN_activity_main(View view){
        Intent menuInicial = new Intent(this, MainActivity.class);
        startActivity(menuInicial);
    }
}