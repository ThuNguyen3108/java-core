package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bai28_7giaibt32 {
    public static void main(String[] args) {
        /*
        Cho list lst = {1, 9, 3, 14, 5, 27, 8}
        Viết chương trình in số lớn thứ 2 và số nhỏ thứ 2 trong list
        #2: In ra vị trí index số đó
        Đáp án:
        Số lớn thứ 2: 14, vị trí index trong list là 3
        Số nhỏ thứ 2: 3, vị trí index trong list là 2
        */

        ArrayList<Integer> lst = new ArrayList<>(List.of(1, 9, 3, 14, 5, 27, 8));

        // Tạo một list mới với giá trị giống lst
        ArrayList<Integer> copy = new ArrayList<>(lst);
        System.out.println("Mang sau khi copy la: " + copy);

        // Sắp xếp list copy
        Collections.sort(copy);
        System.out.println("copy sau sx la: " + copy);
        // in ra so lon thu 2 va so nho thu 2 trong list
        int soLonThu2 = copy.get(copy.size()-2);
        int soNhoThu2 = copy.get(1);
        System.out.println("So lon thu 2: " + soLonThu2);
        System.out.println("So nho thu 2: " + soNhoThu2);
        System.out.println("Vi tri index cua so lon thu 2: " + lst.indexOf(soLonThu2));
        System.out.println("Vi tri index cua so nho thu 2: " + lst.indexOf(soNhoThu2));
    }
}
