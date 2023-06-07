package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaSMS extends AppCompatActivity {

    private EditText etDestinatarioSMS;
    private EditText etMensagemSMS;
    private Button btnEnviarSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sms);

        btnEnviarSMS = findViewById(R.id.btnEnviarSMS);

        btnEnviarSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDestinatarioSMS = findViewById(R.id.etDestinatarioSMS);
                etMensagemSMS = findViewById(R.id.etMensagemSMS);

                String destinatarioSMS = etDestinatarioSMS.getText().toString();
                String mensagemSMS = etMensagemSMS.getText().toString();

                Uri uri = Uri.parse("sms:" + destinatarioSMS);
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("Mensagem_SMS", mensagemSMS);

                startActivity(intent);
            }
        });
    }
}
