package com.tibet.cares.tibetairapp.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.adapter.DateChoiceRecyclerAdapter;
import com.tibet.cares.tibetairapp.adapter.FlightNumAdapter;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.util.UIUtils;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 航班查询页面
 */
public class TicketSearchFlightActivity extends BaseActivity implements DateChoiceRecyclerAdapter.MyOnItemClickListener,AdapterView.OnItemClickListener{
    @Bind(R.id.common_top_left)
    ImageView commonTopLeft;
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.common_top_right)
    ImageView commonTopRight;
    @Bind(R.id.common_ll)
    LinearLayout commonLl;
    @Bind(R.id.recView_fltNum_date_choice)
    RecyclerView recViewFltNumDateChoice;
    @Bind(R.id.lv_flight_num)
    ListView lvFlightNum;

    DateChoiceRecyclerAdapter dateChoiceRecyclerAdapter;



    @Override
    public int getLayoutId() {
        return R.layout.activity_search_flight;
    }

    @Override
    protected void initView() {
        commonTopTv.setText(UIUtils.getString(R.string.str_flight_search));
        commonTopRight.setVisibility(ImageView.VISIBLE);

    }

    @Override
    protected void initData() {
        setRecyclerAdapter();
        setListViewAdapter();
    }
    private void setRecyclerAdapter() {

        dateChoiceRecyclerAdapter = new DateChoiceRecyclerAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recViewFltNumDateChoice.setLayoutManager(linearLayoutManager);
        recViewFltNumDateChoice.setAdapter(dateChoiceRecyclerAdapter);
        dateChoiceRecyclerAdapter.setOnItemClickListener(this);


    }

    private void setListViewAdapter() {
        lvFlightNum.setAdapter(new FlightNumAdapter(this, null));
        lvFlightNum.setOnItemClickListener(this);


    }


    @Override
    public void myOnItemClick(View view, int position) {
        dateChoiceRecyclerAdapter.selectIndex = position;
        dateChoiceRecyclerAdapter.notifyDataSetChanged();
    }


    @OnClick(R.id.common_top_right)
    public void onClick() {
        gotoActivity(FilterFlightNumActivity.class, null,false);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println(position+"");
        gotoActivity(TicketSearchFlightDetailActivity.class,null,false);
    }
}
