package org.example.entity;

public class SinhVien {
    private String id;
    private String ten;
    private int tuoi;
    private float diem;
    private int kyHoc;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String id, String ten, int tuoi, float diem, int kyHoc, String chuyenNganh) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
        this.kyHoc = kyHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
