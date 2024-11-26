public class OuterClass {
    private int outerVariable = 10;

    public class InnerClass {
        private int innerVariable = 20;

        public void displayVariables() {
            System.out.println("Outer Variable: " + outerVariable);
            System.out.println("Inner Variable: " + innerVariable);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.displayVariables();
    }
}