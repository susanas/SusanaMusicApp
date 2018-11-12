package com.example.android.susanamusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView songs = findViewById(R.id.songs_view);
        songs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, SongArtistActivity.class);
                startActivity(songIntent);
            }
        });

        TextView artists = findViewById(R.id.artists_view);
        artists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistSongActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}