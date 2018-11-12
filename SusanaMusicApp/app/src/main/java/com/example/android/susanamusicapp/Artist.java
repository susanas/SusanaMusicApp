package com.example.android.susanamusicapp;

public class Artist {
    private String xName;
    private String xDetail;
    public Artist(String name, String detail){
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