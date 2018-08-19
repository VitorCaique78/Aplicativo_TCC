package com.example.rodrigo.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class Calc extends Activity {

    TextView textView;
    

    private int[] numbotoes = {R.id.but0, R.id.but1, R.id.but2, R.id.but3, R.id.but4, R.id.but5, R.id.but6, R.id.but7, R.id.but8, R.id.but9};

    private int[] opebotoes = {R.id.butmais, R.id.butmen, R.id.butmult, R.id.butdiv};

    private boolean ultnumero;

    private boolean estadoerro;

    private boolean ultimoponto;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        this.textView = (TextView) findViewById(R.id.textView);
        numerosclique();
        operadoresclique();
        
    }



    private void numerosclique() {
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) v;
                if (estadoerro) {
                    textView.setText(button.getText());
                    estadoerro = false;
                } else {
                    textView.append(button.getText());
                }
                ultnumero = true;
            }
        };
        for (int id : numbotoes) {
            findViewById(id).setOnClickListener(listener);
        }
    }


    private void operadoresclique() {
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ultnumero && !estadoerro) {
                    Button button = (Button) v;
                    textView.append(button.getText());
                    ultnumero = false;
                    ultimoponto = false;    
                }
            }
        };
        for (int id : opebotoes) {
            findViewById(id).setOnClickListener(listener);
        }
        findViewById(R.id.butponto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ultnumero && !estadoerro && !ultimoponto) {
                    textView.append(".");
                    ultnumero = false;
                    ultimoponto = true;
                }
            }
        });
        findViewById(R.id.butlimpa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");  
                ultnumero = false;
                estadoerro = false;
                ultimoponto = false;
            }
        });

        findViewById(R.id.butigual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEqual();
            }
        });
    }

  
    private void onEqual() {
        
        if (ultnumero && !estadoerro) {
            String txt = textView.getText().toString();
            Expression expression = new ExpressionBuilder(txt).build();
            try {
                double result = expression.evaluate();
                textView.setText(Double.toString(result));
                ultimoponto = true; 
            } catch (ArithmeticException ex) {
                textView.setText("Error");
                estadoerro = true;
                ultnumero = false;
            }
        }
    }

}