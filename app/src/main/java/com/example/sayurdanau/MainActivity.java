package com.example.sayurdanau;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ImageView baput, cabe, kol, buncis, wortel, terong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ImageViews
        baput = findViewById(R.id.baput);
        cabe = findViewById(R.id.cabe);
        kol = findViewById(R.id.kol);
        buncis = findViewById(R.id.buncis);
        wortel = findViewById(R.id.wortel);
        terong = findViewById(R.id.terong);

        // Set click listeners for each ImageView
        baput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("baput");
            }
        });

        cabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("cabe");
            }
        });

        kol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("kol");
            }
        });

        buncis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("buncis");
            }
        });

        wortel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("wortel");
            }
        });


