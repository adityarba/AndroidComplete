package com.example.asp.androidcomplete;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends Activity implements View.OnClickListener {

    Button cameraSimpleBtn, activityLifeCycleBtn, arrayAdapter,customListView, inputController, menuBar;
    Button login, showNotification, dialogBtn,frameLayoutBtn,svgBtn;

    Button fragSimpleBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseInstanceId.getInstance().getToken();

        NotificationManager mNotificationManager =  (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.cancelAll();

        cameraSimpleBtn = (Button) findViewById(R.id.main_camera_simple_btn);
        activityLifeCycleBtn = (Button) findViewById(R.id.main_activity_lifecycle_btn);
        arrayAdapter = (Button) findViewById(R.id.main_adapter_array_btn);
        customListView = (Button)findViewById(R.id.main_custom_adapter_array_btn);
        inputController = (Button)findViewById(R.id.main_input_controller_btn);
        menuBar =(Button)findViewById(R.id.main_menu_bar_btn);
        login = (Button)findViewById(R.id.main_login_btn);
        showNotification = (Button)findViewById(R.id.main_show_notification_btn);
        dialogBtn = (Button)findViewById(R.id.main_dialog_btn);
        frameLayoutBtn = (Button)findViewById(R.id.main_frame_layout_btn);

        svgBtn = (Button)findViewById(R.id.main_svg_btn);
        fragSimpleBtn = (Button)findViewById(R.id.main_fragment_simple_btn);

        activityLifeCycleBtn.setOnClickListener(this);
        arrayAdapter.setOnClickListener(this);
        cameraSimpleBtn.setOnClickListener(this);
        customListView.setOnClickListener(this);
        inputController.setOnClickListener(this);
        menuBar.setOnClickListener(this);
        login.setOnClickListener(this);
        showNotification.setOnClickListener(this);
        dialogBtn.setOnClickListener(this);
        frameLayoutBtn.setOnClickListener(this);
        ((Button)findViewById(R.id.main_fragment_transaction_btn)).setOnClickListener(this);
        svgBtn.setOnClickListener(this);
        fragSimpleBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent i;
        switch(id){
            case R.id.main_activity_lifecycle_btn:
                i = new Intent(getApplicationContext(),ActivityLifeCycle.class);
                startActivity(i);
                break;
            case R.id.main_camera_simple_btn:
                i = new Intent(getApplicationContext(),Camera.class);
                startActivity(i);
                break;
            case R.id.main_adapter_array_btn:
                i = new Intent(getApplicationContext(),ExampleArrayAdapter.class);
                startActivity(i);
                break;
            case R.id.main_custom_adapter_array_btn:
                i = new Intent(getApplicationContext(),ExampleCustomArrayAdapter.class);
                startActivity(i);
                break;
            case R.id.main_input_controller_btn:
                i = new Intent(getApplicationContext(),InputController.class);
                startActivity(i);
                break;
            case R.id.main_menu_bar_btn:
                i = new Intent(getApplicationContext(),MenuBarActivity.class);
                startActivity(i);
                break;
            case R.id.main_login_btn:
                i = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
                break;
            case R.id.main_show_notification_btn:
                i = new Intent(getApplicationContext(),NotificationActivity.class);
                startActivity(i);
                break;
            case R.id.main_dialog_btn:
                i = new Intent(getApplicationContext(),DialogActivity.class);
                startActivity(i);
                break;
            case R.id.main_frame_layout_btn:
                i = new Intent(getApplicationContext(),FrameLayoutActivity.class);
                startActivity(i);
                break;
            case R.id.main_svg_btn:
                i = new Intent(getApplicationContext(),SVGIntegrationActivity.class);
                startActivity(i);
                break;
            case R.id.main_fragment_simple_btn:
                i = new Intent(getApplicationContext(),FragmentSimpleActivity.class);
                startActivity(i);
                break;

            case R.id.main_fragment_transaction_btn:
                i = new Intent(getApplicationContext(),FragmentTransactionActivity.class);
                startActivity(i);
                break;


        }
    }
}
