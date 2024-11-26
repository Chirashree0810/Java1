// Grandparent class (Animal)
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

// Parent class (Mammal) extends Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("Walking");
    }
}

// Child class (Dog) extends Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking");
    }
}

public class C42
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}