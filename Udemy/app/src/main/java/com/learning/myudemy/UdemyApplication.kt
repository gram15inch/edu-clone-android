package com.learning.myudemy

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

class TimberDebugTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String? {
        //return "${element.fileName}:${element.lineNumber}#${element.methodName}"
        return "#${element.methodName}"
    }
}

@HiltAndroidApp
class UdemyApplication:Application() {


    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(TimberDebugTree())
        }
    }

}