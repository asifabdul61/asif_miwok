package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one","onu"));
        words.add(new word("two","rendu"));
        words.add(new word("three","moonu"));
        words.add(new word("four","nalu"));
        words.add(new word("five","ainju"));
        words.add(new word("six","aaru"));
        words.add(new word("seven","ealu"));
        words.add(new word("eight","aitu"));
        words.add(new word("nine","onbadu"));
        words.add(new word("ten","pathu"));

        Log.v("NumbersActivity", "Words at index 1 : " + words.get(1));

        //LinearLayout numbersView = (LinearLayout) findViewById(R.id.activity_numbers);
        //TextView wordView = new TextView(this);
        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
