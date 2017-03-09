package com.example.vietanh.contact_lv.model;

/**
 * Created by Lenovo G480-16 on 2/27/2017.
 */

public class PhoneNumber {
    private String mName;
    private String mNumber;
    private int mColor;

    public PhoneNumber(String mName, String mNumber, int mColor) {
        this.mName = mName;
        this.mNumber = mNumber;
        this.mColor = mColor;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }
}
