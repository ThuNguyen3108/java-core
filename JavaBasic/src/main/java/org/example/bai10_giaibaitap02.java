package org.example;

import java.util.Scanner;

public class bai10_giaibaitap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao ban kinh duong tron r: ");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r, 2);
        System.out.println(cv);
        System.out.println(dt);
    }
}
