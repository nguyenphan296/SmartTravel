package com.example.pkun9.smarttravel.Model;

/**
<<<<<<< HEAD
 * @author Quốc Huy
 * @version 1.0.0
 * @description
 * @desc Developer NEO Company.
 * @created 7/2/2018
 * @updated 7/2/2018
 * @modified by
 * @updated on 7/2/2018
 * @since 1.0
 */
public class Taxi {
    private String Ten;
    private String Gia;
    private String Anh;

    public Taxi(String ten, String gia, String anh) {
        Ten = ten;
        Gia = gia;
        Anh = anh;
    }

    public Taxi() {
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String anh) {
        Anh = anh;
=======
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
public class Taxi {
    private  String ten;
    private String gia;
    private String anh;

    public Taxi() {
    }

    public Taxi(String ten, String gia, String anh) {
        this.ten = ten;
        this.gia = gia;
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
>>>>>>> origin/master
    }
}
