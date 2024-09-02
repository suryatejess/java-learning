
package LearningStringBuffer;


public class LearningStringBuffer {
    public static void main(String[] args) {

        System.out.println("A string buffer is like a String , but can be modified\n");

        StringBuffer sb = new StringBuffer();
        System.out.print("empty string buffer 'sb' capacity is ");
        System.out.println(sb.capacity());


        StringBuffer sb2 = new StringBuffer("Surya");
        System.out.println(sb2.capacity());
        System.out.println("For 'Surya' it is 21 and not 16. Because it is providing buffer for this sb2 to change");
        System.out.println("the length for Surya is as expected i.e. " + sb2.length());

        System.out.println("\nappend method");
        StringBuffer sb3 = new StringBuffer("Surya");
        sb3.append(" Tejess");
        System.out.println(sb3);

        System.out.println("\nthis is not 'String'. we need to convert it using 'toString()' method");
        String name = sb3.toString();
        System.out.println(name);

        System.out.println("\ndelete method");
        StringBuffer sb4 = new StringBuffer("Surya");
        sb4.deleteCharAt(0);
        System.out.println(sb4);


        System.out.println("\n\nRefer other methods at: ");
        System.out.println("https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html");
    }
}
