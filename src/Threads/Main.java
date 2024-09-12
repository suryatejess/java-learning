package Threads;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println("Observe in between. run multiple times if needed");

        obj1.start();
        obj2.start();

        System.out.println("Observe in between. run multiple times if needed");
    }
}
