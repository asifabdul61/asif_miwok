package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        Log.v("NumbersActivity", "Words at index 1 : " + words.get(1));

        LinearLayout numbersView = (LinearLayout) findViewById(R.id.activity_numbers);
        //TextView wordView = new TextView(this);
        int index = 0;
        int size = words.size();
        while(index < size) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            numbersView.addView(wordView);
            index++;
        }

    }
}
