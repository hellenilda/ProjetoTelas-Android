package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaEmail extends AppCompatActivity {
    private EditText etDestinatarioEmail;
    private EditText etAssuntoEmail;
    private EditText etMensagemEmail;
    private Button btnEviarEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_email);

        etDestinatarioEmail = findViewById(R.id.etDestinatarioEmail);
        etAssuntoEmail = findViewById(R.id.etAssuntoEmail);
        etMensagemEmail = findViewById(R.id.etMensagemEmail);
        btnEviarEmail = findViewById(R.id.btnEnviarEmail);

        btnEviarEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String destinatarioEmail = etDestinatarioEmail.getText().toString();
                String assuntoEmail = etAssuntoEmail.getText().toString();
                String mensagemEmail = etMensagemEmail.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{destinatarioEmail});
                intent.putExtra(Intent.EXTRA_SUBJECT, assuntoEmail);
                intent.putExtra(Intent.EXTRA_TEXT, mensagemEmail);

                startActivity(Intent.createChooser(intent, "Enviar e-mail"));
            }
        });
    }
}