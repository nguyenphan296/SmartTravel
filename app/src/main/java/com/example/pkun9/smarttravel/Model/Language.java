package com.example.pkun9.smarttravel.Model;

/**
 * @author Quốc Huy
 * @version 1.0.0
 * @description
 * @desc Developer NEO Company.
 * @created 6/27/2018
 * @updated 6/27/2018
 * @modified by
 * @updated on 6/27/2018
 * @since 1.0
 */
public class Language {
    private String sName;
    private String sCode;
    private String sImage;

    public Language(String sName, String sCode, String sImage) {
        this.sName = sName;
        this.sCode = sCode;
        this.sImage = sImage;
    }

    public Language() {
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getsImage() {
        return sImage;
    }

    public void setsImage(String sImage) {
        this.sImage = sImage;
    }
}
