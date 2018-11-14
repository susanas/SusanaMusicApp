package com.example.android.susanamusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_list);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String detail = intent.getStringExtra("detail");

        TextView textViewToChange = findViewById(R.id.matched_name);
        TextView detailToChange = findViewById(R.id.matched_detail);
        textViewToChange.setText(name);
        detailToChange.setText(detail);
    }
}
