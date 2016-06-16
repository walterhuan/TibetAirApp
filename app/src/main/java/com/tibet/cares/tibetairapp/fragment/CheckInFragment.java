package com.tibet.cares.tibetairapp.fragment;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.util.UIUtils;

import butterknife.Bind;

/**
 * Created by huangxl on 2016/6/12.
 */
public class CheckInFragment extends BaseFragment {
    @Bind(R.id.common_top_left)
    ImageView commonTopLeft;
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.common_top_right)
    ImageView commonTopRight;
    @Bind(R.id.common_ll)
    LinearLayout commonLl;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_check_in;
    }

    @Override
    protected void initView() {
        commonTopTv.setText(UIUtils.getString(R.string.str_check_in));

    }

    @Override
    protected void initData() {

    }


}
