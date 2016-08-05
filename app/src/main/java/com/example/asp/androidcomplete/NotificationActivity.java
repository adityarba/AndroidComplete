package com.example.asp.androidcomplete;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Rba_dkp7 on 7/19/2016.
 */
public class NotificationActivity extends Activity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_notification);

        btn = (Button)findViewById(R.id.notification_show_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                Log.d("details","inside notification");
//                NotificationCompat.Builder builder = new NotificationCompat.Builder(NotificationActivity.this);
//                builder.setContentTitle("Content TITLE");
//                builder.setContentText("Content TexT");
//                builder.setSmallIcon(R.drawable.user);
//                builder.setColor(256342);
//                builder.build();



//                Intent i = new Intent(NotificationActivity.this,MainActivity.class);

// Stack Builder is used to put the pending task in the device's stack , so that we can save some data Globally for the device and not just limit it to a particular app's activity

//                TaskStackBuilder stackBuilder = TaskStackBuilder.create(NotificationActivity.this);
//                stackBuilder.addParentStack(MainActivity.class);
//                stackBuilder.addNextIntent(i);
//                PendingIntent resultPendingIntent =  stackBuilder.getPendingIntent( 0, PendingIntent.FLAG_UPDATE_CURRENT);
//                builder.setContentIntent(resultPendingIntent);
//
//                NotificationManager mNotificationManager =  (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//                mNotificationManager.notify(12, builder.build());

                showNotification();

            }
        });

    }
    public void showNotification() {
        PendingIntent pi = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0);
        Resources r = getResources();
        Notification notification = new NotificationCompat.Builder(this)
                .setTicker("Ticker")
                .setSmallIcon(R.drawable.user)
                .setContentTitle("Title")
                .setContentText("Text")
                .setContentIntent(pi)
                .setAutoCancel(true)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);
    }
}
