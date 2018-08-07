package com.example.android.goiplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        ArrayList<ArtistSong> words = new ArrayList<ArtistSong>();
        words.add(new ArtistSong("In My Mind", "lutti"));
        words.add(new ArtistSong("Rise", "lutti"));
        words.add(new ArtistSong("Lullaby", "lutti"));
        words.add(new ArtistSong("Bambola", "lutti"));
        words.add(new ArtistSong("Sunshine", "lutti"));
        words.add(new ArtistSong("Born to Bt Born", "lutti"));
        words.add(new ArtistSong("Jackie Chan", "lutti"));
        words.add(new ArtistSong("Familiar", "lutti"));
        words.add(new ArtistSong("Flames", "lutti"));
        words.add(new ArtistSong("One Kiss", "lutti"));
        words.add(new ArtistSong("In My Feelings", "lutti"));
        words.add(new ArtistSong("La Cintura", "lutti"));

        ArtistSongAdapter adapter = new ArtistSongAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_songs);

        listView.setAdapter(adapter);
    }
}
