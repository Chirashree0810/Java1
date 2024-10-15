public class C19 {
    public static void main(String[] args) {
        System.out.println("Data Type\tDefault Value\tMin Value\tMax Value");
        
        System.out.println("byte\t" + (byte)0 + "\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
        System.out.println("short\t" + (short)0 + "\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
        System.out.println("int\t" + (int)0 + "\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
        System.out.println("long\t" + (long)0 + "\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("float\t" + (float)0.0 + "\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
        System.out.println("double\t" + (double)0.0 + "\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
    }
}