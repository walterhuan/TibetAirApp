package com.tibet.cares.tibetairapp.fragment;

import android.widget.ImageView;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseFragment;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/17.
 */
public class AddCommonPassengerFragment extends BaseFragment {
    @Bind(R.id.common_top_left)
    ImageView commonTopLeft;
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.common_top_right)
    ImageView commonTopRight;


    //    public static AddCommonPassengerFragment newInstance() {
    //        Bundle args = new Bundle();
    //        AddCommonPassengerFragment fragment = new AddCommonPassengerFragment();
    //        fragment.setArguments(args);
    //        return fragment;
    //    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_add_common_passenger;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("新增乘机人");

    }

    @Override
    protected void initData() {

    }



    @OnClick(R.id.btn_confirm_add_commom_passenger)
    public void onClick() {
        getFragmentManager().popBackStack();
    }
}
