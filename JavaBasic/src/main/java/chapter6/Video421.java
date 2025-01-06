package chapter6;

public class Video421 {
    public static void main(String[] args) {
        System.out.println("Run video 421");
        SinhVienIT st1 = new SinhVienIT("java", "123", "Sherry", 10, 0.1);
//        st1.getMoney();
        System.out.println("st 1 check = " + st1.id);

        SinhVienCoKhi st2 = new SinhVienCoKhi("machine", "123", "Sherry", 10, 0.1);
        System.out.println("st 2 check = " + st2.name);
    }
}
