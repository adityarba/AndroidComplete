package com.example.asp.androidcomplete;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Rba_dkp7 on 7/18/2016.
 */
public class ExampleArrayAdapter extends Activity {
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_textview,mobileArray);

        ListView lv = (ListView)findViewById(R.id.listview_of_arrayadapter_layout);
        lv.setAdapter(adapter);

//        GridView gv = (GridView)findViewById(R.id.gridview_of_arrayadapter_layout);
//        gv.setAdapter(adapter);
    }
}
