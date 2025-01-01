package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai28_5giaibt30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // list de bai cho
        ArrayList<String> quest = new ArrayList<>(List.of(
               "2 + 5 + 7 = ",
               "5 * 10 = ",
               "sqrt(16) = ",
               "12%2 = "
        ));

        // List dap an
        ArrayList<Float> traLoi = new ArrayList<>(List.of(14f ,50f ,4f,0f));

        // duyet list cau hoi
        for (int i = 0; i < quest.size(); i++) {
            System.out.println(quest.get(i));
            // nhap ket qua
            System.out.println("Nhap ket qua: ");
            Float kq = sc.nextFloat();
            // ktra voi dap an
            if (kq.equals(traLoi.get(i)))
                System.out.println("Dung");
            else
                System.out.println("Sai");
        }
    }
}
