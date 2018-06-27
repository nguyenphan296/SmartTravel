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
import com.example.pkun9.smarttravel.DiaDiemDuLich;
import com.example.pkun9.smarttravel.Model.Language;
import com.example.pkun9.smarttravel.R;

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
public class DiaDiemDuLichAdapter extends
        RecyclerView.Adapter<DiaDiemDuLichAdapter.DiemDuLichViewHolderr>{
    private Context mContext;
    private List<DiaDiemDuLich> listDiaDiemDuLich;
    private ItemClickListener itemClickListener;

    public DiaDiemDuLichAdapter(Context mContext, List<DiaDiemDuLich> albumList) {
        this.mContext = mContext;
        this.listDiaDiemDuLich = albumList;
    }
    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }
    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public DiemDuLichViewHolderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.manhinh_hienthi_dulich_cardview,parent,false);
        return  new DiemDuLichViewHolderr(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DiemDuLichViewHolderr holder, int position) {
        DiaDiemDuLich diaDiemDuLich = listDiaDiemDuLich.get(position);
        holder.txtGia.setText(diaDiemDuLich.getGiaCa());
        holder.txtDiaDiem.setText(diaDiemDuLich.getMoTa());
        Glide.with(mContext).load(diaDiemDuLich.getImage()).into(holder.imgDiemDuLich);

    }

    @Override
    public int getItemCount() {
        return listDiaDiemDuLich.size();
    }

    class DiemDuLichViewHolderr extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        ImageView imgDiemDuLich,imgBaCham;
        TextView txtDiaDiem, txtGia;

     public DiemDuLichViewHolderr(View itemView) {
         super(itemView);
         imgDiemDuLich = (ImageView) itemView.findViewById(R.id.imgĐiemuLich);
         imgBaCham = (ImageView) itemView.findViewById(R.id.imgBaCham);
         txtDiaDiem = (TextView) itemView.findViewById(R.id.txtDiaDiem);
         txtGia = (TextView) itemView.findViewById(R.id.txtGia);
     }

        @Override
        public void onClick(View v) {

        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }
        public void update_list(List<DiaDiemDuLich> list) {
            listDiaDiemDuLich.clear();
            listDiaDiemDuLich.addAll(list);
            notifyDataSetChanged();
        }
    }
}
