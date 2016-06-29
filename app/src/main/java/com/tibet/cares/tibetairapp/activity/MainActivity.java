package com.tibet.cares.tibetairapp.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.fragment.CheckInFragment;
import com.tibet.cares.tibetairapp.fragment.FlightNumFragment;
import com.tibet.cares.tibetairapp.fragment.MineFragment;
import com.tibet.cares.tibetairapp.fragment.TicketFragment;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @Bind(R.id.main_content)
    FrameLayout content;
    @Bind(R.id.iv_ticket)
    ImageView ivTicket;
//    @Bind(R.id.tv_ticket)
//    TextView tvTicket;
    @Bind(R.id.ll_ticket)
    LinearLayout llTicket;
    @Bind(R.id.iv_check_in)
    ImageView ivCheckIn;
//    @Bind(R.id.tv_check_in)
//    TextView tvCheckIn;
    @Bind(R.id.ll_check_in)
    LinearLayout llCheckIn;
    @Bind(R.id.iv_flight_num)
    ImageView ivFlightNum;
//    @Bind(R.id.tv_flight_num)
//    TextView tvFlightNum;
    @Bind(R.id.ll_flight_num)
    LinearLayout llFlightNum;
    @Bind(R.id.iv_mine)
    ImageView ivMine;
//    @Bind(R.id.tv_mine)
//    TextView tvMine;
    @Bind(R.id.ll_mine)
    LinearLayout llMine;

    private TicketFragment ticketFragment;
    private CheckInFragment checkInFragment;
    private FlightNumFragment flightNumFragment;
    private MineFragment mineFragment;
    private FragmentTransaction ft;


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        setSelect(0);

    }


    @OnClick({R.id.ll_ticket, R.id.ll_check_in, R.id.ll_flight_num, R.id.ll_mine})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_ticket:
                setSelect(0);
                break;
            case R.id.ll_check_in:
                setSelect(1);
                break;
            case R.id.ll_flight_num:
                setSelect(2);
                break;
            case R.id.ll_mine:
                setSelect(3);
                break;
        }
    }

    private void setSelect(int i) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        ft = fragmentManager.beginTransaction();
        resetTab();
        hideFragment();
        switch (i){
            case 0:
                if (ticketFragment == null){
                    ticketFragment = new TicketFragment();
                    ft.add(R.id.main_content,ticketFragment);
                }
                ivTicket.setImageResource(R.mipmap.jipiao_choose);
//                tvTicket.setTextColor(UIUtils.getColor(R.color.color_yellow));
                ft.show(ticketFragment);
                break;
            case 1:
                if (checkInFragment == null){
                    checkInFragment = new CheckInFragment();
                    ft.add(R.id.main_content,checkInFragment);
                }
                ivCheckIn.setImageResource(R.mipmap.zhiji_choose);
 //               tvCheckIn.setTextColor(UIUtils.getColor(R.color.color_yellow));
                ft.show(checkInFragment);
                break;
            case 2:
                if (flightNumFragment == null){
                    flightNumFragment = new FlightNumFragment();
                    ft.add(R.id.main_content,flightNumFragment);
                }
                ivFlightNum.setImageResource(R.mipmap.hangban_choose);
//                tvFlightNum.setTextColor(UIUtils.getColor(R.color.color_yellow));
                ft.show(flightNumFragment);
                break;
            case 3:
                if (mineFragment == null){
                    mineFragment = new MineFragment();
                    ft.add(R.id.main_content,mineFragment);
                }
                ivMine.setImageResource(R.mipmap.wode_choose);
 //               tvMine.setTextColor(UIUtils.getColor(R.color.color_yellow));
                ft.show(mineFragment);
                break;
        }
        ft.commit();

    }



    //重置
    private void resetTab() {

        ivTicket.setImageResource(R.mipmap.jipiao);
        ivCheckIn.setImageResource(R.mipmap.zhiji);
        ivFlightNum.setImageResource(R.mipmap.hangban);
        ivMine.setImageResource(R.mipmap.wode);

//        tvTicket.setTextColor(UIUtils.getColor(R.color.color_white));
//        tvCheckIn.setTextColor(UIUtils.getColor(R.color.color_white));
//        tvFlightNum.setTextColor(UIUtils.getColor(R.color.color_white));
//        tvMine.setTextColor(UIUtils.getColor(R.color.color_white));

    }

    private void hideFragment() {
        if (ticketFragment != null){
            ft.hide(ticketFragment);
        }

        if (checkInFragment != null){
            ft.hide(checkInFragment);
        }

        if (flightNumFragment != null){
            ft.hide(flightNumFragment);
        }

        if (mineFragment != null){
            ft.hide(mineFragment);
        }




    }
}
