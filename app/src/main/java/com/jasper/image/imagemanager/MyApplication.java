package com.jasper.image.imagemanager;

import android.app.Application;
import android.content.Context;

/**
 * Created by jasperlai on 14-7-8.
 */
public class MyApplication extends Application{
    private static MyApplication mApplication;

    public static MyApplication instance() {
        return mApplication;
    }

    public MyApplication() {
        mApplication = this;
    }
    public Context getContext(){
        return getApplicationContext();
    }
}
