package com.tibet.cares.tibetairapp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseHolder;
import com.tibet.cares.tibetairapp.common.MyBaseAdapter;
import com.tibet.cares.tibetairapp.entity.PassengerEntity;

import java.util.List;

import butterknife.Bind;

/**
 * Created by huangxl on 2016/6/17.
 */
public class CommonContactAdapter extends MyBaseAdapter<PassengerEntity> {

    public CommonContactAdapter(List<PassengerEntity> list) {
        super(list);
    }

    @Override
    protected BaseHolder getHolder(ViewGroup parent) {
        return new MyViewHolder(parent);
    }


    class MyViewHolder extends BaseHolder<PassengerEntity> {

        @Bind(R.id.id_contactName_commonPsg)
        TextView idPContactNameCommonPsg;

        public MyViewHolder(ViewGroup parent) {
            super(parent);
        }

        @Override
        protected void refreshView() {
            PassengerEntity psgEntity = getData();
            idPContactNameCommonPsg.setText(psgEntity.psgName);

        }

        @Override
        public View initRootView(ViewGroup parent) {
            View inflate = View.inflate(parent.getContext(), R.layout.item_common_contact, null);
            return inflate;
        }
    }

}
