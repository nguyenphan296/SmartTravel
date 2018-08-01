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

import com.example.pkun9.smarttravel.Adapter.AdapterLanguage;
import com.example.pkun9.smarttravel.Common.ItemClickListener;
import com.example.pkun9.smarttravel.Model.Language;
import com.example.pkun9.smarttravel.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentLanguage extends Fragment {
   // @BindView(R.id.recycle_language)
    RecyclerView recycle_language;
    AdapterLanguage adapterLanguage;
    private List<Language> lisLanguage;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_language, container, false);
        recycle_language = view.findViewById(R.id.recycle_language);
        init();
        initData();
        return view;

    }
    private void init() {
        lisLanguage =new ArrayList<>();
        adapterLanguage = new AdapterLanguage(getContext(), lisLanguage);
        mLayoutManager = new GridLayoutManager(getContext(), 1);
        recycle_language.setHasFixedSize(true);
        recycle_language.setLayoutManager(mLayoutManager);
        recycle_language.setItemAnimator(new DefaultItemAnimator());
        recycle_language.setAdapter(adapterLanguage);
        adapterLanguage.notifyDataSetChanged();

        adapterLanguage.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClickItem(int position, Object item) {
                Language language = (Language) item;
                Toast.makeText(getContext(), ""+language.getsName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClickItem(int position, Object item) {
                Language language = (Language) item;
                Toast.makeText(getContext(), ""+language.getsName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initData() {
        lisLanguage.add(new Language("Việt Nam", "abc",
                "https://upload.wikimedia.org/wikipedia/commons/thssumb/2/21/Flag_of_Vietnam.svg/2000px-Flag_of_Vietnam.svg.png"));
        lisLanguage.add(new Language("English", "abc",
                "https://myopera.sylvietruong.com/images/2009/05/07/uk-flag.jpg"));
        lisLanguage.add(new Language("Nhật bản", "abc",
                "https://images-na.ssl-images-amazon.com/images/I/31XDaI1437L._SX425_.jpg"));
        lisLanguage.add(new Language("Hàn Quốc", "abc",
                "https://cdn.pixabay.com/photo/2012/04/24/17/41/south-korea-40604_960_720.png"));
        adapterLanguage.notifyDataSetChanged();
    }
}
