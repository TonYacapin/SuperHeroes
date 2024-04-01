package com.example.cc10624superhero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowHero extends AppCompatActivity {


    private TextView lblHeroName;
    private ImageView imgHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hero);



        lblHeroName = (TextView)  findViewById(R.id.lblHeroName);
        imgHero = (ImageView) findViewById(R.id.imgHero);


        Intent intent = getIntent();
        String heroname = "Hero is " + intent.getExtras().getString("heroname");
        lblHeroName.setText(heroname);

        int heroindex = intent.getExtras().getInt("herono");
        imgHero.setImageResource(getResources().getIdentifier("hero" + heroindex, "drawable", getPackageName()));



    }
}