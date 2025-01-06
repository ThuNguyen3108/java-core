package chapter7;
// study abstract
class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }
}

class BabyDog1 extends Dog {
    // BabyDog1 kế thừa từ Dog
}

public class Video47 {
    public static void main(String[] args) {
        System.out.println("  Run video 47");
        Animal a = new BabyDog1(); // Sử dụng đa hình
        a.eat(); // Gọi phương thức eat() tương ứng
    }
}
