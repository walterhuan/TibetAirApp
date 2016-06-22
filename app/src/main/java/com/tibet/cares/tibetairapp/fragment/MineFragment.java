package com.tibet.cares.tibetairapp.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.activity.MeCommonActivity;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.common.BaseFragment;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/12.
 */
public class MineFragment extends BaseFragment {
    public static final String MINE_ITEM_CASE = "MINE_ITEM_CASE";
    public static final int CASE_PERSONAL_MODIFY = 400;
    //我的订单
    public static final int CASE_MY_ORDER = 401;
    public static final String MY_ORDER_CASE="MY_ORDER_CASE";
    //待付款
    public static final int CASE_PROPOSE_PAYING = 4001;



    //退票查询
    public static final int CASE_RETURN_TICKET_QUERY= 402;


    //设置查询
    public static final int CASE_SETTING = 403;

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
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("个人中心");

    }

    @Override
    protected void initData() {

    }



    @OnClick({R.id.ll_personal_modify,R.id.imgBtn_Propose_Paying,R.id.ll_return_ticket_query,R.id.ll_setting})
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        switch (view.getId()){
            case R.id.ll_personal_modify:
                bundle.putInt(MINE_ITEM_CASE,CASE_PERSONAL_MODIFY);
                break;
            case R.id.imgBtn_Propose_Paying:
                bundle.putInt(MINE_ITEM_CASE,CASE_MY_ORDER);
                bundle.putInt(MY_ORDER_CASE,CASE_PROPOSE_PAYING);
                break;
            case R.id.ll_return_ticket_query:
                bundle.putInt(MINE_ITEM_CASE,CASE_RETURN_TICKET_QUERY);
                break;
            case R.id.ll_setting:
                bundle.putInt(MINE_ITEM_CASE,CASE_SETTING);
                break;
        }
        ((BaseActivity)getActivity()).gotoActivity(MeCommonActivity.class,bundle,false);


    }
}
