package com.example.asp.androidcomplete;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Picture;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import com.telly.mrvector.MrVector;

/**
 * Created by Rba_dkp7 on 7/21/2016.
 */
public class SVGIntegrationActivity extends Activity {

    ImageView imgView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vector);

        imgView = (ImageView)findViewById(R.id.vectorImg);

        Drawable drawable = null;

        drawable = MrVector.inflate(getResources(),R.drawable.animated_vector_clock);

        imgView.setBackground(drawable);

        ((Animatable)drawable).start();



    }
}
