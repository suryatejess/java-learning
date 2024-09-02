// final keyword

package FinalKeyword;

public class FinalKeyword {
    public static void main(String[] args) {
        System.out.println("final can be used with variable, method, class\n");


        System.out.println("variable");
        int num = 9;
        num = 8;
        System.out.println("'num' is non final " + num + ". hence, it can be modified.");

        final int finalNum = 10;
        // finalNum = 9;
        System.out.println("'finalNum is final' " + finalNum + ". hence, it cannot be modified.");
        System.out.println("It is a good practice to use final keyword when necessary.");


        System.out.println("\nClass");
        System.out.println("You can stop the inheritance when you use final keyword with class");

        System.out.println("\nMethod");
        System.out.println("You can stop overriding when you use final keyword with method");
    }
}
