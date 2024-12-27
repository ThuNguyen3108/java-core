package org.example;

public class bai21_giaiptbac2 {
    public static void main(String[] args) {
        // Ví dụ kiểm tra
        System.out.println(GiaiPTB2(1, -3, 2)); // Phương trình x^2 - 3x + 2 = 0
        System.out.println(GiaiPTB2(1, 2, 1)); // Phương trình x^2 + 2x + 1 = 0
        System.out.println(GiaiPTB2(0, 4, -8)); // Phương trình bậc nhất 4x - 8 = 0
        System.out.println(GiaiPTB2(0, 0, 0)); // Phương trình vô số nghiệm
        System.out.println(GiaiPTB2(1, 0, 1)); // Phương trình x^2 + 1 = 0 (vô nghiệm)
    }

    // Hàm giải phương trình bậc hai
    public static String GiaiPTB2(double a, double b, double c) {
        // Nếu a = 0 thì phương trình trở thành phương trình bậc nhất
        if (a == 0) {
            if (b == 0 && c == 0)
                return "Phương trình bậc nhất vô số nghiệm";
            else if (b == 0)
                return "Phương trình bậc nhất vô nghiệm";
            else
                return "Phương trình bậc nhất có nghiệm: x = " + (-c / b);
        } else {
            // Giải phương trình bậc hai
            double delta = (b * b) - (4 * a * c);
            if (delta < 0)
                return "Phương trình bậc hai vô nghiệm";
            else if (delta == 0) {
                double x = -b / (2 * a);
                return "Phương trình bậc hai có nghiệm kép: x = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Phương trình bậc hai có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
            }
        }
    }
}
