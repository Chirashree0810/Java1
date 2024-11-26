public class Calculator {
    // Method overloading examples

    // Add two integers
    public int calculate(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    // Add two floating-point numbers
    public double calculate(double a, double b) {
        return a + b;
    }

    // Multiply two integers
    public int calculate(int a, int b, String operation) {
        if (operation.equals("multiply")) {
            return a * b;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(2, 3)); // Output: 5
        System.out.println(calculator.calculate(2, 3, 4)); // Output: 9
        System.out.println(calculator.calculate(2.5, 3.7)); // Output: 6.2
        System.out.println(calculator.calculate(2, 3, "multiply")); // Output: 6
    }
}