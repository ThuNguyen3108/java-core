package org.example;

import java.util.Scanner;

public class bai13_1giaibt11 {
    public static void main(String[] args) {
        /*
        Bài tập Java 11: Áp dụng switch case
        Viết chương trình khung tìm kiếm: cho người dùng nhập vào lựa chọn
        1. tìm theo tên
        2. tìm theo tác giả
        3. tìm theo nhà xuat ban
        4. tim theo tieu de
        Thoat neu phim bam khong hop le
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi bam phim de chon: ");
        System.out.println("Bam 1: Tim theo ten ");
        System.out.println("Bam 2: Tim theo tac gia ");
        System.out.println("Bam 3: Tim theo nha xuat ban ");
        System.out.println("Bam 4: Tim theo tieu de ");
        int so = sc.nextInt();
        switch (so) {
            case 1:
                System.out.println("Tim theo ten");
                break;
            case 2:
                System.out.println("Tim theo tac gia");
                break;
            case 3:
                System.out.println("Tim theo nha xuat ban");
                break;
            case 4:
                System.out.println("Tim theo tieu de");
                break;
            default:
                System.out.println("Phim bam khong hop le");
        }
    }
}
