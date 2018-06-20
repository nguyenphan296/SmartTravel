package com.example.pkun9.smarttravel;

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
public class DiaDiemDuLich {
    private String id;
    private String image;
    private String khoangCach;
    private String moTa;
    private String giaCa;

    public DiaDiemDuLich() {
    }

    public DiaDiemDuLich(String id, String image, String khoangCach, String moTa, String giaCa) {
        this.id = id;
        this.image = image;
        this.khoangCach = khoangCach;
        this.moTa = moTa;
        this.giaCa = giaCa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(String khoangCach) {
        this.khoangCach = khoangCach;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(String giaCa) {
        this.giaCa = giaCa;
    }
}
