package org.example;

public class bai20_xulyngoaile {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("c = " + c);
        }
        catch (ArithmeticException ex) {
            System.out.println("Co loi toan hoc");
            ex.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println("Co loi roi");
            ex.printStackTrace();
        }
        finally {
            System.out.println();
        }
        System.out.println("Doan code phia sau");

    }
}
