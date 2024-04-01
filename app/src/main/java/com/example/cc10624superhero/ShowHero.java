package com.example.cc10624superhero;

import androidx.appcompat.app.AppCompatActivity;

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



    }
}