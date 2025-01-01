package TruongDaiHoc;

public class SinhVien {
    public String hoTen;
    private double diem;
    // phuong thuc (cac ham)
    // phuong thuc khong co kieu tra ve

    public SinhVien() {
        hoTen = "No name";
        diem = 0.0;
    }

    // Alt + ins
    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    // get, set

    public void hienThiThongTin() {
        System.out.println(hoTen + " " + diem);
    }
    // 4.1 constructor mac dinh
    // khoi tao cac gia tri mac dinh
    // ngay khi doi tuong vua duoc tao ra

    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    public double tinhDTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;
    }


    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    // toString

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    //11. support method va service method
    //11.1 support method
    //ktra diem khi nhap ho so cho sinhvien

    private boolean checkDiem(){
        return this.diem >= 24;
    }

    //11.2 service method co the goi tu chuong trinh chinh
    public void checkHopLeDiem() {
        if (checkDiem()) {
            System.out.println("Diem hop le, tiep tuc nhap thong tin");
        }
        else {
            System.out.println("Kiem tra lai diem");
        }
    }

    // parametter list
    public double tongDiem(double ... arr) {
        double tong = 0.0;
        for(double x: arr) {
            tong+=x;
        }
        return tong;
    }
}
