package com.tibet.cares.tibetairapp.activity;

import android.util.SparseBooleanArray;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.adapter.AirlineCheckableAdapter;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.entity.AirlineEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by huangxl on 2016/6/14.
 */
public class FilterFlightNumActivity extends BaseActivity {

    @Bind(R.id.common_top_left)
    ImageView commonTopLeft;
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.common_top_right)
    ImageView commonTopRight;
    @Bind(R.id.lv_filter_flight_num)
    ListView lvFilterFlightNum;

    @Override
    public int getLayoutId() {
        return R.layout.activity_filter_flight_num;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("筛选");


    }

    @Override
    protected void initData() {
        List<AirlineEntity> dataAirline = new ArrayList<AirlineEntity>();
        for (int i = 0; i < 2; i++) {
            dataAirline.add(new AirlineEntity("航空公司 " + i));

        }
        AirlineCheckableAdapter adapter = new AirlineCheckableAdapter(dataAirline, this);
        lvFilterFlightNum.setAdapter(adapter);

    }


    @OnClick(R.id.btn_confirm_filter_flight_num)
    public void onClick() {
        SparseBooleanArray checkedItemPositions = lvFilterFlightNum.getCheckedItemPositions();
        for (int i=0;i<checkedItemPositions.size();i++) {
            if (checkedItemPositions.valueAt(i))

            System.out.println("   选中了 "+checkedItemPositions.keyAt(i));
        }

    }
}
