package com.tibet.cares.tibetairapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseHolder;
import com.tibet.cares.tibetairapp.common.MyBaseAdapter;
import com.tibet.cares.tibetairapp.entity.PassengerEntity;

import java.util.List;

/**
 * Created by huangxl on 2016/6/20.
 */
public class CommonInsurancePassengerAdapter extends MyBaseAdapter<PassengerEntity>{
    public CommonInsurancePassengerAdapter(List<PassengerEntity> list) {
        super(list);
    }

    @Override
    protected BaseHolder getHolder(ViewGroup parent) {
        return new MyViewHolder(parent);
    }


    class MyViewHolder extends BaseHolder<PassengerEntity>{

        public MyViewHolder(ViewGroup parent) {
            super(parent);
        }

        @Override
        protected void refreshView() {
            PassengerEntity entity = getData();

        }

        @Override
        public View initRootView(ViewGroup parent) {
            return View.inflate(parent.getContext(), R.layout.item_insurance_passenger,null);
        }
    }


}
