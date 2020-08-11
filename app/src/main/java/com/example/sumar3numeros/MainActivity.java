package com.example.sumar3numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarando los objetos utilizados en el diseño
    private EditText edtNumero1, edtNumero2, edtNumero3;
    private Button btnSumar;
    private TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        edtNumero3 = findViewById(R.id.edtNumero3);
        btnSumar = findViewById(R.id.btnSumar);
        txtResultado = findViewById(R.id.txtResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Obteniendo los valores ingresados por el usuario
                String valor1 = edtNumero1.getText().toString();
                String valor2 = edtNumero2.getText().toString();
                String valor3 = edtNumero3.getText().toString();

                //Convirtiendo los valores String a valores numericos
                int numero1 = Integer.parseInt(valor1);
                int numero2 = Integer.parseInt(valor2);
                int numero3 = Integer.parseInt(valor3);

                int suma = numero1+numero2+numero3;

                String resultado = String.valueOf(suma);

                resultado = "La suma de los 3 numeros es : "+resultado;
                txtResultado.setText(resultado);

            }
        });
    }
}