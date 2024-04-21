package com.example.simplerecipeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private final ArrayList<Data> datas;
    private OnItemClickListener itemClickListener;

    public Adapter(ArrayList<Data>datas) {
        this.datas = datas;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Data data = datas.get(position);
        holder.setData(data);

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        itemClickListener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageViewImage;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            imageViewImage = itemView.findViewById(R.id.imageViewImage);
            imageViewImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itemClickListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            itemClickListener.onItemClick(datas.get(position));
                        }
                    }
                }
            });
        }

        public void setData(Data data) {
            imageViewImage.setImageResource(data.getImage1());
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Data data);
    }
}
