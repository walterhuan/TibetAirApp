package com.tibet.cares.tibetairapp.common;

import android.app.Activity;

import java.util.Stack;

/**
 * Created by huangxl on 2016/6/3.
 * 管理所有activity栈
 */
public class AppManager {

    public static AppManager mAppManager = null;

    private Stack<Activity> mActivityStack = new Stack<>();

    private AppManager() {

    }

    public static AppManager getInstance(){
        if (mAppManager == null){
            mAppManager = new AppManager();
        }
        return mAppManager;
    }

    //添加指定Activity
    public void addActivity(Activity activity){
        mActivityStack.add(activity);
    }

    //删除指定Activity
    public void removeActivity(Activity activity){
        for (int i = mActivityStack.size()-1;i>=0;i--){
            Activity activityTemp = mActivityStack.get(i);
            if (activityTemp.getClass() == activity.getClass()){
                activityTemp.finish();
                mActivityStack.remove(activityTemp);
                break;
            }
        }
    }

    //删除当前Activity
    public void removeCurrentActivity(){
        Activity lastActivity = mActivityStack.lastElement();
        lastActivity.finish();
        mActivityStack.remove(lastActivity);
    }

    //删除所有Activity
    public void removeAllActivity(){
        for (int i = mActivityStack.size()-1;i>=0;i--){
            Activity activityTemp = mActivityStack.get(i);
            activityTemp.finish();
            mActivityStack.remove(activityTemp);
        }
    }

    //栈里数目
    public int getSize(){
        return mActivityStack.size();
    }





}
