package com.example.sqoutgeo.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sqoutgeo.R;
import com.example.sqoutgeo.WisataAct;
import com.example.sqoutgeo.models.Wisata;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static androidx.appcompat.widget.AppCompatDrawableManager.get;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder>{

    @NonNull
    @Override
    public WisataAdapter.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata_item,parent , false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.WisataViewHolder holder, int position) {
        final Wisata wisata = arrayListWisata.get(position);

        holder.tvwisata_name.setText(wisata.getName());
        holder.tvwisata_desc.setText(wisata.getDesc());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
  //          @Override
    //        public void onClick(View v) {
      //          Intent intent = new Intent(holder.itemView.getContext(), )
        //    }
        //});
    }

    @Override
    public int getItemCount() {
        return arrayListWisata.size();
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {

        TextView tvwisata_name, tvwisata_desc;
        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvwisata_name = itemView.findViewById(R.id.wisata_name);
            tvwisata_desc = itemView.findViewById(R.id.wisata_desc);
        }
    }
}
