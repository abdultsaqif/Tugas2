package com.example.user.tugas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        resep_nama.add("Nasi Goreng");
        resep_detail.add("Nasi goreng adalah nasi yg digoreng dan diberi bumbu");
        resep_ingredients.add(" 1. Nasi\n 2. Bumbu\n 3. Kecap");
        resep_process.add(" Diproses");
        resep_nama.add("Mie Goreng");
        resep_detail.add("Mie Goreng adalah makanan yg populer sebagai pengganti nasi");
        resep_ingredients.add(" 1. Mie\n 2. Air");
        resep_process.add(" Diproses");
        resep_nama.add("Rendang");
        resep_detail.add("Rendang adalah Daging yg mempunyai rasa yg pedas manis");
        resep_ingredients.add(" 1. Daging\n 2. Bumbu");
        resep_process.add(" Diproses");
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(this,resep_nama,resep_detail,resep_ingredients,resep_process);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
