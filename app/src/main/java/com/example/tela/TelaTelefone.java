package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaTelefone extends AppCompatActivity {
    private EditText etTelefone;
    private Button btnLigar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_telefone);

        btnLigar = findViewById(R.id.btnLigar);
        btnLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTelefone = findViewById(R.id.etTelefone);

                String numeroDeTelefone = etTelefone.getText().toString();
                Uri atividade = Uri.parse("tel:" + numeroDeTelefone);

                Intent ligar = new Intent(Intent.ACTION_DIAL, atividade);
                startActivity(ligar);
            }
        });

    }
}