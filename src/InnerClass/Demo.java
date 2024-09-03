package InnerClass;

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // B obj = new B();
        // B is not openly available
        A.B obj1 = obj.new B();
        obj1.config();

        // if the class is static, we can call it directly without outer class obj.
        A.C obj2 = new A.C();
        obj2.configC();
        // you cannot make an outer class as static. you can only make an inner class as static

    }
}
