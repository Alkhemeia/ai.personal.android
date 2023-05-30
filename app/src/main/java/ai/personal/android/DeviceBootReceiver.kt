package ai.personal.android

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class DeviceBootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.intent.action.BOOT_COMPLETED") {
            // on device boot compelete, reset the alarm
            val mainActivity = MainActivity()
            val notifications = Notifications()
            notifications.sendNotification(context, "Toll!", "Es klappt :)")
        }
    }
}
