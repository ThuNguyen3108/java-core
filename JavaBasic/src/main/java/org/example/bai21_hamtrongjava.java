package org.example;

public class bai21_hamtrongjava {
    public static void main(String[] args) {
        int kq1 = Cong(1, 2, 3);
        int kq2 = Cong(4, 5, 6);
        System.out.println(kq1);
        System.out.println(kq2);
        // goi ham xin chao
        XinChao("male");
        XinChao("femal666e");
    }

    public static int Cong(int x, int y, int z) {
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
        return x + y + z;
    }
    // ham thu tuc
    public static void XinChao(String gioitinh) {
        if (gioitinh.equals("female"))
            System.out.println("Xin chao, toi la nhan vien nu");
        else if (gioitinh.equals("male"))
            System.out.println("Xin chao, toi la nhan vien nam");
        else
            System.out.println("Toi khong hieu ban vua nhap gioi tinh gi");
    }
}
