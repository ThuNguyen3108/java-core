package org.example;

public class bai7_baitapvandung {
    public static void main(String[] args) {
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;

        System.out.println("i1 + (i2 * i3) = " + (i1 + (i2 * i3)));
        System.out.println("i1 * (i2 + i3) = " + (i1 * (i2 + i3)));
        System.out.println("i1 / (i2 + i3) = " + ((double) i1 / (i2 + i3))); // Ép kiểu để tránh chia nguyên
        System.out.println("3 + 4 + 5 / 3 = " + (3 + 4 + 5 / 3)); // Kiểm tra thứ tự ưu tiên toán tử
        System.out.println("(3 + 4 + 5) / 3 = " + ((double) (3 + 4 + 5) / 3)); // Ép kiểu để chia chính xác
        System.out.println("d1 + (d2 * d3) = " + (d1 + (d2 * d3)));
        System.out.println("d1 + d2 * d3 = " + (d1 + d2 * d3));
        System.out.println("d1 / d2 - d3 = " + (d1 / d2 - d3));
        System.out.println("d1 / (d2 - d3) = " + (d1 / (d2 - d3)));
        System.out.println("d1 + d2 + d3 / 3 = " + ((d1 + d2 + d3) / 3)); // Sử dụng double mặc định
        System.out.println("(d1 + d2 + d3) / 3 = " + ((d1 + d2 + d3) / 3));
        System.out.println("d1 + d2 + (d3 / 3) = " + (d1 + d2 + (d3 / 3)));
        System.out.println("3 * (d1 + d2) * (d1 - d3) = " + (3 * (d1 + d2) * (d1 - d3)));
    }
}
