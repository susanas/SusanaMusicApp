package com.example.android.susanamusicapp;

public class Song {
    private String xName;
    private String xDetail;
    public Song (String name, String detail){
        xName = name;
        xDetail = detail;
    }
    public String getName() {
        return xName;
    }
    public String getDetail() {
        return xDetail;
    }
}