package AbstractKeyword;

public class AbstractKeyword {
    public static void main(String[] args) {
        System.out.println("\nyou need to list all the methods which you are going to use in the future in an abstract class.");
        System.out.println("you cannot create an object of abstract class. but you create a reference of it.");
        System.out.println("abstract class can contain both normal and abstract methods.");
        System.out.println("abstract classes should be extended. and extract methods must be defined in the child class");

        System.out.println();
        Car obj = new BMW();
        obj.drive();
    }
}
