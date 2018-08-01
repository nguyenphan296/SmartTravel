package com.example.pkun9.smarttravel.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.example.pkun9.smarttravel.Adapter.AdapterRestaurant;

import com.example.pkun9.smarttravel.Common.ItemClickListener;
import com.example.pkun9.smarttravel.Model.Restaurant;
import com.example.pkun9.smarttravel.R;

import java.util.ArrayList;
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
public class FragmentRestaurant extends Fragment {

    RecyclerView recycle_restaurant;
    AdapterRestaurant adapterRestaurant;
    private List<Restaurant> lisRestaurant;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        recycle_restaurant= view.findViewById(R.id.recycle_restaurant);
        init();
        initData();
        return view;

    }




    private void init() {
        lisRestaurant =new ArrayList<>();
        adapterRestaurant = new AdapterRestaurant(getContext(), lisRestaurant);
        mLayoutManager = new GridLayoutManager(getContext(), 1);
        recycle_restaurant.setHasFixedSize(true);
        recycle_restaurant.setLayoutManager(mLayoutManager);
        recycle_restaurant.setItemAnimator(new DefaultItemAnimator());
        recycle_restaurant.setAdapter(adapterRestaurant);
        adapterRestaurant.notifyDataSetChanged();

        adapterRestaurant.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClickItem(int position, Object item) {
                Restaurant restaurant = (Restaurant) item;
                Toast.makeText(getContext(), ""+restaurant.getsRestaurant(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClickItem(int position, Object item) {

            }
        });

    }
    private void initData() {
        lisRestaurant.add(new Restaurant(R.drawable.restaurant,"Tên nhà hàng", "Địa chỉ:","SDT:","Giá:"));
        lisRestaurant.add(new Restaurant(R.drawable.restaurant,"Tên nhà hàng", "Địa chỉ:","SDT:","Giá:"));
        lisRestaurant.add(new Restaurant(R.drawable.restaurant,"Tên nhà hàng", "Địa chỉ:","SDT:","Giá:"));
        lisRestaurant.add(new Restaurant(R.drawable.restaurant,"Tên nhà hàng", "Địa chỉ:","SDT:","Giá:"));
        lisRestaurant.add(new Restaurant(R.drawable.restaurant,"Tên nhà hàng", "Địa chỉ:","SDT:","Giá:"));
        lisRestaurant.add(new Restaurant(R.drawable.restaurant,"Tên nhà hàng", "Địa chỉ:","SDT:","Giá:"));
        adapterRestaurant.notifyDataSetChanged();
    }
}
