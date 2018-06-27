package com.example.pkun9.smarttravel.Fragment;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pkun9.smarttravel.Adapter.AdapterLanguage;
import com.example.pkun9.smarttravel.Adapter.DiaDiemDuLichAdapter;
import com.example.pkun9.smarttravel.DiaDiemDuLich;
import com.example.pkun9.smarttravel.Model.Language;
import com.example.pkun9.smarttravel.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Phạm Hoàng Dự
 * @version 1.0.0
 * @description
 * @desc Technical Director, FPT-Software.
 * @created ${Date}
 * @updated ${Date}
 * @modified by
 * @updated on ${Date}
 * @since 1.0
 */
public class FragmentDiaDiem extends Fragment {
    RecyclerView recycle_DiaDiem;
    DiaDiemDuLichAdapter adapterDiaDiem;
    private List<DiaDiemDuLich> lisDiaDiem;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_diadiem,container,false);
        //View view = inflater.inflate(R.layout.fragment_diadiem, container, false);
        recycle_DiaDiem = view.findViewById(R.id.recycle_diadiem);
        init();
        initData();
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private void init() {
        lisDiaDiem = new ArrayList<>();
        adapterDiaDiem = new DiaDiemDuLichAdapter(getContext(), lisDiaDiem);
        mLayoutManager = new GridLayoutManager(getContext(), 2);
        recycle_DiaDiem.setHasFixedSize(true);
        recycle_DiaDiem.setLayoutManager(mLayoutManager);
        recycle_DiaDiem.setItemAnimator(new DefaultItemAnimator());
        recycle_DiaDiem.setAdapter(adapterDiaDiem);
        adapterDiaDiem.notifyDataSetChanged();
    }
    private void initData() {
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));
        lisDiaDiem.add(new DiaDiemDuLich("1", "http://www.halongbayvietnam-cruises.com/halong_bay_private_cruises/image/pr1day.jpg","500","Hạ Long","Giá: 2 triệu"));

        adapterDiaDiem.notifyDataSetChanged();
    }
}
