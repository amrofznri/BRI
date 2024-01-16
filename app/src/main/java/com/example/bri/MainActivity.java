package com.example.bri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton logo1 = findViewById(R.id.logo1);
        logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Memulai aktivitas baru saat tombol ditekan
                startActivity(new Intent(MainActivity.this, main1.class));
            }
        });
    }}
    // Fungsi untuk memulai aktivitas selanjutnya
