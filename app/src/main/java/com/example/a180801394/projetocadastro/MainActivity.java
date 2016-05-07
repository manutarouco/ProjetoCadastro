package com.example.a180801394.projetocadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostra(View view){

        EditText nome = (EditText) findViewById(R.id.edTextNome);
        EditText telefone = (EditText) findViewById(R.id.edtTextTelefone);


        Intent segundaAction = new Intent(this, MostraActivity.class);

        segundaAction.putExtra("nome", nome.getText().toString());
        segundaAction.putExtra("telefone", telefone.getText().toString());

        startActivity(segundaAction);
    }
}
