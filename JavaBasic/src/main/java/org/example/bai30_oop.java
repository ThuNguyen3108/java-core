package org.example;

import TruongDaiHoc.SinhVien;

public class bai30_oop {
    public static void main(String[] args) {
        // khoi tao doi tuong thuoc class sinh vien
//        SinhVien sv1 = new SinhVien();
//        SinhVien sv2 = new SinhVien();
//        sv1.hienThiThongTin();
//        sv1.hienThiThongTin();
//        SinhVien sv3 = new SinhVien("Teo");
//        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Anh Thu", 9.0);
//        sv4.hienThiThongTin();
//        sv4.hoTen = "obama";
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        // thay doi ho ten
        sv4.setHoTen("Black");
        sv4.hienThiThongTin();

        //9 test phuong thuc co kieu tra ve
        double dtbsv = sv4.tinhDTB(7.5, 7.2);
        System.out.println(dtbsv);

        // test phuong thuc toString, ho tro xuat truc tiep doi tuong do ra
        System.out.println(sv4);

    }
}
