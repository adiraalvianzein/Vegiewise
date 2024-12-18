package com.example.sayurdanau;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String vegetableName = getIntent().getStringExtra("vegetableName");

        if (vegetableName != null) {
            switch (vegetableName) {
                case "Bawang Putih":
                    setContentView(R.layout.bawangputih);
                    break;
                case "Cabe Keriting":
                    setContentView(R.layout.cabekeriting);
                    break;
                case "Kol":
                    setContentView(R.layout.kol);
                    break;
                case "Buncis":
                    setContentView(R.layout.buncis);
                    break;
                case "Wortel":
                    setContentView(R.layout.wortel2);
                    break;
                case "Terong":
                    setContentView(R.layout.terong);
                    break;
            }
        }

        // Tombol kembali
        ImageView backButton = findViewById(R.id.back_button);
        if (backButton != null) {
            backButton.setOnClickListener(view -> finish());
        }

        // Menampilkan nama sayuran
        TextView title = findViewById(R.id.vegetableTitle);
        if (title != null) {
            title.setText(vegetableName);
        }
    }
}
