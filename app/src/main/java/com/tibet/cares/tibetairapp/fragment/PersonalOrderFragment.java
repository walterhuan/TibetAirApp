package com.tibet.cares.tibetairapp.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.activity.MeCommonActivity;
import com.tibet.cares.tibetairapp.adapter.PersonalOrderAdapter;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.entity.PersonalOrderEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/21.
 */
public class PersonalOrderFragment extends BaseFragment implements AdapterView.OnItemClickListener{
    //订单查询
    public static final int MODULE_QUERY_ORDER = 4002;
    //订单详情
    public static final int ORDER_DETAIL = 4003;



    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.lv_personal_order)
    ListView lvPersonalOrder;
    @Bind(R.id.common_top_right)
    ImageView commonTopRight;


    private int orderCase;

    PersonalOrderAdapter personalOrderAdapter;


    public static PersonalOrderFragment newInstance(int orderCase) {
        Bundle args = new Bundle();
        args.putInt(MineFragment.MY_ORDER_CASE, orderCase);
        PersonalOrderFragment fragment = new PersonalOrderFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_personal_order;
    }

    @Override
    protected void initView() {
        commonTopRight.setVisibility(View.VISIBLE);
        commonTopTv.setText("我的订单");
        orderCase = getArguments().getInt(MineFragment.MY_ORDER_CASE);
        switch (orderCase) {
            case MineFragment.CASE_PROPOSE_PAYING:
                commonTopTv.setText("待付款");
                break;

        }
        System.out.println("orderCase=" + orderCase);

    }

    @Override
    protected void initData() {
        initAdapter();

    }

    private void initAdapter() {

        List<PersonalOrderEntity> list = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add(new PersonalOrderEntity((10000000 + i) + " "));
        }


        personalOrderAdapter = new PersonalOrderAdapter(list);
        lvPersonalOrder.setAdapter(personalOrderAdapter);
        lvPersonalOrder.setOnItemClickListener(this);
    }



    @OnClick(R.id.common_top_right)
    public void onClick() {
        ((MeCommonActivity)getActivity()).selectFragment(MODULE_QUERY_ORDER);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ((MeCommonActivity)getActivity()).selectFragment(ORDER_DETAIL);
    }
}
