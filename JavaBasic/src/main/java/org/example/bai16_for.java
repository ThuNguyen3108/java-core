package org.example;

public class bai16_for {
    public static void main(String[] args) {
        for(int i = 0; i < 12; i += 2) {
            System.out.println("i = " + i);
        }
        // tinh tong cac so chan tu 0-10
        int tong = 0;
        for (int i = 0; i <= 10; i ++) {
            tong+=i;
        }
        System.out.println("tong = " + tong);
    }
}