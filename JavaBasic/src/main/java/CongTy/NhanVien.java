package CongTy;

public class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;

    protected double luongCoban = 850; //850$

    // constructor alt ins

    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

    public double tinhLuong() {
        return luongCoban;
    }
}
