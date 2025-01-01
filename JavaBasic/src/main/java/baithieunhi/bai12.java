package baithieunhi;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // lay 2 chua so dau
        int firstTwoDigits = n / 10;
        // lay 2 chua so cuoi
        int lastTwoDigits = n % 100;

        System.out.printf("%02d %02d", firstTwoDigits, lastTwoDigits);
    }
}
