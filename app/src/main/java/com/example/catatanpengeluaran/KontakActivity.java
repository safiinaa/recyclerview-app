package com.example.catatanpengeluaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class KontakActivity extends AppCompatActivity {

    List<KontakModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);

    }

    private void addData(){
        elements = new ArrayList<>();
        elements.add(new KontakModel("Safii",  "089765544", "Avilable", "#99627A"));
        elements.add(new KontakModel("Otii",  "089765544", "Avilable", "#1B9C85"));
        elements.add(new KontakModel("ayaa",  "089765544", "Avilable", "#47A992"));
        elements.add(new KontakModel("rionzy",  "089765544", "Avilable", "#9384D1"));
        elements.add(new KontakModel("faishal",  "089765544", "Avilable", "#088395"));
        elements.add(new KontakModel("riskaa",  "089765544", "Avilable", "#E76161"));
        elements.add(new KontakModel("abing",  "089765544", "Avilable", "#BE5A83"));
        elements.add(new KontakModel("disa",  "089765544", "Avilable", "#7C9070"));

        ContactAdapter adapter = new ContactAdapter(elements, new ContactAdapter.OnItemClickListener(){});
    }

    RecyclerView recyclerView = findViewById(R.id.rvContact);
    recyclerView.setHasFixedSize(true);

}
