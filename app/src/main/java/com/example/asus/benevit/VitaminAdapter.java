package com.example.asus.benevit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bayuguna on 5/3/2018.
 */

public class VitaminAdapter extends RecyclerView.Adapter<VitaminAdapter.ViewHolder> {

    private List<VitaminHome> listVitamin;
    private Context context;
    private LinearLayout vitamin_menu;

    public VitaminAdapter(List<VitaminHome> listVitamin, Context context) {
        this.listVitamin = listVitamin;
        this.context = context;
    }

    @Override
    public VitaminAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_vitamin, parent, false);
        return new VitaminAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(VitaminAdapter.ViewHolder holder, int position) {
        VitaminHome list = listVitamin.get(position);

        holder.pict.setImageResource(list.getPict());
        holder.name.setText(list.getName());
        holder.desc.setText(list.getDesc());

    }

    @Override
    public int getItemCount() {
        return listVitamin.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView pict;
        public TextView name;
        public TextView desc;
        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            pict = (ImageView) itemView.findViewById(R.id.picture);
            name = (TextView) itemView.findViewById(R.id.name);
            desc = (TextView) itemView.findViewById(R.id.desc);
            vitamin_menu = (LinearLayout) itemView.findViewById(R.id.vitamin_menu);
        }
    }
}
