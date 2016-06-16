package com.tibet.cares.tibetairapp.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.adapter.FlightSearchDetailAdapter;
import com.tibet.cares.tibetairapp.common.BaseActivity;

import butterknife.Bind;

public class TicketSearchFlightDetailActivity extends BaseActivity implements AdapterView.OnItemClickListener {


    @Bind(R.id.common_top_left)
    ImageView commonTopLeft;
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.common_top_right)
    ImageView commonTopRight;
    @Bind(R.id.lv_ticket_search_flight_detail)
    ListView lvTicketSearchFlightDetail;

    FlightSearchDetailAdapter flightSearchDetailAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_ticket_search_flight_detail;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("拉萨->成都");

    }

    @Override
    protected void initData() {
        setListAdapter();

    }

    private void setListAdapter() {
        flightSearchDetailAdapter = new FlightSearchDetailAdapter();
        lvTicketSearchFlightDetail.setAdapter(flightSearchDetailAdapter);
        lvTicketSearchFlightDetail.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        gotoActivity(TicketDetailActivity.class,null,false);
    }
}
