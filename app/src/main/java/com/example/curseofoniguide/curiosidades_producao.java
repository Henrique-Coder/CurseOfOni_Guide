package com.example.curseofoniguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class curiosidades_producao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosidades_producao);
        getSupportActionBar().hide();
    }
    public void OPEN_activity_main(View view){
        Intent menuInicial = new Intent(this, MainActivity.class);
        startActivity(menuInicial);
    }
}