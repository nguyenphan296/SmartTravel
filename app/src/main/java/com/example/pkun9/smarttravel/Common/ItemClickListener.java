package com.example.pkun9.smarttravel.Common;

public interface ItemClickListener<T> {
    void onClickItem(int position, T item);
    void onLongClickItem(int position, T item);
}
