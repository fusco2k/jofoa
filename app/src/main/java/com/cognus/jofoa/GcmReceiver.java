package com.cognus.jofoa;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

public class GcmReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(Main.TAG, "GcmReceiver.onReceive()");

        ComponentName comp = new ComponentName(context.getPackageName(), GcmService.class.getName());
        intent.setComponent(comp);

        startWakefulService(context, intent);
        setResultCode(Activity.RESULT_OK);
    }
}
