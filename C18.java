import java.util.Scanner;

public class C18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double c = scanner.nextDouble();

        double f = (c * 9 / 5) + 32;
        
        System.out.println(c + "°C = " + f + "°F");
    }
}
