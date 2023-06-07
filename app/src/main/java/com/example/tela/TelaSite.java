package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaSite extends AppCompatActivity {
    private TextView tvSite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_site);

        tvSite = findViewById(R.id.tvIFPB);
        tvSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://ifpb.edu.br";
                Intent linkar = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(linkar);
            }
        });
    }
}