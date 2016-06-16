package com.tibet.cares.tibetairapp.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.common.BaseActivity;
import com.tibet.cares.tibetairapp.entity.PassengerEntity;

import butterknife.Bind;
import butterknife.OnClick;

public class TicketDetailActivity extends BaseActivity {


    @Bind(R.id.common_top_left)
    ImageView commonTopLeft;
    @Bind(R.id.common_top_tv)
    TextView commonTopTv;
    @Bind(R.id.common_top_right)
    ImageView commonTopRight;
    @Bind(R.id.ll_passenger_ticket_detial)
    LinearLayout llPassengerTicketDetial;

    @Override
    public int getLayoutId() {
        return R.layout.activity_ticket_detail;
    }

    @Override
    protected void initView() {
        commonTopTv.setText("拉萨->成都");

    }

    @Override
    protected void initData() {

    }


    int tempI = 0;

    @OnClick(R.id.imgBtn_add_passenger)
    public void onClick() {
        tempI++;
        final View psgView = View.inflate(this, R.layout.view_passenger_add, null);
        TextView tv_psgName= (TextView)psgView.findViewById(R.id.tv_psgName_view_passenger);
        psgView.setTag(new PassengerEntity("阿狸" + tempI, "11223344"));
        tv_psgName.setText("阿狸" + tempI);
        psgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PassengerEntity psgEntity = (PassengerEntity) psgView.getTag();
                System.out.println("name=" + psgEntity.psgName + "    id=" + psgEntity.psgIdNo);
            }
        });
        llPassengerTicketDetial.addView(psgView);
    }


}
