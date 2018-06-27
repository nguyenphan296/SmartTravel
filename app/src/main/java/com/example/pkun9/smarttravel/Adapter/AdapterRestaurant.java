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
import com.example.pkun9.smarttravel.Model.Restaurant;
import com.example.pkun9.smarttravel.R;

import java.util.List;



/**
 * @author Nguyễn Đức Cảnh
 * @version 1.0.0
 * @description
 * @desc BKHN
 * @created ${Date}
 * @updated ${Date}
 * @modified by
 * @updated on ${Date}
 * @since 1.0
 */
public class AdapterRestaurant extends RecyclerView.Adapter<AdapterRestaurant.RestaurantViewHolder> {
    private Context mContext;
    private List<Restaurant> lisRestaurant;
    private ItemClickListener itemClickListener;

    public AdapterRestaurant(Context mContext, List<Restaurant> lisRestaurant) {
        this.mContext = mContext;
        this.lisRestaurant = lisRestaurant;
    }



    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_restaurant, parent, false);
        return new RestaurantViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = lisRestaurant.get(position);
        holder.txtRestaurant.setText(restaurant.getsRestaurant());
        holder.txtDiaChi.setText(restaurant.getsDiaChi());
        holder.txtSDT.setText(restaurant.getsSDT());
        holder.txtGia.setText(restaurant.getsGia());
        Glide.with(mContext).load(restaurant.getsImgRes()).into(holder.imgRes);
    }

    @Override
    public int getItemCount() {
        return lisRestaurant.size();
    }

    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{

        TextView txtRestaurant, txtDiaChi, txtSDT, txtGia;
        ImageView imgRes;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            txtRestaurant = itemView.findViewById(R.id.txtRestaurant);
            txtDiaChi= itemView.findViewById(R.id.txtDiachi);
            txtSDT= itemView.findViewById(R.id.txtSDT);
            txtGia= itemView.findViewById(R.id.txtGia);
            imgRes = itemView.findViewById(R.id.img_restaurant);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClickItem(getLayoutPosition(), lisRestaurant.get(getLayoutPosition()));
        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }


    }

    public void update_list(List<Restaurant> list) {
        lisRestaurant.clear();
        lisRestaurant.addAll(list);
        notifyDataSetChanged();
    }

}
