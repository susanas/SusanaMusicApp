package com.example.android.susanamusicapp;

import android.support.v7.app.AppCompatActivity;

public class SelectPlayActivity extends AppCompatActivity {
    String songArtistNames [][] = {{"When It Was Now", "Atlas Genius"},
            {"Random Access Memories", "Daft Punk"}, {"Making Mirrors", "Gotye"},
            {"Best Day of My Life", "American Authors"} };
    boolean isMatched = false;

    public boolean getSelectedMatch(String name) {
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if (name == songArtistNames[i][j]) {
                    isMatched = true;
                }
                else break;
            }
        }
        return isMatched;
    }
}