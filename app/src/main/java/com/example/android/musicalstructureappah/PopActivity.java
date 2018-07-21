package com.example.android.musicalstructureappah;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Try not to confuse with list_view which has LinearLayout
        setContentView(R.layout.activity_pop);

        ArrayList<Music> musicInfo = new ArrayList<>();

        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));
        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));


        MusicAdapter musicAdapter = new MusicAdapter(this, musicInfo);
//        Try not to confuse with list_view which has LinearLayout
        ListView listView = (ListView) findViewById(R.id.activity_pop);
        listView.setAdapter(musicAdapter);


    }
}
