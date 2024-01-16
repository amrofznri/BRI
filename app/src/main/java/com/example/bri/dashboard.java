package com.example.bri;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {

    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        // Temukan view berdasarkan ID
        ImageButton cttnKeuanganButton = findViewById(R.id.cttnkeuangan);
        ImageButton setortunai = findViewById(R.id.dmptdigital);
        ImageButton transferButton = findViewById(R.id.transfer);
        ImageButton pulsaButton = findViewById(R.id.pulsa);
        ImageButton brivaButton = findViewById(R.id.briva);
        ImageButton listrikButton = findViewById(R.id.listrik);
        ImageButton gopayButton = findViewById(R.id.gopay);
        ImageButton pemasukanButton = findViewById(R.id.pemasukan);
        Button pengeluaranButton = findViewById(R.id.pengeluaran);

        // Setel listener klik untuk masing-masing tombol
        cttnKeuanganButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika yang akan dijalankan ketika tombol Cacatan Keuangan diklik
                startActivity(new Intent(dashboard.this, catatankeuangan.class));
            }
        });
        setortunai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika yang akan dijalankan ketika tombol Cacatan Keuangan diklik
                startActivity(new Intent(dashboard.this, setortunai.class));
            }
        });
        transferButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika yang akan dijalankan ketika tombol Cacatan Keuangan diklik
                startActivity(new Intent(dashboard.this, tariktunai.class));
            }
        });
        brivaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika yang akan dijalankan ketika tombol Cacatan Keuangan diklik
                startActivity(new Intent(dashboard.this, briva.class));
            }
        });
        listrikButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika yang akan dijalankan ketika tombol Cacatan Keuangan diklik
                startActivity(new Intent(dashboard.this, listrik.class));
            }
        });
        pulsaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika yang akan dijalankan ketika tombol Cacatan Keuangan diklik
                startActivity(new Intent(dashboard.this, pulsadanpaketdata.class));
            }
        });
        gopayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika yang akan dijalankan ketika tombol Cacatan Keuangan diklik
                startActivity(new Intent(dashboard.this, gopay.class));
            }
        });
        // Implementasikan logika klik untuk tombol-tombol lainnya sesuai kebutuhan aplikasi Anda.

            }
        }
