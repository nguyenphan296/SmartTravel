package com.example.pkun9.smarttravel;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextClock;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CommentActivity extends Activity {
    ListView listView;
    EditText edComment;
    Button btnComment;
    ArrayList<CommentModel> arrList;
    CommentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        listView = findViewById(R.id.listview);
        btnComment = findViewById(R.id.btn_send);
        edComment = findViewById(R.id.ed_comment);
        arrList = new ArrayList<CommentModel>();
        adapter = new CommentAdapter(this, arrList);
        listView.setAdapter(adapter);

    }

    public void clickSend(View view) {
        //Lấy dữ liệu nhập từ editext
        String msg = edComment.getText().toString();
        Date date = new Date();
        String strDateFormat = "dd/MM/yyyy";

        //Tạo đối tượng SimpleDateFormat để định dạng ngày;
        SimpleDateFormat day = new SimpleDateFormat(strDateFormat);

        String strDateFormat24 = "HH:mm:ss a";

        //Tạo đối tượng SimpleDateFormat với định dạng 24h
        SimpleDateFormat time = new SimpleDateFormat(strDateFormat24);

        CommentModel model = new CommentModel();
        model.setContent(msg);
        //gọi hàm format để lấy chuỗi ngày tháng năm
        model.setDay(day.format(date));
        //gọi hàm format để lấy giờ phút giây
        model.setTime(time.format(date));
        arrList.add(model);
        adapter.notifyDataSetChanged();
        edComment.setText("");
    }
}
