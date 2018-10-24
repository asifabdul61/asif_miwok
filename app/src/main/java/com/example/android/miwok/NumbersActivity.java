package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        int i = 0;
        //ArrayList<int> number = new ArrayList<int>();
        LinearLayout number_layout = (LinearLayout) findViewById(R.id.activity_numbers);
        for(i = 0;i<40;i++){
            TextView num = new TextView(this);
            num.setText("" + (i+1));
            number_layout.addView(num);
        }
    }
}
