package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class bai27_vidu {
    public static void main(String[] args) {
        /* ví dụ mảng
        Viết chương trình tạo 1 mảng 1 chiều gồm các phần tử là số nguyên có n phần tử, n do người dùng nhập từ bàn phím
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so phan tu toi da cua mang: ");
        int n = sc.nextInt();
        // tao mang co n phan tu (cap phat bo nho cho mang)
        int[] M = new int[n];
        // nhap du lieu cho tung phan tu
        System.out.println("So phan tu cua mang " + M.length);
        for (int i = 0; i < n; i ++) {
            System.out.println("M[" + i + "] = ");
            M[i] = sc.nextInt();
        }
        System.out.println("Mang M duoc tao la : ");
        System.out.println(Arrays.toString(M));

        // sx tang dan
        int[] mang8 = {8,9,12,14,1};
        Arrays.sort(mang8);
        System.out.println("Mang sau sx tang la: ");
        System.out.println(Arrays.toString(mang8));

        // Mảng cần đảo ngược
        int[] mang9 = {8, 9, 12, 48, 1, 2, 3};

        // Đảo ngược mảng
        int i = 0, j = mang9.length - 1;
        while (i < j) {
            // Hoán đổi giá trị
            int temp = mang9[i];
            mang9[i] = mang9[j];
            mang9[j] = temp;

            // Di chuyển chỉ số
            i++;
            j--;
        }

        // In mảng sau khi đảo ngược
        for (int num : mang9) {
            System.out.print(num + " ");
        }

    }
}
