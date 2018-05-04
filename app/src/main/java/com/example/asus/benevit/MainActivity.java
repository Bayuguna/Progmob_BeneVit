package com.example.asus.benevit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    List<HomeVitamin> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItem = new ArrayList<>();

        ListVitamin();
    }

    public void ListVitamin() {
        listItem.add(new HomeVitamin(R.drawable.va, "Vitamin A"));
        listItem.add(new HomeVitamin(R.drawable.vb, "Vitamin B"));
        listItem.add(new HomeVitamin(R.drawable.vc, "Vitamin C"));
        listItem.add(new HomeVitamin(R.drawable.vd, "Vitamin D"));
        listItem.add(new HomeVitamin(R.drawable.ve, "Vitamin E"));
        listItem.add(new HomeVitamin(R.drawable.vk, "Vitamin K"));

        loadRecyclerView();
    }
    public void loadRecyclerView(){

        adapter = new MyAdapter(listItem, this);
        recyclerView.setAdapter(adapter);

    }
}