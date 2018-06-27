package com.example.pkun9.smarttravel;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.pkun9.smarttravel.Adapter.DiaDiemDuLichAdapter;

import java.util.ArrayList;


public class ManHinhHienThiDiaDiemDuLich extends AppCompatActivity {

    RecyclerView recyclerView;
    DiaDiemDuLichAdapter adapter;
    ArrayList<DiaDiemDuLich> dsDiemDuLich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_hien_thi_dia_diem_du_lich);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        dsDiemDuLich = new ArrayList<>();
        adapter = new DiaDiemDuLichAdapter(this,dsDiemDuLich);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        initData();
    }

    private void initData() {
     dsDiemDuLich.add(new DiaDiemDuLich());

    }
}
