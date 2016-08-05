package com.example.asp.androidcomplete;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Rba_dkp7 on 7/18/2016.
 */
public class CustomListAdapter extends ArrayAdapter {

    String[] text1;
    String[] text2;
    Context ctx;
    public CustomListAdapter(Activity context, String[] text1, String[] text2) {

        super(context,R.layout.layout_custom_arrayadapter,text2);
        Log.d("details","Text 1 = "+text1[0].toString());
        this.text1 = text1;
        this.text2 = text2;
        this.ctx = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View singleRow = inflater.inflate(R.layout.layout_custom_arrayadapter,null,true);
        TextView tv1 = (TextView) singleRow.findViewById(R.id.custom_textview1);
        TextView tv2 = (TextView) singleRow.findViewById(R.id.custom_textview2);
        Log.d("details","Text 2 = "+text1[position].toString());
        tv1.setText(text1[position].toString());
        tv2.setText(text2[position].toString());

        return singleRow;
    }
}
