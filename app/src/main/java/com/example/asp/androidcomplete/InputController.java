package com.example.asp.androidcomplete;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

import java.lang.reflect.Array;

/**
 * Created by Rba_dkp7 on 7/18/2016.
 */
public class InputController extends Activity {

    Switch sw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_input_controller);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> seq = ArrayAdapter.createFromResource(this, R.array.planets_array, R.layout.single_textview);
        spinner.setAdapter(seq);

        final RadioGroup radioGrp = (RadioGroup) findViewById(R.id.radiogrp);

        radioGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (radioGrp.getCheckedRadioButtonId()) {
                    case R.id.radiogroup1:
                        Log.d("details", "pressed : 1");
                        break;
                    case R.id.radiogroup2:
                        Log.d("details", "pressed : 2");
                        break;
                    case R.id.radiogroup3:
                        Log.d("details", "pressed : 3");
                        break;
                }
            }

        });

        sw = (Switch)findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.d("details","on check = "+b);
               if(b)
                    sw.setText(sw.getTextOn());
                else
                   sw.setText(sw.getTextOff());

            }
        });

    }
}