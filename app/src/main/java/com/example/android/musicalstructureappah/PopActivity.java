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
        setContentView(R.layout.list_view);

        ArrayList<Music> musicInfo = new ArrayList<>();

        musicInfo.add(new Music("Shape of you", "Ed Sheeran"));

        ArrayAdapter<Music> musicAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, musicInfo);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(musicAdapter);


    }
}
