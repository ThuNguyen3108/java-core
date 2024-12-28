package org.example;

import java.util.Scanner;

public class bai26_charjava {
    public static void main(String[] args) {
        // Khai bao
        char ch = 'a';
        char ch2 = 66;
        System.out.println(ch2);
        char ch3; // khai bao
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi nhap vao 1 ky tu: ");
//        String s = sc.nextLine();
//        char ch4 = s.charAt(0);
//        System.out.println("ky tu vua nhap: " + ch4);
        // so sanh
        System.out.println(Character.compare('b', 'b'));
        System.out.println(Character.compare('a', 'b'));
        System.out.println(Character.compare('A', 'a'));

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));

        // buoi 2
        // indexOf: Kiem tra vi tri xuat hien dau tien cua ky tu hoac chuoi
        // tra ve -1 neu khong tim thay
        String s7 = " toi di tim toi";
        System.out.println(s7.indexOf("toi"));
        System.out.println(s7.lastIndexOf("toi"));

        // contains: Kiem tra chuoi con
        String s9 = ".mp3";
        String s10 = "tuhoc.mp4";
        // kiem tra s10 co chua cum string cua s9 khong
        boolean check = s10.contains(s9);
        if (check)
            System.out.println("Co .mp3 trong chuoi");
        else
            System.out.println("Khong tim thay .mp3 trong chuoi");

        //7.8 Substring: Trich loc chuoi con tu chuoi ban dau
        //substring(int beginIndex)
        String s11 = "anhthu123";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);

        //7.9 replace ("tr old", "str new")
        String s14 = "Toi di tim toi";
        String s15 = s14.replace("Toi", "ban");
        System.out.println(s14);
        System.out.println(s15);

        //7.10 replaceFirst("str old", "str new")
        String s16 = s14.replaceFirst("Toi", "Ban");
        System.out.println(s14);
        System.out.println(s16);

        // 7.11 trim(): Xoa toan bo khoang trang o dau va cuoi
//        String s18 = "               Ga lai lap trinh               ";
//        String s19 = s18.trim();
//        System.out.println(s18);
//        System.out.println(s19);

        //7.12 trim(): Xoa toan bo khoang trang o cuoi
        // cach 1: bieu thuc chinh quy (regular expression)
        // dung \s+$ de xoa tat ca cac khoang trang o cuoi chuoi
//        String s20 = s18.replaceAll("\\s+$","");
//        System.out.println(s18);
//        System.out.println(s20);

        // cach 2: Xoa khoang trang cuoi chuoi bang vong lap
        String s21 = "               Ga lai lap trinh               ";
        while (s21.endsWith(" ")) {
            s21 = s21.substring(0, s21.length() - 1);
        }
        System.out.println(s21);

        // 7.13 trim() Xoa toan bo khoang trang o dau
        // cach 1: bieu thuc chinh quy (regular expression)
        // dung ^\\s+ de xoa tat ca cac khoang trang o dau chuoi
        String s23 = "                      Ga lai lap trinh     ";
        String s24 = s23.replaceFirst("^\\s+", "");
        System.out.println(s23);
        System.out.println(s24);
    }
}
