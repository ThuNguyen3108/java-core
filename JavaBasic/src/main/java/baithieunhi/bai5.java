package baithieunhi;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc 3 số nguyên cách nhau bởi dấu cách
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Tính trung bình cộng
        double tbc = (a + b + c) / 3.0;

        // In kết quả làm tròn đến 1 chữ số thập phân
        System.out.printf("%.1f%n", tbc);

        sc.close();

    }
}
