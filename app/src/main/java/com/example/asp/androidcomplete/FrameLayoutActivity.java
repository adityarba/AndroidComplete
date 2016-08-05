package com.example.asp.androidcomplete;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Rba_dkp7 on 7/20/2016.
 */
public class FrameLayoutActivity extends Activity implements View.OnClickListener {

    View v1,v2,v3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_framelayout);

        Log.d("details","Inside FrameLayoutActivity");

        v1 = (View)findViewById(R.id.framelayout_view1);
        v2 = (View)findViewById(R.id.framelayout_view2);
        v3 = (View)findViewById(R.id.framelayout_view3);

        v1.setOnClickListener(this);
        v2.setOnClickListener(this);
        v3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        Log.d("details","Inside FrameLayoutActivity Clickable");

        switch (id){
            case R.id.framelayout_view1:
                v1.setVisibility(View.GONE);
                v2.setVisibility(View.VISIBLE);
                break;
            case R.id.framelayout_view2:
                v2.setVisibility(View.GONE);
                v3.setVisibility(View.VISIBLE);
                break;
            case R.id.framelayout_view3:
                v3.setVisibility(View.GONE);
                v1.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void myFrameLayoutFunction(){
        Log.d("details","Inside myFrameLayoutFunction");
    }
}
