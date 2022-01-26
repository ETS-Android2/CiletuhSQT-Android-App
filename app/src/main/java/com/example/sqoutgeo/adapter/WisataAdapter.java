package com.example.sqoutgeo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sqoutgeo.R;
import com.example.sqoutgeo.models.Feature;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder>{

    private ArrayList<Feature> arrayListFeature;
    private Context context;

    public WisataAdapter(Context context) {
        this.arrayListFeature = new ArrayList<>();
        this.context = context;
    }


    public void setFeature(ArrayList<Feature> arrayListFeature) {
        this.arrayListFeature = arrayListFeature;
    }

    @NonNull
    @Override
    public WisataAdapter.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WisataViewHolder(LayoutInflater.from(context).inflate(R.layout.wisata_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.WisataViewHolder holder, final int position) {
        final Feature feature = arrayListFeature.get(position);

        holder.tv_name.setText(feature.getName());
        holder.tv_desc.setText(feature.getDesc());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
  //          @Override
    //        public void onClick(View v) {
      //          Intent intent = new Intent(holder.itemView.getContext(), )
        //    }
        //});
    }

    @Override
    public int getItemCount() {
        return arrayListFeature.size();
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name, tv_desc;
        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.wisata_name);
            tv_desc = itemView.findViewById(R.id.wisata_desc);
        }
    }
}
