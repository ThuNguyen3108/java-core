package org.example;

public class bai9_toantulogic {
    public static void main(String[] args) {
       /* int i = 7;
        // kiem tra gia tri i > 0 va i < 10 khong
        System.out.println(i > 0 && i <10);
        // kiem tra xem i > 10 hoac i < -1
        System.out.println(i > 10 || i < -1);
        // phep phu dinh
        System.out.println(!(i > 10) || (i < -1));
        // toan tu tien to hau to
        int x = 100;
        int y = 90;
        int z = 80;
        int t = 70;
        x++;
        ++y;
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);*/

        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
