package com.example.asp.androidcomplete;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Rba_dkp7 on 7/27/2016.
 */
public class FragmentSimpleActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_fragment_simple);
    }
}
