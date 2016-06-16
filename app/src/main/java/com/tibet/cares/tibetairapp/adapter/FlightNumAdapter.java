package com.tibet.cares.tibetairapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by huangxl on 2016/6/13.
 */
public class FlightNumAdapter extends BaseAdapter{

    private List<String> data;
    private Context context;

    public FlightNumAdapter(Context context,List<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = View .inflate(context, R.layout.item_flt_num, null);
        }
        ViewHolder viewHolder = ViewHolder.getHolder(convertView);

        viewHolder.tvItemFltNumDepartTime.setText("11:25");




        return convertView;
    }
    static class ViewHolder{
        @Bind(R.id.tv_item_flt_num_depart_time)
        TextView tvItemFltNumDepartTime;

        public ViewHolder(View convertView) {
            ButterKnife.bind(this,convertView);
        }

        public static ViewHolder getHolder(View convertView) {
            ViewHolder holder = (ViewHolder)convertView.getTag();
            if (holder == null){
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            }
            return holder;
        }
    }
}
