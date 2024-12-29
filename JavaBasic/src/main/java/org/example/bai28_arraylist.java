package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai28_arraylist {
    public static void main(String[] args) {
        //1. khai bao list
        ArrayList<Integer> lst = new ArrayList<>();
        //2. Khai bao voi so luong phan tu ban dau
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        //3. Khoi tao list voi cac phan tu ban dau
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));

        // xuat list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        // 2. add them phan tu
        ArrayList<Integer> lst4 = new ArrayList<>();
        // add pt
        lst4.add(7);
        lst4.add(8);
        lst4.add(10);
        System.out.println("lst4 moi add la: ");
        System.out.println(lst4);

        // add(index, element) vao vi tri chi dinh
        lst4.add(1, 99);
        System.out.println("lst4 moi add 99 la: ");
        System.out.println(lst4);

        //2.2 size: Tra ve so phan tu cua list
        System.out.println("So phan tu list 4 la: " + lst4.size());

        //2.3 get (int index): tra ve gia tri list tai vi tri index
        System.out.println(lst4.get(3));

        //2.4 remove (index)
        lst4.remove(2);
        System.out.println("lst4 sau xoa vi tri index 2 la: ");
        System.out.println(lst4);

        //2.5 remove (1 phan tu duoc chi dinh)
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst5 = " + lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println("lst 5 sau xóa: " + lst5);

        //2.6 set(index, element): thay doi thong tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst6 = " + lst6);
        lst6.set(2,99);
        System.out.println("lst6 sau doi la: " + lst6);
    }
}
