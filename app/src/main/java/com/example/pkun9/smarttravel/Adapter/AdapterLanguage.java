package com.example.pkun9.smarttravel.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.pkun9.smarttravel.Common.ItemClickListener;
import com.example.pkun9.smarttravel.Model.Language;
import com.example.pkun9.smarttravel.R;

import java.util.List;


public class AdapterLanguage extends RecyclerView.Adapter<AdapterLanguage.LanguageViewHoder> {
    private Context mContext;
    private List<Language> lisLanguage;
    private ItemClickListener itemClickListener;

    public AdapterLanguage(Context mContext, List<Language> lisLanguage) {
        this.mContext = mContext;
        this.lisLanguage = lisLanguage;
    }

    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public LanguageViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_language, parent, false);
        return new LanguageViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHoder holder, int position) {
        Language language = lisLanguage.get(position);
        holder.txt_name_language.setText(language.getsName());
        Glide.with(mContext)
                .load(language.getsImage())
                .into(holder.img_flag);

        // holder.cb_language.setChecked(language.isChecked());

    }

    @Override
    public int getItemCount() {
        return lisLanguage.size();
    }

    public class LanguageViewHoder extends
            RecyclerView.ViewHolder implements
            View.OnClickListener, View.OnLongClickListener {
        TextView txt_name_language;
        CheckBox cb_language;
        ImageView img_flag;

        public LanguageViewHoder(View itemView) {
            super(itemView);
            txt_name_language = itemView.findViewById(R.id.txt_name_language);
            img_flag = itemView.findViewById(R.id.img_flag);
            cb_language = itemView.findViewById(R.id.cb_language);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClickItem(getLayoutPosition(), lisLanguage.get(getLayoutPosition()));
        }

        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onLongClickItem(getLayoutPosition(), lisLanguage.get(getLayoutPosition()));
            return true;
        }
    }

    public void update_list(List<Language> list) {
        lisLanguage.clear();
        lisLanguage.addAll(list);
        notifyDataSetChanged();
    }
}
