package com.example.android.musicalstructureappah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        ArrayList<Music> musicInfo = new ArrayList<Music>();

        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));
        musicInfo.add(new Music("Tequila", "abc"));


        MusicAdapter musicAdapter = new MusicAdapter(this, musicInfo);

        ListView listView = (ListView) findViewById(R.id.activity_country);
        listView.setAdapter(musicAdapter);

//        LinearLayout l = (LinearLayout) findViewById(R.id.list_view);
//        ImageButton playButton = new ImageButton(this);
//        playButton.setImageResource(R.drawable.play_button);
//        playButton.setLayoutParams(new LinearLayout.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//        ));
//
//        l.addView(playButton);

    }
}
