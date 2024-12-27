package org.example;

import java.util.Scanner;

public class bai11_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao dtb: ");
        double dtb = sc.nextDouble();
        // kiem tra dieu kien
        if (dtb >= 8 && dtb < 10) {
            System.out.println("Ban xep loai gioi");
        } else if (dtb >= 7 && dtb < 8) {
            System.out.println("Ban xep loai kha");
        } else {
            System.out.println("Ban da tb");
        }
    }
}
