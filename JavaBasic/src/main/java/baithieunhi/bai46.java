package baithieunhi;

import java.util.Scanner;

public class bai46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap so phan tu
        int n = sc.nextInt();
        // nhap so can tim
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        for(int i = 0; i < n; i ++) {
            if(arr[i] == x) {
                System.out.println("Yes");
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("No");
        }
        sc.close();
    }
}
