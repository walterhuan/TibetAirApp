package com.tibet.cares.tibetairapp.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.fragment.InitFragment;
import com.tibet.cares.tibetairapp.fragment.LoginFragment;
import com.tibet.cares.tibetairapp.fragment.RegisterFragment;


public class InitActivity extends BaseActivity implements InitFragment.InitFmListener {
    FragmentManager manager;
    FragmentTransaction transaction;
    InitFragment initFragment;
    LoginFragment loginFragment;
    RegisterFragment registerFragment;


    @Override
    public int getLayoutId() {
        return R.layout.activity_init;
    }

    @Override
    protected void initView() {
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        initFragment = new InitFragment();
        transaction.add(R.id.fragment_container_init,initFragment).commit();
    }

    @Override
    protected void initData() {

    }


    public void replaceFragment(Fragment fragment, String stackName) {
        transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container_init, fragment);
        transaction.addToBackStack(stackName);
        transaction.commit();
    }


    /**
     * 初始化界面的按钮
     * @param click
     */
    @Override
    public void OnClickInitFm(int click) {
        switch (click){
            case InitFragment.CLICK_LOGIN:
                if (loginFragment == null)
                    loginFragment = new LoginFragment();
                replaceFragment(loginFragment,"loginFragment");

                break;
            case InitFragment.CLICK_REGISTER:
                if (registerFragment == null)
                    registerFragment = new RegisterFragment();
                replaceFragment(registerFragment,"registerFragment");

                break;
            case InitFragment.CLICK_VISITOR:
                gotoActivity(MainActivity.class,null,true);


                break;


        }
    }
}
