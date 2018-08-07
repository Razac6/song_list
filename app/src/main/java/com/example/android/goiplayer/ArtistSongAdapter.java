package com.example.android.goiplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistSongAdapter extends ArrayAdapter<ArtistSong> {
    public ArtistSongAdapter(Context context, ArrayList<ArtistSong> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        ArtistSong currentWord = getItem(position);

        TextView songsTextView = (TextView) listItemView.findViewById(R.id.songs_text_view);
        songsTextView.setText(currentWord.getmSong());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(currentWord.getmArtist());


        return listItemView;
    }
}
