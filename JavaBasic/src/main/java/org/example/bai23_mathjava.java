package org.example;

public class bai23_mathjava {
    public static void main(String[] args) {
        System.out.println("Pi = " + Math.PI);
        // tri tuyet doi
        int a = -8;
        System.out.println(Math.abs(a));
        // max, min
        System.out.println(Math.max(4,7));
        System.out.println(Math.min(4,7));
        // can bac 2
        System.out.println(Math.sqrt(4));
        // luy thua
        System.out.println(Math.pow(2,3));
        // sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("sin 90 = " + sin);
        System.out.println("cos 90 = " + cos);
        System.out.println("tan 90 = " + tan);
    }
}
