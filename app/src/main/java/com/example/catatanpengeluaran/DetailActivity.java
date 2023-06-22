package com.example.catatanpengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    TextView tvNama, Tvnomer, tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tvNama);
        Tvnomer = findViewById(R.id.tvNomer);
        tvStatus = findViewById(R.id.tvStatus);

        KontakModel element = (KontakModel) getIntent().getSerializableExtra("KontakModel");
        tvNama.setText(element.getNama());
        tvNama.setTextColor(Color.parseColor(element.getColor()));
        Tvnomer.setText(element.getHp());
        tvStatus.setText(element.getStatus());
    }
}