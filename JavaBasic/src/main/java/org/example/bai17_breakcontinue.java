package org.example;

public class bai17_breakcontinue {
    public static void main(String[] args) {
        // tinh tong tu 1 - 5 nhung bo qua so 3
        int tong = 0;
        for (int i = 0; i <= 5; i ++) {
            if (i == 3)
                continue; // bo qua
            else
                tong += i;
        }
        System.out.println("tong = " + tong);
    }
}
