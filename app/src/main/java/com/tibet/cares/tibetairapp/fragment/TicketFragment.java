package com.tibet.cares.tibetairapp.fragment;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.activity.TicketSearchFlightActivity;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.util.UIUtils;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/12.
 */
public class TicketFragment extends BaseFragment {
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
        return R.layout.fragment_search_ticket;
    }

    @Override
    protected void initView() {
        commonTopTv.setText(UIUtils.getString(R.string.str_flight_search));

    }

    @Override
    protected void initData() {

    }


    @OnClick(R.id.btn_search_ticket)
    public void onClick() {
        ((BaseActivity)getActivity()).gotoActivity(TicketSearchFlightActivity.class,null,false);
    }
}
