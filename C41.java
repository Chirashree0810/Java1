// Parent class
class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Parent interface 1
interface Engine {
    void startEngine();
}

// Parent interface 2
interface Transmission {
    void shiftGear();
}

// Child class inheriting parent class and interfaces
class Car extends Vehicle implements Engine, Transmission {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void shiftGear() {
        System.out.println("Gear shifted");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }
}

public class C41 {
    public static void main(String[] args) {
        Car car = new Car("Toyota");

        car.displayBrand(); // Output: Brand: Toyota
        car.startEngine();  // Output: Engine started
        car.shiftGear();    // Output: Gear shifted
        car.accelerate();   // Output: Accelerating
    }
}
