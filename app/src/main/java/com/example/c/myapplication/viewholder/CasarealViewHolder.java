package com.example.c.myapplication.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.c.myapplication.R;


public class CasarealViewHolder extends RecyclerView.ViewHolder {
    public TextView titleView;
    public TextView detailView;
    public CasarealViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView) itemView.findViewById(R.id.title);
        detailView = (TextView) itemView.findViewById(R.id.detail);

    }
}