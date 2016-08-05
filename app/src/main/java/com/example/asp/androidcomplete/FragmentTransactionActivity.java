package com.example.asp.androidcomplete;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.Fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Rba_dkp7 on 7/27/2016.
 */
public class FragmentTransactionActivity extends Activity {

    FragmentManager manager ;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragment_transaction);
        manager = getFragmentManager();
    }


    public void add1(View view) {
        Log.d("yo","Add 1");
        FragmentOneActivity f1 = new FragmentOneActivity();
        FragmentTransaction trans = manager.beginTransaction();
        trans.add(R.id.display_fragment_transaction,f1,"one");
        trans.commit();
    }

    public void add2(View view) {
        Log.d("yo","Add 2");
        FragmentTwoActivity f2 = new FragmentTwoActivity();
        FragmentTransaction trans = manager.beginTransaction();
        trans.add(R.id.display_fragment_transaction,f2,"two");
        trans.commit();
    }

    public void replace1(View view) {
        Log.d("yo","Replace 1");
        FragmentTwoActivity f2 = new FragmentTwoActivity();
        FragmentTransaction trans = manager.beginTransaction();
        trans.replace(R.id.display_fragment_transaction,f2,"two");
        trans.commit();
    }

    public void replace2(View view) {
        Log.d("yo","Replace 2");
        FragmentOneActivity f1 = new FragmentOneActivity();
        FragmentTransaction trans = manager.beginTransaction();
        trans.replace(R.id.display_fragment_transaction,f1,"two");
        trans.commit();
    }

    public void remove1(View view) {
        Log.d("yo","Remove 1");
        FragmentOneActivity f1 = (FragmentOneActivity) manager.findFragmentByTag("one");
        FragmentTransaction trans = manager.beginTransaction();
        if(f1 !=null){
            trans.remove(f1);
            trans.commit();
        }
        else{
            Toast.makeText(this,"No ONE to remove",Toast.LENGTH_SHORT);
        }
    }

    public void remove2(View view) {
        Log.d("yo","Remove 1");
        FragmentTwoActivity f2 = (FragmentTwoActivity) manager.findFragmentByTag("two");
        FragmentTransaction trans = manager.beginTransaction();
        if(f2 !=null){
            trans.remove(f2);
            trans.commit();
        }
        else{
            Toast.makeText(this,"No TWO to replace",Toast.LENGTH_SHORT);
        }
    }
}
