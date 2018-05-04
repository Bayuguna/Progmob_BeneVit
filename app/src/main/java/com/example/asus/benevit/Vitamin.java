package com.example.asus.benevit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 5/2/2018.
 */

public class Vitamin extends AppCompatActivity {
    private RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    int position;
    List<VitaminHome> listVitamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vitamin_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_vit);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        position=getIntent().getIntExtra("position",0);
        listVitamin = new ArrayList<>();

        ListVitamin();
    }

    public void ListVitamin(){
       switch (position){
            case 0:
                listVitamin.add(new VitaminHome(R.drawable.va, "Wortel", "Wortel termasuk kedalam jenis sayur-sayuran yang berwarna orange. Bagi kebanyakan masyaraka wortel dijadikan bahan untuk membuat soup"));
                listVitamin.add(new VitaminHome(R.drawable.vb, "Tomat", "Ini adalah Vitamin B"));
                listVitamin.add(new VitaminHome(R.drawable.vc, "Strawberry", "Ini adalah Vitamin C"));
                break;
            case 1:
                listVitamin.add(new VitaminHome(R.drawable.va, "Pisang", "Wortel termasuk kedalam jenis sayur-sayuran yang berwarna orange. Bagi kebanyakan masyaraka wortel dijadikan bahan untuk membuat soup"));
                listVitamin.add(new VitaminHome(R.drawable.vb, "Buah Naga", "Ini adalah Vitamin B"));
                listVitamin.add(new VitaminHome(R.drawable.vc, "Susu", "Ini adalah Vitamin C"));
                break;
            case 2:
                listVitamin.add(new VitaminHome(R.drawable.va, "Jeruk", "Wortel termasuk kedalam jenis sayur-sayuran yang berwarna orange. Bagi kebanyakan masyaraka wortel dijadikan bahan untuk membuat soup"));
                listVitamin.add(new VitaminHome(R.drawable.vb, "Asem", "Ini adalah Vitamin B"));
                listVitamin.add(new VitaminHome(R.drawable.vc, "Kiwi", "Ini adalah Vitamin C"));
                break;
            default:
        }
        loadRecyclerView();
    }
    public void loadRecyclerView(){

        adapter = new VitaminAdapter(listVitamin, this);
        recyclerView.setAdapter(adapter);

    }
}
