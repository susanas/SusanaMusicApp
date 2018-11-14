package com.example.android.susanamusicapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(SongArtistActivity context, ArrayList<Song> songs){
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);
        TextView songTextView = listItemView.findViewById(R.id.list_view);
        songTextView.setText(currentSong.getName());

        TextView detailsTextView = listItemView.findViewById(R.id.detaillist_view);
        detailsTextView.setText(currentSong.getDetail());

        return listItemView;
    }
}