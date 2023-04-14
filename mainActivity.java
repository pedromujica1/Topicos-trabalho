//https://blogger.googleusercontent.com/img/a/AVvXsEifgvU8-xQ-GVGEZ0N2Rm7-xFRFiG6lqgdh_MTG0ddKhchQRpFHTOKcjP1dH_NuwQGI7ZGCnVKf16guMvNOemmW1stUtJNF2l4PlxzInP8Agodmm0qvQ5DILYqXaPYvUCp2sPg1kQ1AY7rC29gEYFO1IZTq5nNyOuXSEU0wVyHBa5u4D0Wdx0GkJAWV_Q=w1200-h630-p-k-no-nu
package com.example.jokepo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView name1;
    private TextView name2;
    private TextView textResult;

    public ImageView papelJog1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1 = findViewById(R.id.textResultado);
        name2 = findViewById(R.id.textResultado);
        textResult = findViewById(R.id.textResultado);

    }
    public void jogar (View View){

        Button button =findViewById(R.id.button);
        Random random = new Random();

        int numAleatorioJog1 = random.nextInt(3);
        int numAleatorioJog2 = random.nextInt(3);

        ImageView papelJog1 = findViewById(R.id.papelJog1);
        ImageView papelJog2 = findViewById(R.id.papelJog2);

        ImageView pedraJog1 = findViewById(R.id.pedraJog1);
        ImageView pedraJog2 = findViewById(R.id.pedraJog2);

        ImageView tesouraJog1 = findViewById(R.id.tesouraJog1);
        ImageView tesouraJog2 = findViewById(R.id.tesouraJog2);

        ImageView imageView = null;
        if (numAleatorioJog1 == 1) {
            papelJog1.setVisibility(View.VISIBLE);
//            pedraJog1.setImageDrawable(null);
//            tesouraJog1.setImageDrawable(null);
        } else if (numAleatorioJog1 == 2) {
            pedraJog1.setVisibility(View.VISIBLE);
//            papelJog1.setImageDrawable(null);
//            tesouraJog1.setImageDrawable(null);
        } else {
            tesouraJog1.setVisibility(View.VISIBLE);
//            papelJog1.setImageDrawable(null);
//            pedraJog1.setImageDrawable(null);
        }

        if (numAleatorioJog2 == 1) {
            papelJog2.setVisibility(View.VISIBLE);

//            pedraJog2.setImageDrawable(null);
//            tesouraJog2.setImageDrawable(null);
        } else if (numAleatorioJog2 == 2) {
            pedraJog2.setVisibility(View.VISIBLE);
//            imageView.setImageResource(R.drawable.pedra);
//
//            papelJog2.setImageDrawable(null);
//            tesouraJog2.setImageDrawable(null);

        } else {
            tesouraJog2.setVisibility(View.VISIBLE);
            //imageView.setImageResource(R.drawable.tesoura);

            //papelJog2.setImageDrawable(null);
            //pedraJog2.setImageDrawable(null);
        }
//        Pedra perde para papel[1] e ganha para tesoura[3]
//        Papel perde para tesoura[3] e ganha para pedra[2]
//        Tesoura perde para pedra[2] e ganha para papel[1]
        //int[] images = {R.drawable.papel, R.drawable.tesoura, R.drawable.pedra};
        if(((numAleatorioJog1 == 3) && (numAleatorioJog2 == 1)) || ((numAleatorioJog1 == 2) && (numAleatorioJog2 == 3)) || ((numAleatorioJog1 == 1) && (numAleatorioJog2 == 2))){
            textResult = name1;
        }else if(numAleatorioJog1 != numAleatorioJog2) {
            textResult = name2;
        }
    }
}
