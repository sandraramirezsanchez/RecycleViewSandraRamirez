package com.example.examencomprensivo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    List<ListElements>elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "Pedro", "México", "Activo"));
        elements.add(new ListElement("#607d8b", "Julio", "Tabasco", "Activo"));
        elements.add(new ListElement("#03a9f4", "Alejandra", "Chihuahua", "Cancelado"));
        elements.add(new ListElement("#f44336", "Jessica", "Durango", "Inactivo"));
        elements.add(new ListElement("#009688", "Armando", "Yucatán", "Activo"));
        elements.add(new ListElement("#607d8b", "Yovany", "Quintana Roo", "Activo"));

        ListAdapter  listAdapter = new ListAdapter(elements,this);
        Recyclerview recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapterP(listAdapter);
     }
}