package com.tibet.cares.tibetairapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.util.UIUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
