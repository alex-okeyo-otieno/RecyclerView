package com.example.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<String> list;
    public RecyclerAdapter(List<String>list)
    {
        this.list=list;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textView= (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.display_layout,parent,false);
        MyViewHolder holder=new MyViewHolder(textView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.version_names.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static  class MyViewHolder extends RecyclerView.ViewHolder
    {
       private TextView version_names;

        public MyViewHolder(@NonNull TextView itemView) {
            super(itemView);
            version_names=itemView;
        }
    }
}
