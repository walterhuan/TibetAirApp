package com.tibet.cares.tibetairapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseHolder;
import com.tibet.cares.tibetairapp.common.MyBaseAdapter;
import com.tibet.cares.tibetairapp.entity.InsuranceEntity;

import java.util.List;

/**
 * Created by huangxl on 2016/6/20.
 */
public class CommonInsuranceContentAdapter extends MyBaseAdapter<InsuranceEntity>{
    public CommonInsuranceContentAdapter(List<InsuranceEntity> list) {
        super(list);
    }

    @Override
    protected BaseHolder getHolder(ViewGroup parent) {
        return new MyViewHolder(parent);
    }


    class MyViewHolder extends BaseHolder<InsuranceEntity>{

        public MyViewHolder(ViewGroup parent) {
            super(parent);
        }

        @Override
        protected void refreshView() {
            InsuranceEntity entity = getData();

        }

        @Override
        public View initRootView(ViewGroup parent) {
            return View.inflate(parent.getContext(), R.layout.item_insurance_content,null);
        }
    }


}
