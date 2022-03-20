package com.example.listview2;

import java.io.Serializable;

public class Goods implements Serializable {
    private int imgHinh;
    private String Ten;
    private String chuThich;
    private String gia;

    public Goods(int imgHinh, String ten, String chuThich, String gia) {
        this.imgHinh = imgHinh;
        Ten = ten;
        this.chuThich = chuThich;
        this.gia = gia;
    }

    public int getImgHinh() {
        return imgHinh;
    }

    public void setImgHinh(int imgHinh) {
        this.imgHinh = imgHinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getChuThich() {
        return chuThich;
    }

    public void setChuThich(String chuThich) {
        this.chuThich = chuThich;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
