package chapter5;

import java.util.ArrayList;

public class Video33 {
    public static void main(String[] args) {
        int a = 10;
        ArrayList<String> a1 = new ArrayList<String>(); // generic
        // ArrayList lam viec voi kieu khong nguyen thuy
//        a1.add(2); // interger => Interger (ko nguyen thuy, do developer define ra)
        a1.add("Hoi Dan IT1");
        a1.add("Hoi Dan IT2");
        a1.add("Hoi Dan IT3");
        System.out.println(a1.toString() + " " + a1.get(1));
    }
}
