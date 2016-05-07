package com.example.a180801394.projetocadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MostraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra);

        Intent it = getIntent();

        TextView tvNome = (TextView) findViewById(R.id.tvNome);
        tvNome.setText(it.getStringExtra("nome"));

        TextView tvTelefone = (TextView) findViewById(R.id.tvTelefone);
        tvTelefone.setText(it.getStringExtra("telefone"));

    }

    public void volta(View v){
        finish();
    }
}
