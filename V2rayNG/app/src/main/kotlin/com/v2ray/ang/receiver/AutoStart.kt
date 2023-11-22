package com.v2ray.ang.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.v2ray.ang.service.V2RayServiceManager

class AutoStart : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        V2RayServiceManager.startV2Ray(context)
    }
}
