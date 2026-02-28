package org.example.entity;

public class SinhVienService {
    protected  SinhVien sinhVien=new SinhVien(
            "sv1",
            "Nguyen Van A",
            19,
            5.5F,
            3,
            "CNTT"

    );

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }
    public void updatesv(SinhVien newsinhVien) {
        if(newsinhVien==null){
            throw new IllegalArgumentException("newsinhVien  k đc null");
        }
        if(newsinhVien.getId()==null || newsinhVien.getId().isEmpty()){
            throw new IllegalArgumentException("mã sv k dc dẻ trống");
        }
        if(newsinhVien.getTen()==null || newsinhVien.getTen().isEmpty()){
            throw new IllegalArgumentException("tên sv k dc dẻ trống");
        }
        if(newsinhVien.getTuoi()<0 ){
            throw new IllegalArgumentException("tuoir  sv k dc âm");
        }
        if(newsinhVien.getKyHoc()<0 ){
            throw new IllegalArgumentException("ky hoc sv k dc âm");
        }
        if(newsinhVien.getChuyenNganh()==null || newsinhVien.getChuyenNganh().isEmpty()){
            throw new IllegalArgumentException("chuyen nganh sv k dc dẻ trống");
        }
        if (newsinhVien.getDiem()<0 || newsinhVien.getDiem()>10) {
            throw new IllegalArgumentException("diem sv phải tư 0 đến 10");
        }
        sinhVien.setId(newsinhVien.getId());
        sinhVien.setTen(newsinhVien.getTen());
        sinhVien.setKyHoc(newsinhVien.getKyHoc());
        sinhVien.setDiem(newsinhVien.getDiem());
        sinhVien.setChuyenNganh(newsinhVien.getChuyenNganh());
        sinhVien.setTuoi(newsinhVien.getTuoi());
    }
}
