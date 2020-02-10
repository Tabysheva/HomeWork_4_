package com.example.homework_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
        getNewStudent();


    }

    public void getNewStudent() {
        String abc = getIntent().getStringExtra("key");
        adapter.addText(abc);
        Log.d("ololo", "getNewStudent: " + abc);
    }

    public void openHint(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
