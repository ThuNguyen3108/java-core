package chapter4;

public class Video28 {
    public static void main(String[] args) {
        System.out.println("Run video 28");

        // qua trinh tao va su dung Object, tu cai truu tuong la class cua chung ta
        Student st1 = new Student("Anh Thu", 24);
        /* Khai bao 1 object va gán giá trị
         * */
        st1.setName("Eric new setName");
        System.out.println("Student with name = " + st1.getName() + " and age = " + st1.getAge());
    }
}
