package com.tibet.cares.tibetairapp.common;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


import butterknife.ButterKnife;

/**
 * Created by huangxl on 2016/6/3.
 */
public abstract class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        AppManager.getInstance().addActivity(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        initView();
        initData();
    }

    protected abstract void initView();

    protected abstract void initData();

    public abstract int getLayoutId();



}







