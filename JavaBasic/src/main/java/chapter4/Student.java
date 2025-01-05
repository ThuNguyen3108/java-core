package chapter4;

public class Student {
    // class attributes
    private String name;
    private int age;
    String fullName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

//    int getAge() {
//        return 25;
//    }

//    public String getName() {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//        return this.name;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setName(String name1) {
//        this.name = name1;
//    }
//
//    public void setAge(int age1) {
//        this.age = age1;
//    }

/*
1 - khai báo biến private
2 - dùng get, set
* */

}
