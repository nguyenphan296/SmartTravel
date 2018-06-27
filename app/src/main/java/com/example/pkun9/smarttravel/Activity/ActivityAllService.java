package com.example.pkun9.smarttravel.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.pkun9.smarttravel.Fragment.FragmentDiaDiem;
import com.example.pkun9.smarttravel.Fragment.FragmentHotel;
import com.example.pkun9.smarttravel.Fragment.FragmentLanguage;
import com.example.pkun9.smarttravel.R;

/**
 * @author Quốc Huy
 * @version 1.0.0
 * @description
 * @desc Developer NEO Company.
 * @created 6/27/2018
 * @updated 6/27/2018
 * @modified by
 * @updated on 6/27/2018
 * @since 1.0
 */
public class ActivityAllService extends AppCompatActivity {
    //TextView txt_language;
    TextView txt_restaurant;
    TextView txt_hotel;
    TextView txt_language,txt_DiaDiem;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_service);
        init();
        initEvent();

    }

    private void initEvent() {
        txt_language.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                Fragment fragment = new FragmentLanguage();
                add_fragment(fragment);
             //   txt_language.setBackgroundColor(Color.RED);
                txt_language.setBackgroundResource(R.color.blue);
            }
        });
        txt_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FragmentHotel();
                add_fragment(fragment);
                txt_hotel.setBackgroundResource(R.color.blue);
            }
        });
        txt_restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FragmentHotel();
                add_fragment(fragment);
                txt_restaurant.setBackgroundResource(R.color.blue);
            }
        });
        txt_DiaDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FragmentDiaDiem();
                add_fragment(fragment);
                txt_DiaDiem.setBackgroundResource(R.color.blue);
            }
        });
    }

    private void add_fragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_all_service, fragment);
        fragmentTransaction.commit();
    }

    private void init() {
        txt_language = findViewById(R.id.txt_language);
        txt_hotel = findViewById(R.id.txt_hotel);
        txt_restaurant=findViewById(R.id.txt_restaurant);
        txt_DiaDiem = findViewById(R.id.txtDiaDiem);
    }
}
