package com.tibet.cares.tibetairapp.fragment;

import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.activity.TicketCommonActivity;
import com.tibet.cares.tibetairapp.adapter.CommonPassengerAdapter;
import com.tibet.cares.tibetairapp.common.BaseFragment;
import com.tibet.cares.tibetairapp.entity.PassengerEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/17.
 */
public class CommonPssengerFragment extends BaseFragment {
    @Bind(R.id.common_top_left)
    ImageView commonTopLeft;
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.common_top_right)
    ImageView commonTopRight;
    @Bind(R.id.lv_common_passenger)
    ListView lvCommonPassenger;

    private int i =0;

    List<PassengerEntity> list;
    CommonPassengerAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_common_passenger;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("常用乘机人");
        commonTopRight.setVisibility(ImageView.VISIBLE);
        System.out.println("i=" + i);

    }

    @Override
    protected void initData() {
        i++;




        setListAdapter();



    }

    private List<PassengerEntity> getTempData() {

        if (list!=null){
            list.add(new PassengerEntity("妹子","112200"));
            System.out.println("listSize=" + list.size());}else {

            list = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                PassengerEntity entity = new PassengerEntity("阿狸" + i, "599020390290392039");
                list.add(entity);
            }
        }
        return list;

    }

    private void setListAdapter() {

        adapter = new CommonPassengerAdapter(getTempData());

        lvCommonPassenger.setAdapter(adapter);
    }



    @OnClick(R.id.ll_add_common_psg)
    public void onClick() {
        ((TicketCommonActivity)getActivity()).selectFragment(TicketCommonActivity.CASE_ADD_NEW_PASSENGER);



    }
}
