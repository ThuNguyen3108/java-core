package org.example;

public class bai27_array {
    public static void main(String[] args) {
        // 1 Khai bao mang
        String[] mangStr;
        Float[] mangfl;
        Double[] mangdb;
        int[] mangNguyen;
        boolean[] mangBool;

        //2. Khoi tao mang kem theo kich thuoc
        String[] mangStr2 = new String[15];
        int[] mangNguyen2 = new int[7];

        //3. Khoi tao mang kem theo gia tri ban dau
        String[] mangStr3 = new String[]{"chí phéo", "thị nở", "ông giáo"};
        String[] mangStr4 = {"chí phéo", "thị nở", "ông giáo"};

        int[] mangNguyen3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        // truy xuat pt cua mang dua vao index
        System.out.println(mangNguyen3[3]);


        // 6. Duyte mang dung for
        // cach 1: Dung de xuat cac phan tu
        for (int pt : mangNguyen3) {
            System.out.println(pt);
        }
        System.out.println("---------------------------------");
        // cach 2: dung for duyet qua index
        // luu y: index mang tu 0 -> length - 1
        for (int i = 0; i < mangNguyen3.length; i++) {
            // in ra vi tri index
//            System.out.println(i);
            // in ra gia tri cua mang tai vi tri index i
            System.out.println(mangNguyen3[i]);
        }

        String[] mang6 = new String[]{"Chí phèo", "Thị nở", "Ông giáo"};
        for (int i = 0; i < mang6.length; i++) {
            System.out.println(mang6[i]);
        }

        // update toan bo danh sach
        int[] mang7 = new int[]{1,2,3,4,5,6,7};
        for (int i = 0; i < mang7.length; i++) {
            mang7[i] = mang7[i] + 5;
        }
        System.out.println("");
    }

}
