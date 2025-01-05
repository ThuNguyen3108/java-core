package chapter4;

public class Student {
    // class attributes
    String name;
    int age;
    String fullName;
    String firstName;

    public Student() {

    }

    public Student(String name1, int age1) {
        this.name = name1;
        // this.name gán giá trị đang sao chép ra, clone ra, this có nghĩa là tham chiếu. Học C có nghĩa là con trỏ
        // còn this này là ám chỉ cho class này
        this.age = age1;
    }

    // class method
    public void learnJava() {
        System.out.println("Learn Java");
    }

    int getAge() {
        return 25;
    }
}
