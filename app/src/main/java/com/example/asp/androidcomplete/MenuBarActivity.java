package com.example.asp.androidcomplete;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by Rba_dkp7 on 7/18/2016.
 */
public class MenuBarActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menubar);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("KEY_BKG","false");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mu = getMenuInflater();
        mu.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Log.d("details","Pressed Settings");
                Intent i = new Intent(this,PreferenceActivity.class);
                startActivity(i);
                return true;
            case R.id.action_aboutus:
                Log.d("details","Pressed AboutUs");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


}
