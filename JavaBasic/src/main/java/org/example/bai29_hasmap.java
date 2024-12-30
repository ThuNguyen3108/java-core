package org.example;

import java.util.HashMap;

public class bai29_hasmap {
    public static void main(String[] args) {
        //1 khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map2 = new HashMap<>();

        //2. them phan tu vao hashmap
        map.put(1, "apple");
        map.put(2, "apple");
        map.put(3, "cheery");
        System.out.println(map);

        //3. lay gia tri cua 1 phan tu
        String value = map.get(1);
        String value2 = map.get(2);
        String value3 = map.get(3);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

        // xoa phan tu khoi hashmap
        map.remove(2);
        System.out.println(map.get(2));

        //5 kiem tra xem mot phan tu co ton tai trong map hay khong
        boolean check = map.containsKey(3);
        System.out.println(check);

        //6 kiem tra xem gia tri co ton tai trong map hay khong
        boolean checkVl = map.containsValue("cheery");
        System.out.println(checkVl);

        //7 kiem tra xem hashmap co rong hay khong
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);

        //8 lay so luong phan tu trong hashmap
        int soLuong = map.size();
        System.out.println(soLuong);

        //9 Duyet Hashmap
        for (Integer key:map.keySet()) {
            String vl = map.get(key);
            System.out.println(key + ": " + vl);
        }
    }
}
