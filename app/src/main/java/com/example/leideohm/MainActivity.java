package com.example.leideohm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCorrente, btnTensao, btnResistencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCorrente = findViewById(R.id.buttonCorrente);
        btnResistencia = findViewById(R.id.buttonResitencia);
        btnTensao = findViewById(R.id.buttonTensao);

        btnCorrente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CorrenteActivity.class));
            }
        });

    }
}