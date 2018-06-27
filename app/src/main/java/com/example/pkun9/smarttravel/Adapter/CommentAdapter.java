package com.example.pkun9.smarttravel.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pkun9.smarttravel.Model.CommentModel;
import com.example.pkun9.smarttravel.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


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
public class CommentAdapter extends BaseAdapter{
    Context context;
    ArrayList<CommentModel> arrayList;


    public CommentAdapter(Context context, ArrayList<CommentModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(this.context);
        convertView = inflater.inflate(R.layout.comment_item, parent, false);

        CircleImageView img = (CircleImageView) convertView.findViewById(R.id.img_dai_dien);
        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtContent= (TextView) convertView.findViewById(R.id.txtContent);
        TextView txtDay = (TextView) convertView.findViewById(R.id.txtDay);
        TextView txtTime = (TextView) convertView.findViewById(R.id.txtTime);
        CommentModel model = arrayList.get(position);
        img.setImageResource(R.drawable.img_comment);
        txtName.setText("Full name");
        txtContent.setText(model.getContent());
        txtDay.setText(model.getDay());
        txtTime.setText(model.getTime());
        return convertView;
    }
}
