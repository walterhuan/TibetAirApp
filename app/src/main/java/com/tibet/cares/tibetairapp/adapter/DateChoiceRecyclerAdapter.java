package com.tibet.cares.tibetairapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tibet.cares.tibetairapp.R;
import com.tibet.cares.tibetairapp.util.UIUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by huangxl on 2016/6/13.
 */
public class DateChoiceRecyclerAdapter extends RecyclerView.Adapter<DateChoiceRecyclerAdapter.MyViewHolder> {


    private MyOnItemClickListener myOnItemClickListener;
    public int selectIndex = -1;


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_date_choice, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvDateChoiceDay.setText((position + 1) + "");
        if (selectIndex == position) {
            holder.llDateChoiceBg.setBackgroundColor(UIUtils.getColor(R.color.color_bg_gray_selected));
        }else{
            holder.llDateChoiceBg.setBackgroundColor(UIUtils.getColor(R.color.color_bg_gray_unselect));
        }


    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public void setOnItemClickListener(MyOnItemClickListener myOnItemClickListener) {
        this.myOnItemClickListener = myOnItemClickListener;

    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @Bind(R.id.tv_date_choice_week)
        TextView tvDateChoiceWeek;
        @Bind(R.id.tv_date_choice_day)
        TextView tvDateChoiceDay;
        @Bind(R.id.tv_date_choice_price)
        TextView tvDateChoicePrice;
        @Bind(R.id.ll_date_choice_bg)
        LinearLayout llDateChoiceBg;


        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void onClick(View v) {
            if (myOnItemClickListener != null) {
                myOnItemClickListener.myOnItemClick(v, getAdapterPosition());

            }
        }
    }

    public interface MyOnItemClickListener {
        public void myOnItemClick(View view, int position);
    }

}
