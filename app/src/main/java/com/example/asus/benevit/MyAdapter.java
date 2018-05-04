package com.example.asus.benevit;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asus on 4/7/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<HomeVitamin> listitem;
    private Context context;
    private LinearLayout list_item;

    public MyAdapter(List<HomeVitamin> listitem, Context context) {
        this.listitem = listitem;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_vitamin, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HomeVitamin list = listitem.get(position);

        holder.pict.setImageResource(list.getPict());
        holder.name.setText(list.getName());

    }

    @Override
    public int getItemCount() {

        return listitem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView pict;
        public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            pict = (ImageView) itemView.findViewById(R.id.picture);
            name = (TextView) itemView.findViewById(R.id.name);
            list_item = (LinearLayout) itemView.findViewById(R.id.list_item);
            list_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
//                    switch (getAdapterPosition()){
//                        case 0 :
//                            intent = new Intent(context, Vitamin.class);
//                            break;
//                        case 1 :
//                            intent = new Intent(context, B_Vitamin.class);
//                            break;
//                    }
                    intent = new Intent(context, Vitamin.class);
                    intent.putExtra("position",getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }
}
