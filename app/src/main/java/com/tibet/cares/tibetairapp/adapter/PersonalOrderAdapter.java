package com.tibet.cares.tibetairapp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseHolder;
import com.tibet.cares.tibetairapp.common.MyBaseAdapter;
import com.tibet.cares.tibetairapp.entity.PersonalOrderEntity;

import java.util.List;

import butterknife.Bind;

/**
 * Created by huangxl on 2016/6/21.
 */
public class PersonalOrderAdapter extends MyBaseAdapter<PersonalOrderEntity> {
    public PersonalOrderAdapter(List<PersonalOrderEntity> list) {
        super(list);
    }

    @Override
    protected BaseHolder getHolder(ViewGroup parent) {
        return new MyHolder(parent);
    }

    class MyHolder extends BaseHolder<PersonalOrderEntity> {


        @Bind(R.id.item_ordernum)
        TextView itemOrdernum;

        public MyHolder(ViewGroup parent) {
            super(parent);
        }

        @Override
        protected void refreshView() {
            PersonalOrderEntity entity =getData();
            itemOrdernum.setText("订单号: "+entity.orderNum);

        }

        @Override
        public View initRootView(ViewGroup parent) {
            return View.inflate(parent.getContext(), R.layout.item_personal_order, null);
        }
    }


}
