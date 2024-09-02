package MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {

        // creating object named obj
        Calc obj1 = new Calc();
        int r1 = obj1.add(4, 5);

        System.out.println("\n");
        System.out.println(r1);


        // Method Overloading here
        Calc obj2 = new Calc();
        int r2 = obj2.add(4, 5, 6);
        System.out.println(r2);
    }
}
