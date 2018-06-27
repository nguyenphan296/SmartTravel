package com.example.pkun9.smarttravel.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.pkun9.smarttravel.Common.ItemClickListener;
import com.example.pkun9.smarttravel.Model.Hotel;
import com.example.pkun9.smarttravel.Model.Language;
import com.example.pkun9.smarttravel.R;

import java.util.List;

/**
 * @author Phạm Công Thành
 * @version 1.0.0
 * @description
 * @created ${Date}
 * @updated ${Date}
 * @modified by
 * @updated on ${Date}
 * @since 1.0
 */
public class AdapterHotel extends RecyclerView.Adapter<AdapterHotel.HotelViewHolder> {
    private Context mContext;
    private List<Hotel> listHotel;
    private ItemClickListener itemClickListener;

    public AdapterHotel(Context mContext, List<Hotel> listHotel) {
        this.mContext = mContext;
        this.listHotel = listHotel;
    }

    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hotel, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        Hotel hotel = listHotel.get(position);
        holder.txt_name_hotel.setText(hotel.getsName());
        holder.txt_price.setText(hotel.getsPrice());
        Glide.with(mContext).load(hotel.getsImage()).into(holder.img_hotel);
    }

    @Override
    public int getItemCount() {
        return listHotel.size();
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txt_name_hotel;
        ImageView img_hotel;
        TextView txt_price;

        public HotelViewHolder(View itemView) {
            super(itemView);
            txt_name_hotel = itemView.findViewById(R.id.txt_name_hotel);
            img_hotel = itemView.findViewById(R.id.img_hotel);
            txt_price = itemView.findViewById(R.id.txt_price);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClickItem(getLayoutPosition(),listHotel.get(getLayoutPosition()));
        }
    }
}
