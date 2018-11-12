package com.example.android.susanamusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongArtistActivity extends AppCompatActivity{
    String nextName;
    String nextDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_list);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("When It Was Now", "Atlas Genius"));
        songs.add(new Song("Random Access Memories", "Daft Punk"));
        songs.add(new Song("Making Mirrors", "Gotye"));
        songs.add(new Song("Best Day of My Life", "American Authors"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Song songSelected = songs.get(position);
                nextName = songSelected.getName();
                nextDetail = songSelected.getDetail();

                SelectPlayActivity selected = new SelectPlayActivity();
                boolean matched = selected.getSelectedMatch(nextName);

                if (matched) {
                    setContentView (R.layout.details_list);
                    TextView textViewToChange = findViewById(R.id.matched_name);
                    TextView detailToChange = findViewById(R.id.matched_detail);
                    textViewToChange.setText(nextName);
                    detailToChange.setText(nextDetail);
                }
            }
        });
    }
}