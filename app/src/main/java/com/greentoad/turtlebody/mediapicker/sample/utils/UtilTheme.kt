package com.greentoad.turtlebody.mediapicker.sample.utils

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.view.View

/**
 * Created by niraj on 12-04-2019.
 */
object UtilTheme {

    @JvmStatic fun setLightStatusBar(view: View, activity: Activity) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            var flags = view.systemUiVisibility
            flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            view.systemUiVisibility = flags
            activity.window.statusBarColor = Color.WHITE
        }
    }


}