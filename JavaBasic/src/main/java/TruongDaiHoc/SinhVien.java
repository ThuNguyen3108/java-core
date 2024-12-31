package TruongDaiHoc;

public class SinhVien {
    public String hoTen;
    private double diem;
    // phuong thuc (cac ham)
    // phuong thuc khong co kieu tra ve
    public void hienThiThongTin() {
        System.out.println(hoTen + " " + diem);
    }
    // 4.1 constructor mac dinh
    // khoi tao cac gia tri mac dinh
    // ngay khi doi tuong vua duoc tao ra

    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

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
}
