package com.example.android.goiplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistDetailsAdapter extends ArrayAdapter<ArtistDetails> {
    public ArtistDetailsAdapter(Context context, ArrayList<ArtistDetails> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_artist_item, parent, false);
        }
        ArtistDetails currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentWord.getmArtistName());

        TextView detailsTextView = (TextView) listItemView.findViewById(R.id.details_text_view);

        detailsTextView.setText(currentWord.getmBestSong());


        return listItemView;
    }
}
