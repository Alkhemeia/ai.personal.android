package ai.personal.android

import android.content.Context
import android.webkit.JavascriptInterface

class JavaScriptInterface(private val context: Context) {
    @JavascriptInterface
    fun showNotification(title: String, text: String) {
        // Call your sendNotification function here
        val notifications = Notifications()
        notifications.sendNotification(context, title, text)
    }
}