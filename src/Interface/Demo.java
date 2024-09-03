package Interface;

public class Demo {
    public static void main(String[] args) {
        System.out.println("its like a class. but all the methods are public abstract by default");
        System.out.println("it is similar to abstract class. but not quite the same");
        System.out.println("first of all interfaces are not classes like abstract classes");
        System.out.println("you can create a reference of interface");
        System.out.println("we create a class 'B' which implements the interface A");
        System.out.println("when we implement, we have to define all the methods in the interface\n");

        A obj = new B();
        obj.show();
        obj.config();
    }
}
