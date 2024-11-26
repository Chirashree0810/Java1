// Animal class (superclass)
class Animal1 {
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog class (subclass)
class Dog1 extends Animal1 {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Cat class (subclass)
class Cat extends Animal1 {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class C43 {
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.sound(); // Output: The animal makes a sound.

        Dog1 dog = new Dog1();
        dog.sound(); // Output: The dog barks.

        Cat cat = new Cat();
        cat.sound(); // Output: The cat meows
    }
}

