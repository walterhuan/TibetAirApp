package com.tibet.cares.tibetairapp.common;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by huangxl on 2016/6/3.
 */
public class BaseApplication extends Application {

    public static String TAGApp = "TibetAirApp";

    public static Context mContext = null;

    public static Thread mThread = null;

    public static Handler mHandler = null;

    public static int mainThreadId = 0;

    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        mThread = Thread.currentThread();
        mHandler = new Handler();
        mainThreadId = android.os.Process.myTid();
        CrashHandler.getInstance().init(mContext);

    }
}
