package com.tibet.cares.tibetairapp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.fragment.AddCommonContactFragment;
import com.tibet.cares.tibetairapp.fragment.AddCommonPassengerFragment;
import com.tibet.cares.tibetairapp.fragment.AirlineInsuranceFragment;
import com.tibet.cares.tibetairapp.fragment.CommonContactFragment;
import com.tibet.cares.tibetairapp.fragment.CommonPssengerFragment;
import com.tibet.cares.tibetairapp.fragment.CouponFragment;
import com.tibet.cares.tibetairapp.fragment.RouteBillFragment;
import com.tibet.cares.tibetairapp.fragment.SubmitOrderFragment;

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

    //常用联系人
    CommonContactFragment commonContactFragment;
    //新增常用联系人
    public static final int CASE_ADD_NEW_CONTACT = 101;
    AddCommonContactFragment addCommonContactFragment;

    //航空意外险
    AirlineInsuranceFragment airlineInsuranceFragment;

    //行程单
    RouteBillFragment routeBillFragment;

    //优惠券
    CouponFragment couponFragment;

    //提交订单
    SubmitOrderFragment submitOrderFragment;





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

            case TicketDetailActivity.CASE_LOOK_CONTACT:
                if (commonContactFragment == null) {
                    commonContactFragment = new CommonContactFragment();
                    ft.add(R.id.ticket_common_content, commonContactFragment);
                }
                ft.show(commonContactFragment);
                break;
            case CASE_ADD_NEW_CONTACT:
                addCommonContactFragment = new AddCommonContactFragment();
                ft.add(R.id.ticket_common_content, addCommonContactFragment);
                ft.addToBackStack(null);
                ft.show(addCommonContactFragment);
                break;

            case TicketDetailActivity.CASE_LOOK_INSURANCE:
                if (airlineInsuranceFragment == null) {
                    airlineInsuranceFragment = new AirlineInsuranceFragment();
                    ft.add(R.id.ticket_common_content, airlineInsuranceFragment);
                }
                ft.show(airlineInsuranceFragment);
                break;
            case TicketDetailActivity.CASE_LOOK_ROUTE_BILL:
                if (routeBillFragment == null) {
                    routeBillFragment = new RouteBillFragment();
                    ft.add(R.id.ticket_common_content, routeBillFragment);
                }
                ft.show(routeBillFragment);

                break;
            case TicketDetailActivity.CASE_LOOK_COUPON:
                if (couponFragment == null) {
                    couponFragment = new CouponFragment();
                    ft.add(R.id.ticket_common_content, couponFragment);
                }
                ft.show(couponFragment);

                break;
            case TicketDetailActivity.CASE_LOOK_SUBMIT_ORDER:
                if (submitOrderFragment == null) {
                    submitOrderFragment = new SubmitOrderFragment();
                    ft.add(R.id.ticket_common_content, submitOrderFragment);
                }
                ft.show(submitOrderFragment);

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
        if (commonContactFragment != null) {
            ft.hide(commonContactFragment);
        }
        if (addCommonContactFragment != null) {
            ft.hide(addCommonContactFragment);
        }
        if (airlineInsuranceFragment != null) {
            ft.hide(airlineInsuranceFragment);
        }
        if (routeBillFragment != null) {
            ft.hide(routeBillFragment);
        }
        if (couponFragment != null){
            ft.hide(couponFragment);
        }
        if (submitOrderFragment != null){
            ft.hide(submitOrderFragment);
        }



    }


}
