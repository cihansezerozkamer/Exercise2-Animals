package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal> animals = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal(" Cat",R.mipmap.cat));
        animals.add(new Animal(" Horse",R.mipmap.ic_horse));
        animals.add(new Animal(" Bird",R.mipmap.ic_bird));
        animals.add(new Animal(" Women",R.mipmap.ic_women));
        animals.add(new Animal(" Man",R.mipmap.ic_man));
        ListView listView = findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this,animals);
        listView.setAdapter(adapter);
    }
}