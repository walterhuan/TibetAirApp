package com.tibet.cares.tibetairapp.common;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.tibet.cares.tibetairapp.R;

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

    public abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initData();

    public void gotoActivity(Class clazz,Bundle bundle,boolean transition){
        Intent it = new Intent(this,clazz);
        if (bundle != null){
            it.putExtra("bundle",bundle);
        }
        startActivity(it);
        if (transition)
        overridePendingTransition(R.anim.slide_in_bottom,R.anim.slide_out_bottom);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);

    }
}







