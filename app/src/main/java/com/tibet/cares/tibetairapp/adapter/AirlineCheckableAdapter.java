package com.tibet.cares.tibetairapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.entity.AirlineEntity;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by huangxl on 2016/6/14.
 */
public class AirlineCheckableAdapter extends BaseAdapter {

    private List<AirlineEntity> dataList;
    private Context context;

    public AirlineCheckableAdapter(List<AirlineEntity> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_air_line_checkable, null);
        }
        ViewHolder viewHolder = ViewHolder.getViewHolder(convertView);
        viewHolder.airlineName.setText(dataList.get(position).airline_name);


        return convertView;
    }


    static class ViewHolder {
        @Bind(R.id.airline_name)
        TextView airlineName;

        public ViewHolder(View convertView) {
            ButterKnife.bind(this, convertView);
        }

        public static ViewHolder getViewHolder(View convertView) {
            ViewHolder viewHolder = (ViewHolder) convertView.getTag();
            if (viewHolder == null) {
                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            }
            return viewHolder;
        }
    }


}
