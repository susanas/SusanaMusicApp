package com.example.android.susanamusicapp;

public class Song {
    private String mName;
    private String mDetail;
    public Song (String name, String detail){
        mName = name;
        mDetail = detail;
    }
    public String getName() {
        return mName;
    }
    public String getDetail() {
        return mDetail;
    }
}