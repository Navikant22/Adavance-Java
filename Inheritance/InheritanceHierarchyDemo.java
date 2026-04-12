class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println(name + " is walking");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

public class InheritanceHierarchyDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Tommy";

        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // from Dog
    }
}
