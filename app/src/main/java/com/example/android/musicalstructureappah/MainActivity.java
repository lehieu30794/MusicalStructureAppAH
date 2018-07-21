package com.example.android.musicalstructureappah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Set onClickListener object to pop_text_view
        TextView popTextView = (TextView) findViewById(R.id.pop_text_view);
        popTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent openPopActivity = new Intent(
                        MainActivity.this, PopActivity.class);
                startActivity(openPopActivity);


            }
        });

        TextView countryTextView = findViewById(R.id.country_text_view);
        countryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openCountryActivity = new Intent (MainActivity.this, CountryActivity.class);
                startActivity(openCountryActivity);
            }
        });
    }
}
