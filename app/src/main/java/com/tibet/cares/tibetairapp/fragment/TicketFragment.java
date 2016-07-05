package com.tibet.cares.tibetairapp.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.activity.TicketSearchFlightActivity;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.ui.CabinSelectPopup;
import com.tibet.cares.tibetairapp.ui.PeopleCountPopup;
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
        commonTopTv.setText(UIUtils.getString(R.string.str_ticket_title));

    }

    @Override
    protected void initData() {

    }


    @OnClick({R.id.btn_search_ticket, R.id.ll_cabin_choice,R.id.ll_people_count})
    public void onClick(View view) {
        switch (view.getId()) {
            //航班查询按钮
            case R.id.btn_search_ticket:
                ((BaseActivity) getActivity()).gotoActivity(TicketSearchFlightActivity.class, null, false);
                break;
            //舱位选择
            case R.id.ll_cabin_choice:
                CabinSelectPopup cabinSelectPopup = new CabinSelectPopup(getActivity());
                cabinSelectPopup.showPopupWindow();
                break;
            //人数选择
            case R.id.ll_people_count:

                PeopleCountPopup peopleCountPopup = new PeopleCountPopup(getActivity());
                peopleCountPopup.showPopupWindow();
                break;
        }
    }
}
