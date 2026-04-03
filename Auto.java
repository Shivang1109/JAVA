class Car {
    String brand;
    int cost;

    Car(String brand, int cost){
        this.brand = brand;
        this.cost = cost;
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + cost);
    }
}

public class Auto {
    public static void main(String[] args){

        Car c1 = new Car("BMW", 10000000);
        Car c2 = new Car("Mercedes", 20000000);

        c1.display();
        c2.display();
    }
}