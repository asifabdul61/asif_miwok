package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ABDUL ASIF on 04-11-2018.
 */

public class WordAdapter extends ArrayAdapter<word> {
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        word currentWord = getItem(position);
        TextView defaultWord = (TextView) listItemView.findViewById(R.id.english_word);
        defaultWord.setText(currentWord.getDefaultTranslation());
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokWord.setText(currentWord.getMiwokTranslation());
        return listItemView;
    }

    public WordAdapter(Activity context, ArrayList<word> words){
        super(context,0,words);
    }

}
