package chapter4;

public class Video30 {
    public static void main(String[] args) {
//        System.out.println("run video 30");
        Product test = new Product();
        // tao ban sao cua product

        Product pr1 = test.nhapThongTin("computer", 200, 10);
        test.xuatThongTin(pr1);
        System.out.println(" tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
    }
}
