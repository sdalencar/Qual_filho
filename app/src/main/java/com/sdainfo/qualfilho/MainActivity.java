package com.sdainfo.qualfilho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView primeiro, segundo, terceiro, quarto, quinto;
    private  int re, ma, isa, duda, se;
    private int resultado ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado =0;

        primeiro = findViewById(R.id.textView11);
        segundo = findViewById(R.id.textView12);
        terceiro = findViewById(R.id.textView13);
        quarto = findViewById(R.id.textView14);
        quinto = findViewById(R.id.textView15);

        Bundle dados = getIntent().getExtras();
        if(dados != null) {
            resultado = dados.getInt("numero");
        }

        switch (resultado){
            case 0:
                isa += 1;
                break;
            case 1:
                ma += 1;
                break;
            case 2:
                re += 1;
                break;
            case 3:
                duda += 1;
                break;
            case 4:
                se += 1;
                break;
        }

        primeiro.setText("Isadora : " + isa);
        segundo.setText("Eduarda : " + duda);
        terceiro.setText("Mariane : " + ma);
        quarto.setText("Renato : " + re);
        quinto.setText("Sérgio : " + se);
        }

 

    public void sortear(View view) {
        intente();
    }

    private void intente(){
        Intent it = new Intent(getApplicationContext(), MainActivity2.class);
        int numero = new Random().nextInt(5);
        it.putExtra("numero", numero);
        startActivity(it);
    }
}