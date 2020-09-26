package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String[] frases= {
            "A vingança nunca é plena, mata a alma e envenena",
            "Mais vale um pássaro na mão que dois voando",
            "Aprenda a ser grato sempre!",
            "Deixe os problemas de amanhã para o dia de amanhã",
            "Aquele que quer se tornar importante deve aprender a servir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void novaFrase(View view){
        TextView txtFrase = findViewById(R.id.txtFrase);
        int indiceFrase = (int) (Math.random() * frases.length);
        txtFrase.setText(frases[indiceFrase]);
    }
}