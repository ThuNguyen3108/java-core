package org.example;

import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao dtb: ");
        double dtb = sc.nextDouble();
        // kiem tra dieu kien
        if (dtb >= 5.0){
            System.out.println("Ban do");
            System.out.println("Chuc mung ban");}
        else
            System.out.println("Ban da tach");
    }
}