package com.example.test_bmi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BMIAdapter extends RecyclerView.Adapter<BMIAdapter.ViewHolder> {
    @NonNull


    private List<item_list> Bmilist;

    public BMIAdapter(@NonNull List<item_list> bmilist) {
       this.Bmilist = bmilist;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        ViewHolder holder = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        item_list item_list = Bmilist.get(position);
        holder.height.setText(item_list.height);
        holder.weight.setText(item_list.weight);
        holder.Bmi.setText(item_list.bmi);

    }

    @Override
    public int getItemCount() {

        if (Bmilist != null) {
            return Bmilist.size();

        }else{
        return 0;
        }
    }
    class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView weight;

        private final TextView height;
        private final TextView Bmi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            height = (TextView) itemView.findViewById(R.id.tv_height);
            weight = (TextView) itemView.findViewById(R.id.tv_weight);
            Bmi = (TextView) itemView.findViewById(R.id.tv_Bmi);
        }
    }
}

