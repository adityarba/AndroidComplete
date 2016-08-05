package com.example.asp.androidcomplete;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;

/**
 * Created by Rba_dkp7 on 7/15/2016.
 */
public class ActivityLifeCycle extends Activity {

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("details","Inside OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        et = (EditText)findViewById(R.id.activitylifecycle_edittext);
        if(savedInstanceState == null){
            Log.d("details","no Previous Saved Value");
        }
        else{
            Log.d("details","Previous saved value = "+savedInstanceState.get("edittextvalue"));

        }


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d("details","yo");
        outState.putString("edittextvalue",et.getText().toString());

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("details","The savedInstanceState value is = "+savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("details","Inside OnStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("details","Inside OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("details","Inside OnStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("details","Inside OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("details","Inside OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("details","Inside OnDestroy");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("details","Inside OnPostResume");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("details","Inside finish");

    }
}
