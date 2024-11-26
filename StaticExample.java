public class StaticExample {
    static int staticVariable = 10;
    int nonStaticVariable = 20;

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void nonStaticMethod() {
        System.out.println("Non-Static Method");
    }

    public static void main(String[] args) {
        // Accessing static variable and method
        System.out.println("Static Variable: " + staticVariable);
        staticMethod();

        // Accessing non-static variable and method requires object creation
        StaticExample obj = new StaticExample();
        System.out.println("Non-Static Variable: " + obj.nonStaticVariable);
        obj.nonStaticMethod();
    }
}