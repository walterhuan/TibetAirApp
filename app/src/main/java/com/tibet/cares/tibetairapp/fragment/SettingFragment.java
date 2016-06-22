package com.tibet.cares.tibetairapp.fragment;

import android.view.View;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.activity.MeCommonActivity;
import com.tibet.cares.tibetairapp.common.BaseFragment;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/22.
 */
public class SettingFragment extends BaseFragment {
    public static final int CASE_CHANGE_PASSWORD = 4004;
    public static final int CASE_ABOUT = 4006;

    @Bind(R.id.common_top_tv)
    TextView commonTopTv;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_setting;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("设置");

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.ll_change_password,R.id.ll_about})
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_change_password:
                ((MeCommonActivity)getActivity()).selectFragment(CASE_CHANGE_PASSWORD);
                break;
            case R.id.ll_about:
                ((MeCommonActivity)getActivity()).selectFragment(CASE_ABOUT);
                break;

        }

    }
}
