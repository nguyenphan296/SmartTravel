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

import com.example.pkun9.smarttravel.Adapter.AdapterLanguage;
import com.example.pkun9.smarttravel.Adapter.AdapterTaxi;
import com.example.pkun9.smarttravel.Model.Taxi;
import com.example.pkun9.smarttravel.R;

import java.util.ArrayList;

/**
 * @author Nguyễn Anh Phan
 * @version 1.0.0
 * @description
 * @desc
 * @created ${Date}
 * @updated ${Date}
 * @modified by
 * @updated on ${Date}
 * @since 1.0
 */
public class FragmentTaxi extends Fragment {
    RecyclerView recyclerview_taxi;
    AdapterTaxi adapterTaxi;
    private ArrayList<Taxi> taxiArrayList;
    RecyclerView.LayoutManager layoutManagerTaxi;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_language, container, false );
        recyclerview_taxi = view.findViewById( R.id.recycle_language );
        init();
        initData();
        return view;
    }

    private void init() {
        taxiArrayList = new ArrayList<>();
        adapterTaxi = new AdapterTaxi( getContext(), taxiArrayList );
        layoutManagerTaxi = new GridLayoutManager( getContext(), 2 );
        recyclerview_taxi.setHasFixedSize( true );
        recyclerview_taxi.setLayoutManager( layoutManagerTaxi );
        recyclerview_taxi.setAdapter( adapterTaxi );

    }

    private void initData() {
        taxiArrayList.add( new Taxi( "Taxi Vina Group", "10.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrbnQgm92KqWvKASWW2wPRx9O-mp4YGZEo8FPK0QXawubhX1ArAA" ) );
        taxiArrayList.add( new Taxi( "Taxi Thủ đô", "11.000","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQh6Dp6-580CtNWE8bY0zdibRhH2igyDJiNaG22QxWDNKbsnsDTLA") );
        taxiArrayList.add( new Taxi( "Taxi Group", "12.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwnS3CbtrrMlCe2ot3neIviASlcBAB9BOUUPEUjORS93IYzy7D" ) );
        taxiArrayList.add( new Taxi( "Taxi Quê Lụa ", "13.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHUmCe0fyVZkcCfkTivi2oWNsP64BM427_9Kn9ICa87SaGVntE") );
        taxiArrayList.add( new Taxi( "Taxi Trường Sơn", "8.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrg7vg0SkqjheMKglz3PsXZxbbO4V0pzmpjm7Twrk1SnxjmauJ" ) );
        taxiArrayList.add( new Taxi( "Taxi ABC", "9.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYZG30vPHl6CL0lpKLzjOdDo6CYEdluA0t6MdYfuEiTBxtj-nD" ) );
        taxiArrayList.add( new Taxi( "Taxi Ba Sao ", "9.500", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEuc2OS5r56WrRvAyUu66kniStRMYpH7cy7RqXq892qo49ZocQ" ) );
        taxiArrayList.add( new Taxi( "Taxi Mai Linh", "10.5000", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkFGymol7NAl5zdIBuwoFAtYzwT7PeKkhBV3TKN78UtNj9PhTk" ) );
        taxiArrayList.add( new Taxi( "Taxi Grab", "10.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkFGymol7NAl5zdIBuwoFAtYzwT7PeKkhBV3TKN78UtNj9PhTk" ) );


    }
}
