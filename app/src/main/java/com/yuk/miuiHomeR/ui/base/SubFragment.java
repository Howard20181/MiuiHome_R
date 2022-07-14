package com.yuk.miuiHomeR.ui.base;

import android.os.Bundle;

public abstract class SubFragment extends BasePreferenceFragment {

    public int mContentResId = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mContentResId = getContentResId();
        if (mContentResId != 0) {
            super.onCreate(savedInstanceState, mContentResId);
            addPreferencesFromResource(mContentResId);
        } else {
            super.onCreate(savedInstanceState);
        }
        initPrefs();
    }

    public abstract int getContentResId();


    public void initPrefs() {

    }

    ;
}
