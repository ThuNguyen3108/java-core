package org.example;

import java.util.Scanner;

public class bai21_java19 {

    // ham cong
    public static void cong(double a, double b) {
        double kq = a + b;
        System.out.println("kq = " + kq);
    }

    // ham tru
    public static void tru(double a, double b) {
        double kq = a - b;
        System.out.println("kq = " + kq);
    }

    // ham nhan
    public static void nhan(double a, double b) {
        double kq = a * b;
        System.out.println("kq = " + kq);
    }

    // ham chia
    public static void chia(double a, double b) {
        if (b == 0) {
            System.out.println("0 lam sao chia");
        }
        else {
            double kq = a / b;
            System.out.println("kq = " + kq);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao a: ");
        double a = sc.nextDouble();
        System.out.println("Moi nhap vao b: ");
        double b = sc.nextDouble();
        // cho nguoi dung nhap chon phep tinh
        System.out.println("Moi chon phep tinh: + - * /");
        // khai bao doi tuong scanner rieng cho doc chuoi
        Scanner scString = new Scanner(System.in);
        String phepTinh = scString.nextLine();
        switch (phepTinh) {
            case "+":
                cong(a, b);
                break;
            case "-":
                tru(a, b);
                break;
            case "*":
                nhan(a, b);
            case "/":
                chia(a, b);
            default:
                System.out.println("Phim bam o hop le");
                break;
        }
    }
}
