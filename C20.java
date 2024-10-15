public class C20 {
    public static void main(String[] args) {
        String prefix = "4MW23CS";
        int start = 1;
        int end = 65;

        for (int i = start; i <= end; i++) {
            System.out.println(prefix + String.format("%03d", i));
        }
    }
}
