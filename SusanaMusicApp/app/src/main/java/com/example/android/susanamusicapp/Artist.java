package com.example.android.susanamusicapp;

public class Artist {
    private String mName;
    private String mDetail;
    public Artist(String name, String detail){
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