package chapter6;

//import TruongDaiHoc.SinhVien;

public class SinhVienIT extends SinhVien {
    private String language;

    public void getMoney() {
        System.out.println("Run get money");
//        super.info();
        this.info();
    }

    public void info() {
        System.out.println("  run inform sinhvienIT");
    }

}
