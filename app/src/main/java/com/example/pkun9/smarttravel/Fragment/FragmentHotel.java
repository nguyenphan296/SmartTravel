package com.example.pkun9.smarttravel.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.pkun9.smarttravel.Adapter.AdapterHotel;
import com.example.pkun9.smarttravel.Common.ItemClickListener;
import com.example.pkun9.smarttravel.Model.Hotel;
import com.example.pkun9.smarttravel.R;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

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
public class FragmentHotel extends Fragment {
    RecyclerView recycle_hotel;
    AdapterHotel adapterHotel;
    private List<Hotel> listHotel;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel,container,false);
        recycle_hotel = view.findViewById(R.id.recycle_hotel);
        init();
        initData();
        return view;
    }
    private void init(){
        listHotel = new ArrayList<>();
        adapterHotel = new AdapterHotel(getContext(),listHotel);
        mLayoutManager = new GridLayoutManager(getContext(),1);

        recycle_hotel.setHasFixedSize(true);
        recycle_hotel.setLayoutManager(mLayoutManager);
        recycle_hotel.setAdapter(adapterHotel);
        adapterHotel.notifyDataSetChanged();

        adapterHotel.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClickItem(int position, Object item) {
                Hotel hotel = (Hotel) item;
                Toast.makeText(getActivity(),hotel.getsName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initData() {
        listHotel.add(new Hotel("Wyndham Legend Halong",
                "https://pix10.agoda.net/hotelImages/1160137/0/78308a64177d1e1b0bdb033be0d645b8.jpg?s=1024x768",
                "1.671.380đ"));
        listHotel.add(new Hotel("Hotel Novotel Ha Long Bay",
                "https://pix10.agoda.net/hotelImages/108/108286/108286_17051015570052885131.jpg?s=1024x768",
                "1.521.095đ"));
        adapterHotel.notifyDataSetChanged();
        listHotel.add(new Hotel("Khách sạn Grand Hạ Long",
                "https://s3-ap-southeast-1.amazonaws.com/viettrip/Hotels/563/133829_07052013_khach-san-grand-ha-long-3.jpg",
                "1.206.995đ"));
    }
}
