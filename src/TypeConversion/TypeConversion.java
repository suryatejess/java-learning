package TypeConversion;

public class TypeConversion {
    public static void main(String[] args) {

        byte a = 50;
        int b = a + 1;

        int c = 100;
        // byte d = c;
        // this wont work because int is larger than byte
        byte d = (byte) c ;
        // this will work because we are explicitly converting int to byte


        System.out.println("\nint value: " + a);
        System.out.println("byte value: " + b);

        System.out.println("\nbyte value: " + c);
        System.out.println("int value: " + d);
    }
}