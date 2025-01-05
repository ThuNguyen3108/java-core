package chapter4;

public class Video25 {
    int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        // tao 1 doi tuong cu the tu class 25 nay no khác hôm trước, viết ở đâu cũng được
        Video25 test = new Video25();
        int a = test.sum(6,9);
        System.out.println("check sum = " + a);
    }
}
