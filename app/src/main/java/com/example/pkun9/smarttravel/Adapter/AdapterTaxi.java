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
import com.example.pkun9.smarttravel.Model.Taxi;
import com.example.pkun9.smarttravel.R;

import java.util.List;

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
public class AdapterTaxi extends RecyclerView.Adapter<AdapterTaxi.TaxiViewHolder> {
    private Context context;
    private List<Taxi> taxiList;

    public AdapterTaxi(Context context, List<Taxi> taxiList) {
        this.context = context;
        this.taxiList = taxiList;
    }

    @NonNull
    @Override
    public TaxiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_taxi, parent, false );
        return new TaxiViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull TaxiViewHolder holder, int position) {
        Taxi taxi = taxiList.get( position );
        holder.txtTenTaxi.setText( taxi.getTen() );
        holder.txtGiaTaxi.setText( taxi.getGia() );
        Glide.with( context ).load( taxi.getAnh() ).into( holder.imgAnhTaxi );

    }

    @Override
    public int getItemCount() {
        return taxiList.size();
    }

    public class TaxiViewHolder extends RecyclerView.ViewHolder {
        TextView txtTenTaxi;
        TextView txtGiaTaxi;
        ImageView imgAnhTaxi;

        public TaxiViewHolder(View itemView) {
            super( itemView );
            txtTenTaxi = (TextView) itemView.findViewById( R.id.txt_taxi_ten );
            txtGiaTaxi = (TextView) itemView.findViewById( R.id.txt_taxi_gia );
            imgAnhTaxi = (ImageView) itemView.findViewById( R.id.imghinh );
        }
    }
}
