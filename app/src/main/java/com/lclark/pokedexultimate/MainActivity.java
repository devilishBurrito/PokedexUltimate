package com.lclark.pokedexultimate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    PokeArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        actionBar Setup
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        toolbar.setLogo(R.drawable.pokemon);
        setSupportActionBar(toolbar);


        ListView listview = (ListView) findViewById(R.id.listview);

        Pokedex pokedex = new Pokedex();

        mAdapter = new PokeArrayAdapter(this, R.layout.raw_pokemon, pokedex.getPokemons());

        listview.setAdapter(mAdapter);
//        listview.setOnClickListener(this);

        //push test


//            to set actionbar to null and display text again (app title)
//        toolbar.setLogo(null);
//        getSupportActionBar().setDisplayShowTitleEnabled(true);
//        getSupportActionBar().setTitle(R.string.app_name);


    }


}
