package org.example;

import java.util.Scanner;

public class bai11_tonghieu {
    public static void main(String[] args) {
        /*
        bài tập java 04: Tìm x, y khi biết tổng và hiệu của chúng
        case test: Tong = 14, hieu = 4 => x = 9, y = 5
        case 2: Tong = 8 hieu = 5 => x = 6.5, y = 1.5
        Gợi ý: x + y = 14
        x - y = 4
        * */
        Scanner scanner = new Scanner(System.in);

        // Nhap tong va hieu
        System.out.println("Nhap tong: ");
        double tong = scanner.nextDouble();
        System.out.println("Nhap hieu: ");
        double hieu = scanner.nextDouble();

        // Tinh x va y
        double x = (tong + hieu) / 2;
        double y = (tong - hieu) / 2;

        // In ket qua
        System.out.println("Ket qua: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
