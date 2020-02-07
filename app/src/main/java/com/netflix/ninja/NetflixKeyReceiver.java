package com.netflix.ninja;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NetflixKeyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage("com.valor.mfc.droid.tvapp.generic");
        if (launchIntent != null) {
            context.startActivity(launchIntent);
        } else {
            Toast.makeText(context, "Unable to launch MFC!", Toast.LENGTH_SHORT).show();
        }
    }
}
