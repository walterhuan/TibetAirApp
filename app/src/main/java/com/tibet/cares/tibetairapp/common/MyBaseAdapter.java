package com.tibet.cares.tibetairapp.common;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by huangxl on 2016/6/16.
 */
public abstract class MyBaseAdapter<T> extends BaseAdapter {
    public MyBaseAdapter(List<T> list) {
        this.list = list;
    }

    private List<T> list;

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaseHolder holder = null;
        if (convertView == null){
            holder = getHolder(parent);
        }else{
            holder = (BaseHolder)convertView.getTag();
        }

        holder.setData(list.get(position));
        return holder.getRootView();
    }

    protected abstract BaseHolder getHolder(ViewGroup parent);


}
