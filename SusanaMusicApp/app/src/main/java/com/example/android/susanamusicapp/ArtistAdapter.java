package com.example.android.susanamusicapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(ArtistSongActivity context, ArrayList<Artist> artists){
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Artist currentArtist = getItem(position);
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.list_view);
        artistTextView.setText(currentArtist.getName());

        TextView detailsTextView = (TextView) listItemView.findViewById(R.id.detaillist_view);
        detailsTextView.setText(currentArtist.getDetail());

        return listItemView;
        }
    }