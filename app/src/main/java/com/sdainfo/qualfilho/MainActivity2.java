package com.sdainfo.qualfilho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imagem;
    private TextView resultado;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sorteado);

        Bundle dados = getIntent().getExtras();
         numero = dados.getInt("numero");

        imagem = findViewById(R.id.imageViewResultado);
        resultado = findViewById(R.id.textViewNome);

        if(numero == 0){
            resultado.setText(R.string.isa);
            imagem.setImageResource(R.drawable.isa);
        }else if(numero == 1){
            resultado.setText(R.string.ma);
            imagem.setImageResource(R.drawable.ma);
        }else if(numero == 2){
            resultado.setText(R.string.re);
            imagem.setImageResource(R.drawable.renato);
        }else if(numero == 3){
            resultado.setText(R.string.duda);
            imagem.setImageResource(R.drawable.duda);
        }else if(numero == 4){
            resultado.setText(R.string.se);
            imagem.setImageResource(R.drawable.sergio);
        }else {
            resultado.setText(R.string.padrao);
            imagem.setImageResource(R.drawable.logo);
        }
    }

    public void mudar(View view) {
        intente();
    }

    private void intente(){
        Intent it = new Intent(getApplicationContext(), MainActivity.class);
        it.putExtra("numero", numero);
        startActivity(it);
    }
}