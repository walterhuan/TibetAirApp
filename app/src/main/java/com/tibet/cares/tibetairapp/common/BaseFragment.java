package com.tibet.cares.tibetairapp.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by huangxl on 2016/6/6.
 */
public abstract class BaseFragment extends Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(container.getContext(),getLayoutId(),null);
        ButterKnife.bind(BaseFragment.this, view);
        System.out.println("onCreateView");
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        System.out.println("onViewCreated");
        initView();
        initData();
    }
    public abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initData();




    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("destory");
        ButterKnife.unbind(BaseFragment.this);
    }
}
