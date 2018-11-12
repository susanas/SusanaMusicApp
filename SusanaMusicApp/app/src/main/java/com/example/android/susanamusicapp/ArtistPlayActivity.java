package com.example.android.susanamusicapp;

import android.support.v7.app.AppCompatActivity;

public class ArtistPlayActivity extends AppCompatActivity {
    String artistSongNames [][] = {{"Atlas Genius", "When It Was Now"},
            {"Daft Punk", "Random Access Memories"}, {"Gotye", "Making Mirrors"},
            {"American Authors", "Best Day of My Life",} };
    boolean isMatched = false;

    public boolean getSelectedMatchArtist(String name) {
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if (name == artistSongNames[i][j]) {
                    isMatched = true;
                }
                else break;
            }
        }
        return isMatched;
    }
}