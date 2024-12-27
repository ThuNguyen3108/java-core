package org.example;

import java.util.Scanner;

public class bai11_BMI {
    /*
    Bài tập Java 05: Viết chương trình nhập vào chiều cao, cân nặng, tính BMI và xuất ra thông báo
    BMI < 15: Thân hình quá gầy
    BMI >= 15 and BMI < 16: Thân hình gầy
    BMI >= 16 and BMI < 18.5: Thân hình hơi gầy
    BMI >= 18.5 and BMI < 25: Thân hình bình thường
    BMI >= 25 and BMI < 30: Thân hình hơi béo
    BMI >= 30 and BMI < 35: Thân hình béo
    BMI >= 35: Thân hình quá béo
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap can nang va chieu cao
        System.out.println("Nhap can nang (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Nhap chieu cao: ");
        double height = scanner.nextDouble();

        // Tinh BMI
        double bmi = weight / (height * height);

        // Xuat thong bao dua tren gia tri BMI
        System.out.println();

    }
}
