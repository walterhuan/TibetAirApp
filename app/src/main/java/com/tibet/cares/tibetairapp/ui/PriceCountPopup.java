package com.tibet.cares.tibetairapp.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;

import com.tibet.cares.tibetairapp.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import razerdp.basepopup.BasePopupWindow;


/**
 * Created by 大灯泡 on 2016/1/15.
 * 从底部滑上来的popup
 */
public class PriceCountPopup extends BasePopupWindow implements View.OnClickListener {

    private View popupView;

    public PriceCountPopup(Activity context) {
        super(context);
        bindEvent();
    }


    @Override
    protected Animation getShowAnimation() {
        return null;//getTranslateAnimation(200,0,300);
    }

    @Override
    protected View getClickToDismissView() {
        return popupView.findViewById(R.id.click_to_dismiss);
    }

    @Override
    public View getPopupView() {
        popupView = LayoutInflater.from(mContext).inflate(R.layout.popup_bottom_order_price, null);
        return popupView;
    }

    @Override
    public View getAnimaView() {
        return popupView.findViewById(R.id.popup_anima);
    }

    private void bindEvent() {
        if (popupView != null) {
            ButterKnife.bind(this,popupView);
            //            popupView.findViewById(R.id.tx_1).setOnClickListener(this);
            //            popupView.findViewById(R.id.tx_2).setOnClickListener(this);
            //            popupView.findViewById(R.id.tx_3).setOnClickListener(this);
        }

    }

    @Override
    public void dismiss() {
        super.dismiss();
        ButterKnife.unbind(this);
    }

    //    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            //            case R.id.tx_1:
//            //                System.out.println("click tx_1");
//            //                dismiss();
//            //                break;
//            //            case R.id.tx_2:
//            //                System.out.println("click tx_2");
//            //                break;
//            //            case R.id.tx_3:
//            //                System.out.println("click tx_3");
//            //                break;
//            default:
//                break;
//        }
//
//    }

    @OnClick({R.id.btn_submit_order, R.id.ll_price_parent})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_submit_order:
                System.out.println("btn order");
                break;
            case R.id.ll_price_parent:
                System.out.println("ll parent");
                break;
        }
    }
}
