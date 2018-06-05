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
                listVitamin.add(new VitaminHome("Vitamin A merupakan salah satu jenis vitamin larut dalam lemak yang berperan penting dalam pembentukan sistem penglihatan yang baik. Terdapat beberapa senyawa yang digolongkan ke dalam kelompok vitamin A, antara lain retinol, retinil palmitat, dan retinil asetat."));
//                listVitamin.add(new VitaminHome(R.drawable.p2, "Tomat"));
//                listVitamin.add(new VitaminHome(R.drawable.p3, "Strawberry"));
                break;
            case 1:
                listVitamin.add(new VitaminHome("Vitamin B adalah 8 vitamin yang larut dalam air dan memainkan peran penting dalam metabolisme sel. Dalam sejarahnya, vitamin pernah diduga hanya mempunyai satu tipe, yaitu vitamin B (seperti orang mengenal vitamin C atau vitamin D)."));
//                listVitamin.add(new VitaminHome(R.drawable.p2, "Buah Naga"));
//                listVitamin.add(new VitaminHome(R.drawable.p3, "Susu"));
                break;
            case 2:
                listVitamin.add(new VitaminHome("Vitamin C adalah salah satu jenis vitamin yang larut dalam air dan memiliki peranan penting dalam menangkal berbagai penyakit."));
//                listVitamin.add(new VitaminHome(R.drawable.p2, "Asem"));
//                listVitamin.add(new VitaminHome(R.drawable.p3, "Kiwi"));
                break;
           case 3:
               listVitamin.add(new VitaminHome("Vitamin D adalah grup vitamin yang larut dalam lemak prohormon. Vitamin D dikenal juga dengan nama kalsiferol. Penamaan ini berdasarkan International Union of Pure and Applied Chemist (IUPAC). Di dalam tubuh, vitamin ini banyak berperan dalam pembentukkan struktur tulang dan gigi yang baik."));
//               listVitamin.add(new VitaminHome(R.drawable.p2, "Tahu"));
//               listVitamin.add(new VitaminHome(R.drawable.p3, "Jamur Potabela"));
               break;
           case 4:
               listVitamin.add(new VitaminHome("Vitamin E adalah nama umum untuk dua kelas molekul (tocopherol dan tocotrienol) yang memiliki aktivitas vitamin E dalam nutrisi.Vitamin E bukan nama untuk setiap satuan bahan kimia spesifik namun, untuk setiap campuran yang terjadi di alam yang menyediakan fungsi vitamin E dalam nutrisi."));
//               listVitamin.add(new VitaminHome(R.drawable.p2, "Alpukat"));
//               listVitamin.add(new VitaminHome(R.drawable.p3, "Bayam"));
               break;
           case 5:
               listVitamin.add(new VitaminHome("Vitamin K (K dari Koagulations-Vitamin dalam Bahasa Jerman dan Bahasa Denmark) merujuk pada sekelompok vitamin lipofilik dan hidrofobik yang dibutuhkan untuk modifikasi pascatranslasi dari berbagai macam protein, seperti dalam proses pembekuan darah. Secara kimia vitamin ini adalah turunan 2-metil-1,4-naftokuinona."));
//               listVitamin.add(new VitaminHome(R.drawable.p2, "Brokoli"));
//               listVitamin.add(new VitaminHome(R.drawable.p3, "Asparagus"));
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
