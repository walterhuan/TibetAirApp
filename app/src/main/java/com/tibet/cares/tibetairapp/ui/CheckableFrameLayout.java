package com.tibet.cares.tibetairapp.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;

/**
 * Created by huangxl on 2016/6/14.
 */
public class CheckableFrameLayout extends FrameLayout implements Checkable{

    public CheckableFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private boolean mChecked = false;


    @Override
    public void setChecked(boolean checked) {
        if (mChecked != checked){
            mChecked = checked;
            refreshDrawableState();
            for (int i = 0,len = getChildCount();i<len;i++){
                View child = getChildAt(i);
                if (child instanceof  Checkable){
                    ((Checkable)child).setChecked(checked);
                }
            }
        }

    }

    @Override
    public boolean isChecked() {
        return mChecked;
    }

    @Override
    public void toggle() {
        setChecked(!mChecked);

    }
}
