package com.example.android.susanamusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistSongActivity extends AppCompatActivity {
    String nextNameArtist;
    String nextDetailArtist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        final ArrayList<Artist> artist = new ArrayList<Artist>();
        artist.add(new Artist("Atlas Genius", "When It Was Now"));
        artist.add(new Artist("Daft Punk", "Random Access Memories"));
        artist.add(new Artist("Gotye", "Making Mirrors"));
        artist.add(new Artist("American Authors", "Best Day of My Life"));

        ArtistAdapter adapter = new ArtistAdapter(this, artist);
        ListView listViewArtist = findViewById(R.id.aList);
        listViewArtist.setAdapter(adapter);

        listViewArtist.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Artist artistSelected = artist.get(position);
                nextNameArtist = artistSelected.getName();
                nextDetailArtist = artistSelected.getDetail();

                ArtistPlayActivity selectedArtist = new ArtistPlayActivity();
                boolean matched = selectedArtist.getSelectedMatchArtist(nextNameArtist);

                if (matched) {
                    setContentView(R.layout.details_list);
                    TextView textViewToChange = findViewById(R.id.matched_name);
                    TextView detailToChange = findViewById(R.id.matched_detail);
                    textViewToChange.setText(nextNameArtist);
                    detailToChange.setText(nextDetailArtist);
                }
            }
        });
    }
}