package org.example;

import java.util.Scanner;

public class bai10_scanner {
    public static void main(String[] args) {
/*        // khoi tao 1 doi tuong scanner
        Scanner sc = new Scanner(System.in);

        // cho phep nhap chuoi
        System.out.println("Moi nhap vao mat khau cap 1");
        String mk1 = sc.nextLine();
        System.out.println("mk cap 1 la: " + mk1);

        // nhap so nguyen
        System.out.println("Moi nhap vao 1 so nguyen a: ");
        int a = sc.nextInt();
        System.out.println("a = " + a);

        // nhap so float
        System.out.println("Moi nhap vao 1 so thuc x: ");
        float x = sc.nextFloat();
        System.out.println("x = " + x);

        // nhap chuoi
        System.out.println("Moi nhap vao mk cap 2: ");
        String mk2 = sc.nextLine();
        System.out.println("mk cap 2 la: " + mk2);*/

        // nhap chuoi
        System.out.println("Moi nhap ten: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("ten la: " + ten);

        // nhap gioi tinh
        System.out.println("Moi nhap gioi tinh: ");
        String gt = new Scanner(System.in).nextLine();
        System.out.println("ten la: " + gt);

        // nhap float
        System.out.println("Moi nhap vao chieu cao: ");
        Float cao = new Scanner(System.in).nextFloat();
        System.out.println("ten la: " + cao);
    }
}
