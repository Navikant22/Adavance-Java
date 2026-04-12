abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Normal method
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class VehicleAbstractDemo {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();
        v.display();

        v = new Bike();
        v.start();
        v.display();
    }
}
