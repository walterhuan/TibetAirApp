package com.tibet.cares.tibetairapp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.fragment.AboutFragment;
import com.tibet.cares.tibetairapp.fragment.ChangePassWordFragment;
import com.tibet.cares.tibetairapp.fragment.MineFragment;
import com.tibet.cares.tibetairapp.fragment.OrderDetailFragment;
import com.tibet.cares.tibetairapp.fragment.PersonalDetailFragment;
import com.tibet.cares.tibetairapp.fragment.PersonalModifyFragment;
import com.tibet.cares.tibetairapp.fragment.PersonalOrderFragment;
import com.tibet.cares.tibetairapp.fragment.QueryOrderFragment;
import com.tibet.cares.tibetairapp.fragment.ReturnTicketQueryFragment;
import com.tibet.cares.tibetairapp.fragment.SettingFragment;

public class MeCommonActivity extends BaseActivity {
    private int itemCase;
    FragmentManager fm;
    FragmentTransaction ft;
    private Bundle bundle;

    //个人信息
    PersonalDetailFragment personalDetailFragment;

    //个人信息修改
    PersonalModifyFragment personalModifyFragment;

    //我的订单界面
    PersonalOrderFragment personalOrderFragment;

    //订单查询条件模块
    QueryOrderFragment queryOrderFragment;


    //订单详情
    OrderDetailFragment orderDetailFragment;

    //退票查询
    ReturnTicketQueryFragment returnTicketQueryFragment;

    //设置
    SettingFragment settingFragment;

    //修改密码
    ChangePassWordFragment changePassWordFragment;

    //关于
    AboutFragment aboutFragment;




    @Override
    public int getLayoutId() {
        return R.layout.activity_me_common;
    }

    @Override
    protected void initView() {
        bundle = getIntent().getBundleExtra("bundle");
        itemCase = bundle.getInt(MineFragment.MINE_ITEM_CASE);
        selectFragment(itemCase);


    }

    @Override
    protected void initData() {

    }

    public void selectFragment(int itemCase) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        hideFragment();
        switch (itemCase){
            case MineFragment.CASE_PERSONAL_MODIFY:
                if (personalDetailFragment == null){
                    personalDetailFragment = new PersonalDetailFragment();
                    ft.add(R.id.me_common_content,personalDetailFragment);
                }
                ft.show(personalDetailFragment);
                break;

            case PersonalDetailFragment.MODIFY_PERSONAL_INFO:
                personalModifyFragment = new PersonalModifyFragment();
                ft.add(R.id.me_common_content,personalModifyFragment);
                ft.addToBackStack(null);
                ft.show(personalModifyFragment);
                break;
            case MineFragment.CASE_MY_ORDER:
                int orderCase = bundle.getInt(MineFragment.MY_ORDER_CASE,4001);
                if (personalOrderFragment == null){
                    personalOrderFragment = PersonalOrderFragment.newInstance(orderCase);
                    ft.add(R.id.me_common_content,personalOrderFragment);
                }
                ft.show(personalOrderFragment);
                break;
            case PersonalOrderFragment.MODULE_QUERY_ORDER:
                queryOrderFragment =new QueryOrderFragment();
                ft.add(R.id.me_common_content,queryOrderFragment);
                ft.addToBackStack(null);
                ft.show(queryOrderFragment);
                break;
            case PersonalOrderFragment.ORDER_DETAIL:
                orderDetailFragment =new OrderDetailFragment();
                ft.add(R.id.me_common_content,orderDetailFragment);
                ft.addToBackStack(null);
                ft.show(orderDetailFragment);
                break;
            case MineFragment.CASE_RETURN_TICKET_QUERY:
                if (returnTicketQueryFragment == null){
                    returnTicketQueryFragment = new ReturnTicketQueryFragment();
                    ft.add(R.id.me_common_content,returnTicketQueryFragment);
                }
                ft.show(returnTicketQueryFragment);
                break;
            case MineFragment.CASE_SETTING:
                if (settingFragment == null){
                    settingFragment = new SettingFragment();
                    ft.add(R.id.me_common_content,settingFragment);
                }
                ft.show(settingFragment);
                break;
            case SettingFragment.CASE_CHANGE_PASSWORD:
                changePassWordFragment =new ChangePassWordFragment();
                ft.add(R.id.me_common_content,changePassWordFragment);
                ft.addToBackStack(null);
                ft.show(changePassWordFragment);
                break;
            case SettingFragment.CASE_ABOUT:
                aboutFragment =new AboutFragment();
                ft.add(R.id.me_common_content,aboutFragment);
                ft.addToBackStack(null);
                ft.show(aboutFragment);
                break;


        }
        ft.commit();

    }

    private void hideFragment() {
        if (personalDetailFragment != null){
            ft.hide(personalDetailFragment);
        }
        if (personalModifyFragment != null){
            ft.hide(personalModifyFragment);
        }
        if (personalOrderFragment != null){
            ft.hide(personalOrderFragment);
        }
        if (queryOrderFragment != null){
            ft.hide(queryOrderFragment);
        }
        if (orderDetailFragment != null){
            ft.hide(orderDetailFragment);
        }
        if (returnTicketQueryFragment != null){
            ft.hide(returnTicketQueryFragment);
        }

        if (settingFragment != null){
            ft.hide(settingFragment);
        }

        if (changePassWordFragment !=null){
            ft.hide(changePassWordFragment);
        }
        if (aboutFragment !=null){
            ft.hide(aboutFragment);
        }



    }
}
