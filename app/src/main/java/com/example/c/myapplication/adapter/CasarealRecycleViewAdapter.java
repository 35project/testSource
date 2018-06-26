package com.example.c.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import com.example.c.myapplication.R;
import com.example.c.myapplication.model.RowData;
import com.example.c.myapplication.viewholder.CasarealViewHolder;


public class CasarealRecycleViewAdapter extends RecyclerView.Adapter<CasarealViewHolder> {

    private List<RowData> list;

    public CasarealRecycleViewAdapter(List<RowData> list) {
        this.list = list;
    }

    @Override
    public CasarealViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        CasarealViewHolder vh = new CasarealViewHolder(inflate);
        return vh;
    }

    @Override
    public void onBindViewHolder(CasarealViewHolder holder, int position) {
        holder.titleView.setText(list.get(position).getTitle());
        holder.detailView.setText(list.get(position).getDetail());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}