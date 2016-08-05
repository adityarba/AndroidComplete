package com.example.asp.androidcomplete;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Rba_dkp7 on 7/20/2016.
 */
public class DialogActivity extends Activity implements View.OnClickListener {

    Button simpleDialogBtn, fragmentBtn, dialogTextView,frameLayoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dialog);

        simpleDialogBtn = (Button)findViewById(R.id.dialog_simple_btn);
        fragmentBtn = (Button)findViewById(R.id.dialog_fragment_btn);
        dialogTextView = (Button)findViewById(R.id.dialog_textview_btn);
        frameLayoutBtn = (Button)findViewById(R.id.dialog_with_framelayout_btn);

        simpleDialogBtn.setOnClickListener(this);
        fragmentBtn.setOnClickListener(this);
        dialogTextView.setOnClickListener(this);
        frameLayoutBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.dialog_simple_btn:
                Dialog dia = new Dialog(this);
                dia.setTitle("Title space");
                dia.setCancelable(true);
                dia.setContentView(R.layout.activity_main);
                dia.show();
                break;

            case R.id.dialog_fragment_btn:
                AlertDialog.Builder alertDialogBuilder =  new AlertDialog.Builder(this);
                alertDialogBuilder.setTitle("hey");

                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("details","Selected YES Option");
                    }
                });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Log.d("details", "Selected NO Option");
                            }
                        });


                AlertDialog alertDia = alertDialogBuilder.create();
                alertDia.show();
                break;

            case R.id.dialog_textview_btn:
                AlertDialog.Builder alertDiaBuilder = new AlertDialog.Builder(this);
                LayoutInflater inflater = this.getLayoutInflater();
                final View viewInflator = inflater.inflate(R.layout.layout_login,null);
                alertDiaBuilder.setView(viewInflator);

                alertDiaBuilder.setPositiveButton("SignIn", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Dialog d = (Dialog) dialogInterface;
                        EditText et = (EditText)d.findViewById(R.id.login_username);  //Either of these methods work fine. this line and next line
//                        EditText et = (EditText)viewInflator.findViewById(R.id.login_username);
                        Log.d("details","Selected YES Option, username = "+et.getText().toString());
                    }
                });
                alertDiaBuilder.setNegativeButton("No", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Log.d("details","Selected NO Option");
                    }
                });
                AlertDialog alertDia2 = alertDiaBuilder.create();
                alertDia2.show();
                break;

            case R.id.dialog_with_framelayout_btn:
                AlertDialog.Builder alertDiaBuilder1 = new AlertDialog.Builder(this);
                LayoutInflater inflater1 = this.getLayoutInflater();
                final View viewInflator1 = inflater1.inflate(R.layout.layout_login,null);
                alertDiaBuilder1.setView(viewInflator1);

                break;


        }


    }
}
