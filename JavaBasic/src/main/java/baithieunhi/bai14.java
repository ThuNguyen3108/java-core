package baithieunhi;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
    /*
        Cho tuổi của một người (0<tuổi<=150), trả lời:

        “Thieu nhi” nếu 0< tuổi<=11

        “Thieu nien” nếu 11< tuổi <=25

        “Trung nien” nếu 25< tuổi <=50

        “Lao nien” nếu tuổi >50
    * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi: ");
        int t = sc.nextInt();

        // kiem tra dieu kien va xuat ket qua
        if (t > 0 && t <= 11) {
            System.out.println("Thieu nhi");
        } else if (t > 11 && t <= 25) {
            System.out.println("Thieu nien");
        } else if (t > 25 && t <= 50) {
            System.out.println("Trung nien");
        } else {
            System.out.println("Lao nien");
        }

        sc.close();
    }
}
