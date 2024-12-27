package org.example;

import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen n: ");
        int n = sc.nextInt();
        String traloi = (n%2 == 0) ? "Chan" : "Le";
        System.out.println(traloi);*/
        /* Bài tập
        Viết chương trình nhập vào đểm trung bình và kết quả
        xếp loại của học sinh
        Giỏi Nếu điểm >= 8
        Khá Nếu 8 > Điểm >= 6.5
        Trung bình Nếu 6.5 > Điểm >= 5
        Yếu Nếu điểm < 5

        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao dtb: ");
        double dtb = sc.nextDouble();
        // xu ly lenh de tinh toan
        String traloi = (dtb >= 8) ? "Giỏi" :
                (dtb < 8 && dtb >= 6.5) ? "Khá" :
                        (dtb < 6.5 && dtb >= 5) ? "Trung bình" : "Yếu";
        System.out.println(traloi);
    }
}
