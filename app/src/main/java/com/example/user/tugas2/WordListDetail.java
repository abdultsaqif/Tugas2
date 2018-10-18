package com.example.user.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WordListDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlist_item_detail);
        Intent intent = getIntent();
        String ingredients = intent.getStringExtra("Ingredients");
        String process = intent.getStringExtra("Process");

    }
}
