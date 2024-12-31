package org.example;

import TruongDaiHoc.SinhVien;

public class bai30_oop {
    public static void main(String[] args) {
        // khoi tao doi tuong thuoc class sinh vien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv1.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Teo");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Anh Thu", 9.0);
        sv4.hienThiThongTin();
        sv4.hoTen = "obama";
        sv4.hienThiThongTin();
    }
}
