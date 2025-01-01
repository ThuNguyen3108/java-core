package baithieunhi;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        /*
        * Viết chương trình tính bán kính R của đường tròn ngoại tiếp tam giác có ba cạnh a,b,c
        * là các số nguyên theo công thức R=Image, với S là diện tích tam giác
        * (3 số a, b, c bảo đảm là 3 cạnh của 1 tam giác).*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Kiem tra tinh hop le cua tam giac
        if (a + b > c && a + c > b && b + c > a) {
            // Tinh nua chu vi
            double p = (a + b + c) / 2.0;

            // tinh dien tich tam giac S theo cong thuc Heron
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            double r = (a * b * c) / (4 * s);
            System.out.printf("%.3f", r);
        }
        else {
            System.out.println("3 canh khong tao thanh tam giac");
        }

    }
}
