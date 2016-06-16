package com.tibet.cares.tibetairapp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by huangxl on 2016/6/15.
 */
public class FlightSearchDetailAdapter extends BaseAdapter {


    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(parent.getContext(), R.layout.item_flight_search_detail, null);
        }
        ViewHolder viewHolder = ViewHolder.getViewHolder(convertView);

        viewHolder.textVTicketCountItemSearchDetail.setText(position+"张");


        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.textV_ticket_count_item_search_detail)
        TextView textVTicketCountItemSearchDetail;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }

        public static ViewHolder getViewHolder(View convertView) {
            ViewHolder viewHolder = (ViewHolder) convertView.getTag();
            if (viewHolder == null){
                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            }
            return viewHolder;
        }
    }
}
