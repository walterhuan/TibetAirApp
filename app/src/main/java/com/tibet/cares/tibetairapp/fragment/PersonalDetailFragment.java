package com.tibet.cares.tibetairapp.fragment;

import android.view.View;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.activity.MeCommonActivity;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.ui.SelectPhotoPopup;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/21.
 */
public class PersonalDetailFragment extends BaseFragment {
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;


    public static final int MODIFY_PERSONAL_INFO = 4000;


    @Override
    public int getLayoutId() {
        return R.layout.fragment_personal_detail;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("个人信息");

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.ll_modify_personal_info,R.id.ll_select_photo})
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ll_modify_personal_info:

                ((MeCommonActivity)getActivity()).selectFragment(MODIFY_PERSONAL_INFO);


                break;

            case R.id.ll_select_photo:

                SelectPhotoPopup selectPhotoPopup = new SelectPhotoPopup(getActivity());
                selectPhotoPopup.showPopupWindow();

                break;

        }



    }
}
