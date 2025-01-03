package baithieunhi;

import java.util.Scanner;

public class bai42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0;
        for(int num : arr ) {
            if (num > 0) {
                positiveCount++;
            }
        }

        System.out.println(positiveCount);
    }
}
