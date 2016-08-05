package com.example.asp.androidcomplete;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.util.Log;


import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Rba_dkp7 on 7/22/2016.
 */
public class FireBaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("details","msg 1 : "+remoteMessage.getData().get("message"));
        Log.d("details","msg 2 : "+remoteMessage.getData().toString());
        showNotification(remoteMessage.getData().get("message"));
    }

    private void showNotification(String msg) {
        Log.d("details","msg 3 : "+msg);

        Intent i = new Intent(this,MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("Recieved Text");
        builder.setContentText(msg);
        builder.setAutoCancel(true);
        builder.setContentIntent(pendingIntent);

        NotificationManager  manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        manager.notify(0,builder.build());


    }

}
