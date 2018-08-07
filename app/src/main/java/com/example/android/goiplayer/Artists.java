package com.example.android.goiplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<ArtistDetails> words = new ArrayList<ArtistDetails>();
        words.add(new ArtistDetails("In My Mind", "lutti"));
        words.add(new ArtistDetails("Rise", "lutti"));
        words.add(new ArtistDetails("Lullaby", "lutti"));
        words.add(new ArtistDetails("Bambola", "lutti"));
        words.add(new ArtistDetails("Sunshine", "lutti"));
        words.add(new ArtistDetails("Born to Bt Born", "lutti"));
        words.add(new ArtistDetails("Jackie Chan", "lutti"));
        words.add(new ArtistDetails("Familiar", "lutti"));
        words.add(new ArtistDetails("Flames", "lutti"));
        words.add(new ArtistDetails("One Kiss", "lutti"));
        words.add(new ArtistDetails("In My Feelings", "lutti"));
        words.add(new ArtistDetails("La Cintura", "lutti"));

        ArtistDetailsAdapter adapter = new ArtistDetailsAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_artists);

        listView.setAdapter(adapter);
    }
}
