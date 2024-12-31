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
}
