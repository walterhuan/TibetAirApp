package com.tibet.cares.tibetairapp.fragment;

import android.view.View;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.ui.SharePopup;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/22.
 */
public class AboutFragment extends BaseFragment {
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_about;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("关于");

    }

    @Override
    protected void initData() {

    }



    @OnClick({R.id.btn_share})
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_share:
                SharePopup sharePopup = new SharePopup(getActivity());
                sharePopup.showPopupWindow();
                break;


        }
    }
}
