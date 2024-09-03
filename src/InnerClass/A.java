package InnerClass;

public class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }

    static class C {
        public void configC() {
            System.out.println("in config C");
        }
    }
}
