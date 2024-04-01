package com.example.cc10624superhero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    private ListView lvHero;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvHero = (ListView)  findViewById(R.id.lvHero);
        items = getResources().getStringArray(R.array.herolist);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,items);
        lvHero.setAdapter(adapter);














    }
}