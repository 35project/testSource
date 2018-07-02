package com.example.c.myapplication.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.c.myapplication.R;

public class CasarealViewHolder extends RecyclerView.ViewHolder {
    public TextView bodyView;

    public CasarealViewHolder(View itemView) {
        super(itemView);

        bodyView = (TextView) itemView.findViewById(R.id.body);

    }
}