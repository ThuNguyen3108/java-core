package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class bai29_java33 {
    public static void main(String[] args) {
        /* Viet chuong trinh su dung dict chua 10 username va password
        Chuong trinh yeu cau nhap vao username va pass
        1. Neu username khong co trong dict, chuong trinh bao user name khong ton tai
        2. Neu username dung ma password sai thi bao: PASSWORD SAI
        3. Neu username dung thi bao ban da login thanh cong
        * */
        // Tao mot HashMap chua cac thong tin username va password
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "123456");
        users.put("user2", "123456");
        users.put("user3", "123456");
        users.put("user4", "123456");
        users.put("user5", "123456");
        users.put("user6", "123456");
        users.put("user7", "123456");
        users.put("user8", "123456");
        users.put("user9", "123456");
        users.put("user10", "123456");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap user name: ");
        String userName = sc.nextLine();
        System.out.println("Nhap password: ");
        String pass = sc.nextLine();

        // kiem tra
        if (!users.containsKey(userName)) {
            System.out.println("User khong ton tai");
        }
        else if (!users.get(userName).equals(pass)) {
            System.out.println("Pass sai");
        }
        else
            System.out.println("Ban da dang nhap thanh cong");
    }
}
