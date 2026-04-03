class Animals {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dogs extends Animals {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}