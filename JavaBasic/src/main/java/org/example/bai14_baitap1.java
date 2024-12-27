package org.example;

import java.util.Scanner;

public class bai14_baitap1 {
    public static void main(String[] args) {
        /*
        Viết chuong trình nhập vào số n từ bàn phím
        n phải ằm trong khoảng từ 1 đến 99
        Nhap sai bat nhap lai
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen tu 1-99 ");
        int n = sc.nextInt();
        while (n < 1 || n > 99) {
            System.out.println("Nhap lai n, n chi duoc phep tu 1 - 99");
            n = sc.nextInt();
        }
        System.out.println("Ban da nhap xong n = " + n);
    }
}
