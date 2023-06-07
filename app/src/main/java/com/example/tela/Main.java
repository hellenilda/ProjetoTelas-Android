package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    
    private Button btnTelefone;
    private Button btnSMS;
    private Button btnEmail;
    private Button btnSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelefone = findViewById(R.id.btnTelefone);
        btnSMS = findViewById(R.id.btnSMS);
        btnEmail = findViewById(R.id.btnEmail);
        btnSite = findViewById(R.id.btnSite);

        btnTelefone.setOnClickListener( new BtnTelaTelefoneOnClickListener() );
        btnSMS.setOnClickListener(new BtnTelaSMSOnClickListener());
        btnEmail.setOnClickListener(new BtnTelaEmailOnClickListener());
        btnSite.setOnClickListener(new BtnTelaSiteOnClickListener());

    }

    private class BtnTelaTelefoneOnClickListener implements View
            .OnClickListener{
        @Override
        public void onClick(View view) {
            Intent telaTelefone = new Intent(Main.this, TelaTelefone.class);
            startActivity(telaTelefone);
        }
    }

    private class BtnTelaSMSOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent telaSMS = new Intent(Main.this, TelaSMS.class);
            startActivity(telaSMS);
        }
    }

    private class BtnTelaEmailOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent telaEmail = new Intent(Main.this, TelaEmail.class);
            startActivity(telaEmail);
        }
    }

    private class BtnTelaSiteOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent telaSite = new Intent(Main.this, TelaSite.class);
            startActivity(telaSite);
        }
    }
}