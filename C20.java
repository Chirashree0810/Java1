import java.util.Scanner;

public class C20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USN (without hyphens): ");
        String usn = scanner.next();

        if (usn.length() == 10) {
            System.out.println("USN with hyphens: ");
            for (int i = 0; i < usn.length(); i++) {
                System.out.print(usn.charAt(i));
                if (i == 2 || i == 5) {
                    System.out.print("-");
                }
            }
        } else {
            System.out.println("Invalid USN length. Please enter 10 characters.");
        }
    }
}