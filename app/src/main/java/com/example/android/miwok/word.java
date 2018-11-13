package com.example.android.miwok;

/**
 * Created by ABDUL ASIF on 04-11-2018.
 */

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
