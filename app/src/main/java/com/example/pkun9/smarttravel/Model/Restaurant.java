package com.example.pkun9.smarttravel.Model;

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
public class Restaurant {
    int sImgRes;
    String sRestaurant;
    String sDiaChi;
    String sSDT;
    String sGia;

    public Restaurant(int sImgRes, String sRestaurant, String sDiaChi, String sSDT, String sGia) {
        this.sImgRes = sImgRes;
        this.sRestaurant = sRestaurant;
        this.sDiaChi = sDiaChi;
        this.sSDT = sSDT;
        this.sGia = sGia;
    }

    public int getsImgRes() {
        return sImgRes;
    }

    public void setsImgRes(int sImgRes) {
        this.sImgRes = sImgRes;
    }

    public String getsRestaurant() {
        return sRestaurant;
    }

    public void setsRestaurant(String sRestaurant) {
        this.sRestaurant = sRestaurant;
    }

    public String getsDiaChi() {
        return sDiaChi;
    }

    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }

    public String getsSDT() {
        return sSDT;
    }

    public void setsSDT(String sSDT) {
        this.sSDT = sSDT;
    }

    public String getsGia() {
        return sGia;
    }

    public void setsGia(String sGia) {
        this.sGia = sGia;
    }
}
