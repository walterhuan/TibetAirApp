package com.tibet.cares.tibetairapp.common;

import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by huangxl on 2016/6/16.
 */
public abstract class BaseHolder<T> {
    private View rootView;
    private T data;
    private ViewGroup parent;

    public T getData(){
        return this.data;
    }

    public BaseHolder(ViewGroup parent){
        this.rootView = initRootView(parent);
        this.rootView.setTag(this);
        this.parent = parent;
        ButterKnife.bind(BaseHolder.this,rootView);
    }

    public View getRootView(){
        return this.rootView;

    }

    public void setData(T t){
        this.data = t;
        refreshView();
    }

    protected abstract void refreshView();

    public abstract View initRootView(ViewGroup parent);



}
