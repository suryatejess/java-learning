package WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("JAVA is not completely Object Oriented. They have 'int', 'double', etc which are primitive. types\nTo be Object Oriented, everything must be an Object. While the primitive types are not.");
        System.out.println("This is where wrapper class concept comes into picture. we have\nInteger for int\nCharacter for char\netc\n");

        System.out.println("normal way");
        int num = 7;
        System.out.println(num);

        System.out.println("boxing");
        Integer num1 = new Integer(8);
        System.out.println(num1);

        System.out.println("Autboxing");
        Integer num2 = 9;
        System.out.println(num2);

        System.out.println("unoboxing. because we getting from object type to primitive type");
        int num3 = num1.intValue();
        System.out.println(num3);

        System.out.println("autounboxing");
        int num4 = num1;
        System.out.println(num4);

        System.out.println("parseInt will take 'string' and then convert it into integer.");
        String str = "12";
        int num5 = Integer.parseInt(str);
        System.out.println(num5);
    }
}
