package baithieunhi;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int HS = sc.nextInt();

        int soTaoMoiHocSinh = T / HS;
        int soTaoConDu = T % HS;

        System.out.println(soTaoMoiHocSinh + " " + soTaoConDu);
    }
}
