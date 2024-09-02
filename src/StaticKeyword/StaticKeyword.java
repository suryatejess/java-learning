package StaticKeyword;

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() { // instance method
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1() {
        System.out.println("in static method");
    }

    public static void show2(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println("Static variable is common to every object created within that class. When you change it with 1 object, it changes across every other object\nUsually they are addressed with the class name. But they can also be addressed with the object name\nThey belong to the class and not to the object");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "CellPhone";

        obj1.show();
        obj2.show();

        Mobile.show1(); // you can call static method with class i.e. without creating an object.
        System.out.println("You can use a static variable inside a static method. But you cannot use a non static variable inside a static method");
        System.out.println("You need to have object reference to do that");

        Mobile.show2(obj2);
    }
}
