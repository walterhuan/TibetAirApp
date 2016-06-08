package com.tibet.cares.tibetairapp.common;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.util.UIUtils;

/**
 * Created by huangxl on 2016/6/3.
 */
public class CrashHandler implements Thread.UncaughtExceptionHandler{

    private CrashHandler(){

    }

    public static CrashHandler mCrashHandler = null;

    public static CrashHandler getInstance(){
        if (mCrashHandler == null){
            mCrashHandler = new CrashHandler();
        }
        return mCrashHandler;
    }

    private Context mContext;

    public void init(Context context){
        this.mContext = context;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }




    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        handleException(thread, ex);

    }

    private void handleException(Thread thread, Throwable ex) {
        new Thread(){
            @Override
            public void run() {
                Looper.prepare();
                UIUtils.showToast(UIUtils.getString(R.string.err_msg),true);
                Looper.loop();
            }
        }.start();

        collectException(ex);
        try {
            thread.sleep(2000);
            AppManager.getInstance().removeAllActivity();
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private void collectException(Throwable ex) {
        final String deviceInfo = Build.DEVICE +"\n"
                + Build.VERSION.SDK_INT +"\n"
                + Build.MODEL +"\n"
                + Build.PRODUCT+"\n";
        final String errorInfo = ex.getMessage();
        ex.printStackTrace();

        new Thread() {
            @Override
            public void run() {
                Log.e(BaseApplication.TAGApp, "deviceInfo---" + deviceInfo +":errorInfo=" + errorInfo);
            }
        }.start();
    }
}
