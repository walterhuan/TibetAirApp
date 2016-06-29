package com.tibet.cares.tibetairapp.fragment;

import android.widget.LinearLayout;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.util.UIUtils;

import butterknife.Bind;

/**
 * Created by huangxl on 2016/6/6.
 */
public class LoginFragment extends BaseFragment {


    @Bind(R.id.common_ll)
    LinearLayout commonLl;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    protected void initView() {
        commonLl.setBackgroundColor(UIUtils.getColor(R.color.color_transparent));



    }

    @Override
    protected void initData() {

    }



}
