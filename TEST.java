class Animal{

    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}
class Dog extends Animal{

    void bark(){
        System.out.println("Barking");
    }
}
public class TEST {
    public static void  main(String[] args){
        Dog d1=new Dog();
        d1.bark();
        d1.eat();
        d1.walk();
        Animal a1=new Animal();
    }
}