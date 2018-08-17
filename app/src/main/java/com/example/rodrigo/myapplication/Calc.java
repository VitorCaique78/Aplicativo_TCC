package com.example.rodrigo.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Calc extends Activity {

    TextView textView;

    Button limpa, parenteses, porcentagem, dividir, somar, subtrair, multiplicar, igual, negativo;

    Button um, dois, tres, quatro, cinco, seis, sete, oito, nove, ponto, zero ;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        textView = (TextView)findViewById(R.id.textView);

        limpa = (Button)findViewById(R.id.butlimpa);
        parenteses = (Button)findViewById(R.id.butpare);
        porcentagem = (Button)findViewById(R.id.butporc);
        dividir = (Button)findViewById(R.id.butdiv);
        somar = (Button)findViewById(R.id.butmais);
        subtrair = (Button)findViewById(R.id.butmen);
        multiplicar = (Button)findViewById(R.id.butmult);
        igual = (Button)findViewById(R.id.butigual);
        negativo = (Button)findViewById(R.id.butneg);

        um = (Button)findViewById(R.id.but1);
        dois = (Button)findViewById(R.id.but2);
        tres = (Button)findViewById(R.id.but3);
        quatro = (Button)findViewById(R.id.but4);
        cinco = (Button)findViewById(R.id.but5);
        seis = (Button)findViewById(R.id.but6);
        sete = (Button)findViewById(R.id.but7);
        oito = (Button)findViewById(R.id.but8);
        nove = (Button)findViewById(R.id.but9);
        ponto = (Button)findViewById(R.id.butponto);
        zero = (Button)findViewById(R.id.but0);

        limpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(null);
            }
        });


        parenteses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String S = textView.getText().toString();

            }
        });

        porcentagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "%");

            }
        });


        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "/");

            }
        });


        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "+");
            }
        });


        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "-");

            }
        });


        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "*");

            }
        });


        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });


        negativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "1");

            }
        });

        dois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "2");

            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "3");

            }
        });

        quatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "4");

            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "5");

            }
        });


        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "6");

            }
        });


        sete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "7");

            }
        });

        oito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "8");

            }
        });

        nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "9");

            }
        });

        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + ".");

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "0");

            }
        });
    }

}