package com.tibet.cares.tibetairapp.fragment;

import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.adapter.CommonInsuranceContentAdapter;
import com.tibet.cares.tibetairapp.adapter.CommonInsurancePassengerAdapter;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.entity.InsuranceEntity;
import com.tibet.cares.tibetairapp.entity.PassengerEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by huangxl on 2016/6/20.
 */
public class AirlineInsuranceFragment extends BaseFragment {

    @Bind(R.id.common_top_left)
    ImageView commonTopLeft;
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.lv_insurance_content)
    ListView lvInsuranceContent;
    @Bind(R.id.lv_insurance_psg)
    ListView lvInsurancePsg;

    CommonInsuranceContentAdapter adapterInsuranceContent;
    CommonInsurancePassengerAdapter adapterInsurancePsg;


    @Override
    public int getLayoutId() {
        return R.layout.fragment_airline_insurance;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("航空意外险");

    }

    @Override
    protected void initData() {
        setInsuranceContentAdapter();
        setInsurancePsgAdapter();

    }

    private void setInsuranceContentAdapter() {
        List<InsuranceEntity> list =new ArrayList<>();
        for (int i=0;i<10;i++) {
            list.add(new InsuranceEntity("title", "content"));
        }
        adapterInsuranceContent = new CommonInsuranceContentAdapter(list);
        lvInsuranceContent.setAdapter(adapterInsuranceContent);
    }

    private void setInsurancePsgAdapter() {
        List<PassengerEntity> list =new ArrayList<>();
        for (int i=0;i<10;i++) {
            list.add(new PassengerEntity("title", "content"));
        }

        adapterInsurancePsg=new CommonInsurancePassengerAdapter(list);
        lvInsurancePsg.setAdapter(adapterInsurancePsg);
    }

}
