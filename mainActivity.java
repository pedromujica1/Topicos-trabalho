package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public TextView jogador1;
    public TextView jogador2;
    public TextView textResult;
    public ImageView papelJog1;
    public ImageView papelJog2;
    public ImageView pedraJog1;
    public ImageView pedraJog2;
    public ImageView tesouraJog1;
    public ImageView tesouraJog2;

    public TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jogador1 = findViewById(R.id.textJogador1);
        jogador2 = findViewById(R.id.textJogador2);
        textResult = findViewById(R.id.textResultado);
        papelJog1 = findViewById(R.id.papelJog1);
        papelJog2 = findViewById(R.id.papelJog2);

        pedraJog1 = findViewById(R.id.pedraJog);
        pedraJog2 = findViewById(R.id.pedraJog2);

        tesouraJog1 = findViewById(R.id.tesouraJog1);
        tesouraJog2 = findViewById(R.id.tesouraJog2);

        resultado = findViewById(R.id.textResultado);
    }
    public void jogar (View View){

        Button button =findViewById(R.id.button);

        Random random = new Random();

        String nome1 = jogador1.getText().toString();
        String nome2 = jogador2.getText().toString();

        int numAleatorioJog1 = random.nextInt(3);
        int numAleatorioJog2 = random.nextInt(3);



        if (numAleatorioJog1 == 0) {
            papelJog1.setVisibility(View.VISIBLE);
            pedraJog1.setVisibility(View.INVISIBLE);
            tesouraJog1.setVisibility(View.INVISIBLE);

//
        } else if (numAleatorioJog1 == 1) {
            pedraJog1.setVisibility(View.VISIBLE);
            tesouraJog1.setVisibility(View.INVISIBLE);
            papelJog1.setVisibility(View.INVISIBLE);
//
        } else if (numAleatorioJog1 == 2) {
            tesouraJog1.setVisibility(View.VISIBLE);
            papelJog1.setVisibility(View.INVISIBLE);
            pedraJog1.setVisibility(View.INVISIBLE);
//
        }

        if (numAleatorioJog2 == 0) {
            papelJog2.setVisibility(View.VISIBLE);
            pedraJog2.setVisibility(View.INVISIBLE);
            tesouraJog2.setVisibility(View.INVISIBLE);
//
        } else if (numAleatorioJog2 == 1) {
            pedraJog2.setVisibility(View.VISIBLE);
            tesouraJog2.setVisibility(View.INVISIBLE);
            papelJog2.setVisibility(View.INVISIBLE);
//
        } else if (numAleatorioJog2 == 2){
            tesouraJog2.setVisibility(View.VISIBLE);
            pedraJog2.setVisibility(View.INVISIBLE);
            papelJog2.setVisibility(View.INVISIBLE);
        }

        //Empate
        if (numAleatorioJog1 == numAleatorioJog2){
            resultado.setText("Empate! Jogue de novo");
        }



        //Jogador 1
        //(numAleatorioJog1 == 2) && (numAleatorioJog2 == 0)) tesoura ganha do papel
        //((numAleatorioJog1 == 0) && (numAleatorioJog2 == 1)) papel ganha da pedra
        //((numAleatorioJog1 == 1) && (numAleatorioJog2 == 2) pedra ganha da tesoura

        if((numAleatorioJog1 == 2) && (numAleatorioJog2 == 0)){
            resultado.setText("O vencedor é o jogador 1 "+ nome1);
        }if((numAleatorioJog1 == 0) && (numAleatorioJog2 == 1)) {
            resultado.setText("O vencedor é jogador 1" + nome1);
        }if((numAleatorioJog1 == 1) && (numAleatorioJog2 == 2)){
            resultado.setText("O vencedor é o jogador 1. Parabéns "+ nome1);
        }

        //Jogador 2
        //(numAleatorioJog1 == 0) && (numAleatorioJog2 == 1)) tesoura ganha do papel
        //((numAleatorioJog1 == 1) && (numAleatorioJog2 == 0)) papel ganha da pedra
        //((numAleatorioJog1 == 2) && (numAleatorioJog2 == 1) pedra ganha da tesoura


        if((numAleatorioJog1 == 0) && (numAleatorioJog2 == 2)){
            resultado.setText("O vencedor é jogador 2. Parabéns " + nome2);
        }if((numAleatorioJog1 == 1) && (numAleatorioJog2 == 0)) {
            resultado.setText("O vencedor é jogador 2. Parabéns " +nome2);
        }if((numAleatorioJog1 == 2) && (numAleatorioJog2 == 1)){
            resultado.setText("O vencedor é o jogador 2. Parabéns " + nome2);
        }
    }
}
