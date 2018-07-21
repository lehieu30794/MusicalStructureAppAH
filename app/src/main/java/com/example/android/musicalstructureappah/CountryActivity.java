package com.example.android.musicalstructureappah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        ArrayList<String> musicInfo = new ArrayList<String>();

        musicInfo.add("Tequila");

        ArrayAdapter<String> musicItem = new ArrayAdapter<String>(this,
                R.layout.list_view, musicInfo);

        ListView listView = (ListView) findViewById(R.id.activity_country);
    }
}
