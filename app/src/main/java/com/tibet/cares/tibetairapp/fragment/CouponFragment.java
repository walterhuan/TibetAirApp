package com.tibet.cares.tibetairapp.fragment;

import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseFragment;

import butterknife.Bind;

/**
 * Created by huangxl on 2016/6/20.
 */
public class CouponFragment extends BaseFragment {
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_coupon;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("优惠券");
    }

    @Override
    protected void initData() {

    }


}
