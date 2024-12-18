package com.example.sayurdanau;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Inisialisasi setiap ImageView berdasarkan ID
        ImageView imageBaput = findViewById(R.id.baput);
        ImageView imageCabe = findViewById(R.id.cabe);
        ImageView imageKol = findViewById(R.id.kol);
        ImageView imageBuncis = findViewById(R.id.buncis);
        ImageView imageWortel = findViewById(R.id.wortel);
        ImageView imageTerong = findViewById(R.id.terong);

        // EditText untuk pencarian
        EditText searchEditText = findViewById(R.id.search_bar); // Pastikan ID sesuai dengan yang ada di XML

        // Set OnClickListener untuk setiap ImageView (gambar sayuran)
        imageBaput.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
            intent.putExtra("vegetable", "Bawang Putih");
            startActivity(intent);
        });

        imageCabe.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
            intent.putExtra("vegetable", "Cabe Keriting");
            startActivity(intent);
        });

        imageKol.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
            intent.putExtra("vegetable", "Kol");
            startActivity(intent);
        });

        imageBuncis.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
            intent.putExtra("vegetable", "Buncis");
            startActivity(intent);
        });

        imageWortel.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
            intent.putExtra("vegetable", "Wortel");
            startActivity(intent);
        });

        imageTerong.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
            intent.putExtra("vegetable", "Terong");
            startActivity(intent);
        });

        // Logika pencarian berdasarkan teks dari EditText
        searchEditText.setOnEditorActionListener((v, actionId, event) -> {
            String searchQuery = searchEditText.getText().toString().trim();

            if (!searchQuery.isEmpty()) {
                Intent intent = null;
                if (searchQuery.equalsIgnoreCase("Bawang Putih")) {
                    intent = new Intent(MenuActivity.this, DetailActivity.class);
                    intent.putExtra("vegetable", "Bawang Putih");
                } else if (searchQuery.equalsIgnoreCase("Cabe Keriting")) {
                    intent = new Intent(MenuActivity.this, DetailActivity.class);
                    intent.putExtra("vegetable", "Cabe Keriting");
                } else if (searchQuery.equalsIgnoreCase("Kol")) {
                    intent = new Intent(MenuActivity.this, DetailActivity.class);
                    intent.putExtra("vegetable", "Kol");
                } else if (searchQuery.equalsIgnoreCase("Buncis")) {
                    intent = new Intent(MenuActivity.this, DetailActivity.class);
                    intent.putExtra("vegetable", "Buncis");
                } else if (searchQuery.equalsIgnoreCase("Wortel")) {
                    intent = new Intent(MenuActivity.this, DetailActivity.class);
                    intent.putExtra("vegetable", "Wortel");
                } else if (searchQuery.equalsIgnoreCase("Terong")) {
                    intent = new Intent(MenuActivity.this, DetailActivity.class);
                    intent.putExtra("vegetable", "Terong");
                }

                if (intent != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(MenuActivity.this, "Sayuran tidak ditemukan", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(MenuActivity.this, "Masukkan kata kunci pencarian", Toast.LENGTH_SHORT).show();
            }
            return true;
        });
    }
}
