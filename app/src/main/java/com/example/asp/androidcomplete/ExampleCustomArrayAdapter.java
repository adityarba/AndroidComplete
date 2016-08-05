package com.example.asp.androidcomplete;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by Rba_dkp7 on 7/18/2016.
 */
public class ExampleCustomArrayAdapter extends Activity {

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu"};
    String color_names[] = {"red", "green", "blue", "yellow"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        CustomListAdapter adapter = new CustomListAdapter(this,mobileArray,color_names);
        ListView lv = (ListView)findViewById(R.id.listview_of_arrayadapter_layout);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("details","Pressed list item : "+view.getId());
            }
        });

    }


}
