package com.tibet.cares.tibetairapp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.fragment.AddCommonPassengerFragment;
import com.tibet.cares.tibetairapp.fragment.CommonPssengerFragment;

import butterknife.Bind;

public class TicketCommonActivity extends BaseActivity {
    @Bind(R.id.ticket_common_content)
    FrameLayout ticketCommonContent;

    FragmentManager fm;
    FragmentTransaction ft;
    private int itemCase;
    //常用乘机人
    CommonPssengerFragment commonPssengerFragment;
    //新增乘机人
    public static final int CASE_ADD_NEW_PASSENGER = 100;
    AddCommonPassengerFragment addCommonPassengerFragment;





    @Override
    public int getLayoutId() {
        return R.layout.activity_ticket_common;
    }

    @Override
    protected void initView() {
        Bundle bundle = getIntent().getBundleExtra("bundle");
        itemCase = bundle.getInt(TicketDetailActivity.TICKET_ITEM_CASE, 0);
        System.out.println("itemCase=" + itemCase);
        selectFragment(itemCase);


        //        fm = getSupportFragmentManager();
        //        ft = fm.beginTransaction();
        //
        //
        //
        //        switch (itemCase) {
        //            //常用乘机人
        //            case TicketDetailActivity.CASE_LOOK_PASSENGER:
        //                CommonPssengerFragment  commonPssengerFragment = new CommonPssengerFragment();
        //                showFragment(ft, commonPssengerFragment);
        //                break;
        //        }
        //
        //
        //        ft.commit();

    }

    public void selectFragment(int itemCase) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        hideCommonfragment();
        switch (itemCase) {
            case TicketDetailActivity.CASE_LOOK_PASSENGER:
                if (commonPssengerFragment == null) {
                    commonPssengerFragment = new CommonPssengerFragment();
                    ft.add(R.id.ticket_common_content, commonPssengerFragment);
                }
                ft.show(commonPssengerFragment);

                break;
            case CASE_ADD_NEW_PASSENGER:
                addCommonPassengerFragment = new AddCommonPassengerFragment();
                ft.add(R.id.ticket_common_content, addCommonPassengerFragment);
                ft.addToBackStack(null);
                ft.show(addCommonPassengerFragment);
                break;


        }

        ft.commit();

    }

    //    private void showFragment(FragmentTransaction ft, CommonPssengerFragment commonPssengerFragment) {
    //        ft.replace(R.id.ticket_common_content,commonPssengerFragment);
    //        ft.show(commonPssengerFragment);
    //    }

    @Override
    protected void initData() {


    }


    //    //页面跳转
    //    public void goForward(int forWardCase){
    //        ft = fm.beginTransaction();
    //        hideCommonfragment();
    //
    //        switch (forWardCase){
    //            case CASE_ADD_NEW_PASSENGER:
    //                ft.replace(R.id.ticket_common_content,new AddCommonPassengerFragment());
    //                ft.addToBackStack(null);
    //                ft.commit();
    //            break;
    //
    //        }
    //
    //    }

    private void hideCommonfragment() {
        if (commonPssengerFragment != null) {
            ft.hide(commonPssengerFragment);
        }
        if (addCommonPassengerFragment != null) {
            ft.hide(addCommonPassengerFragment);
        }






    }


}
