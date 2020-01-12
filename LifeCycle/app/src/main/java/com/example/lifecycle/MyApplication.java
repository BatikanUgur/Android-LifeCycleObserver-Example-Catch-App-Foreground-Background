package com.example.lifecycle;

import android.app.Application;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppLifecycleListener applistener = new AppLifecycleListener();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(applistener);

    }
}