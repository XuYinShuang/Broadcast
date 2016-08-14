package com.zhiyuan3g.broadcast_receiver.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/15.
 */
public class SecondBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message=intent.getStringExtra("msg");

        Toast.makeText(context, "SecondBroadcastReceiver:"+message, Toast.LENGTH_SHORT).show();
    }
}
