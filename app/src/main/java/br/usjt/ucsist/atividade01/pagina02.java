package br.usjt.ucsist.atividade01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pagina02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina02);
        TextView mostraNome = findViewById(R.id.mostraNome);
        Intent origemIntent = getIntent();
        String nome = origemIntent.getStringExtra("msg");
        mostraNome.setText("O nome digitado foi: " + nome);
    }
}