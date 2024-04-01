package com.example.cc10624superhero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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


        lvHero.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nameHero = items[position];

                Intent intent = new Intent(MainActivity.this, ShowHero.class);

                Bundle bundle = new Bundle();



                bundle.putString("heroname", nameHero);
                bundle.putInt("herono",position);
                intent.putExtras(bundle);
                startActivity(intent);










            }
        });













    }
}