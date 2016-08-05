package com.example.asp.androidcomplete;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.util.Log;

/**
 * Created by Rba_dkp7 on 7/19/2016.
 */
public class PreferenceActivity extends android.preference.PreferenceActivity  {

    public static final String KEY_BKG = "KEY_BKG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        Log.d("details","KEY_BKG value 1 = "+pref.getBoolean(KEY_BKG,false));
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
//        Log.d("details","pressed key is : "+preference.getKey().toString());
        if(preference.getKey().toString().equals(KEY_BKG)){
            SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
            Log.d("details","KEY_BKG value 2 = "+pref.getBoolean(KEY_BKG,false));
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

}

