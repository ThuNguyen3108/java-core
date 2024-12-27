package org.example;

public class bai8_toantugan {
    /*
    phép tính = (gán bằng) x = 1
    += (gán cộng) x += y
    -= (gán trừ) x -= y
    *= (gán nhân) x *= y
    /= (gán chia) x /= y
    %= gán chia lấy phần dư x %= y
    * */
    public static void main(String[] args) {
        // gan cong
        int x = 8;
        x += 5; // x = x + 5
        System.out.println("x = " + x);

        // gan tru
        int x2 = 8;
        x2-=5; // x2 = x2 - 5
        System.out.println("x2 = " + x2);

        // gan nhan
        int x3 = 8;
        x3*=5; // x3=x3*5;
        System.out.println("x3 = " + x3);

        // so sanh
        int a = 7;
        int b = 9;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);

    }
}
