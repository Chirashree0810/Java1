// Define a class (Object)
class Student1 {
    String name;
    int age;

    // Constructor
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class C45 {
    public static void main(String[] args) {
        // Create objects
        Student1 student1 = new Student1("Chirashree", 18);
        Student1 student2 = new Student1("Pranusha", 19);

        // Access object attributes and methods
        System.out.println("Student 1 Information:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();
    }
}

