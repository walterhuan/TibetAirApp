package com.tibet.cares.tibetairapp.util;

import android.content.Context;
import android.widget.Toast;

import com.tibet.cares.tibetairapp.common.BaseApplication;

/**
 * Created by huangxl on 2016/6/3.
 */
public class UIUtils {

    public static Context getContext(){
        return BaseApplication.mContext;
    }

    public static String getString(int stringId){
        return getContext().getResources().getString(stringId);
    }

    public static void showToast(String text,boolean isLong){
        Toast.makeText(getContext(),text,isLong?Toast.LENGTH_LONG:Toast.LENGTH_SHORT).show();

    }


    public static int getColor(int colorId) {
        return getContext().getResources().getColor(colorId);
    }
}
