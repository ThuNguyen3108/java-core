package chapter6;

//import TruongDaiHoc.SinhVien;

public class SinhVienIT extends SinhVien {
    private String language;
    public SinhVienIT(String language, String id, String name, double price, double tax) {
        // way 2
        super(id, name, price, tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getMoney() {
        System.out.println("Run get money");
//        super.info();
        // way 1
        this.info();
    }

    @Override
    void tinhDiem() {
        
    }

    public void info() {
        System.out.println("  run inform sinhvienIT");
    }

}
