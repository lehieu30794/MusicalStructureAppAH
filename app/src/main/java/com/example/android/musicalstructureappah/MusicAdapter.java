package com.example.android.musicalstructureappah;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Activity context, ArrayList<Music> itemToDisplay) {
//        Use public constructor in the Super Class to call for a custom MusicAdapter using two above input parameters
        super(context, 0, itemToDisplay);
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {

        if (convertView == null) {
            /*No need to find ListView here, just inflate a new list view
            ListView l = (ListView) convertView.findViewById(R.id.list_view);*/

//            LayoutInflater is an interesting object. It does not need to be declared with a 'new' keyword
//            After that, it calls a method named 'from', then 'inflate' with different input paras
//            getContext() here probably means MusicAdpater object will get context of the current activity which calls MusicAdapter
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

//       Get current position to adapt
        Music currentItem = getItem(position);

//        Have to use 'convertView.' to call findViewById. Why? knowing that I am modifying getView method
        TextView songTextView = (TextView) convertView.findViewById(R.id.song_text_view);
//        Call a method getSong declared in Music class
        songTextView.setText(currentItem.getSong());

        TextView artistTextView = (TextView) convertView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentItem.getArtist());


        return convertView;
    }
}
