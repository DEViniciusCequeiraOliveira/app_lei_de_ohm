package com.example.leideohm;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CorrenteActivity extends AppCompatActivity {

    Button btnCalcular;
    TextView textOutputResultado, textResultado;
    EditText editTensao, editResistencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corrente);

        btnCalcular = findViewById(R.id.buttonCalcular);

        editResistencia = findViewById(R.id.editTextResistencia);
        editTensao = findViewById(R.id.editTextTensao);

        textResultado = findViewById(R.id.textView5);
        textOutputResultado = findViewById(R.id.textViewResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tensao = Double.parseDouble(editTensao.getText().toString());
                Double resistencia = Double.parseDouble(editResistencia.getText().toString());

                Double corrente = tensao / resistencia;

                textOutputResultado.setText(String.format( "%,.2f v", corrente));

                textResultado.setVisibility(View.VISIBLE);
                textOutputResultado.setVisibility(View.VISIBLE);
            }
        });
    }
}