package org.example;

public class bai6_epkieudulieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a/b; // int -> double
        System.out.println(kq);

        // ep kieu hep
        int c = 128;
        byte d = (byte) c;
        System.out.println(d);

        int e = 15;
        byte f = (byte) e;
        System.out.println(f); // ep tu kieu int >> byte
    }
}
