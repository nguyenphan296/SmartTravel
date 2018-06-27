package com.example.pkun9.smarttravel.Model;

/**
 * @author Phạm Công Thành
 * @version 1.0.0
 * @description
 * @created ${Date}
 * @updated ${Date}
 * @modified by
 * @updated on ${Date}
 * @since 1.0
 */
public class Hotel {
    private String sName;
    private String sImage;
    private String sPrice;

    public Hotel() {
    }

    public Hotel(String sName, String sImage, String sPrice) {
        this.sName = sName;
        this.sImage = sImage;
        this.sPrice = sPrice;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsImage() {
        return sImage;
    }

    public void setsImage(String sImage) {
        this.sImage = sImage;
    }

    public String getsPrice() {
        return sPrice;
    }

    public void setsPrice(String sPrice) {
        this.sPrice = sPrice;
    }
}
