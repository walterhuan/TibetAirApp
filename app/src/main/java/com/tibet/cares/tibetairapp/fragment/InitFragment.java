package com.tibet.cares.tibetairapp.fragment;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseFragment;

import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/6.
 */
public class InitFragment extends BaseFragment {

    private InitFmListener initFmListener;
    public final static int CLICK_LOGIN = 0;
    public final static int CLICK_REGISTER = 1;
    public final static int CLICK_VISITOR = 3;


    @Override
    public int getLayoutId() {
        return R.layout.fragment_init;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }


    @OnClick({R.id.fm_init_btn_login, R.id.fm_init_btn_register, R.id.fm_init_text_visitor})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fm_init_btn_login:
                initFmListener.OnClickInitFm(CLICK_LOGIN);
                break;
            case R.id.fm_init_btn_register:
                initFmListener.OnClickInitFm(CLICK_REGISTER);
                break;
            case R.id.fm_init_text_visitor:
                initFmListener.OnClickInitFm(CLICK_VISITOR);
                break;
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println("attach context");
        initFmListener=(InitFmListener)((Activity)context);
    }

    public interface InitFmListener{
        public void OnClickInitFm(int click);
    }
}
