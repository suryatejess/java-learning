package AbstractAndAnonymousInnerClass;

public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("\nWe cannot create an object of Abstract class. But this 'obj' is part of the anonymous inner class. not the abstract class 'A'");
            }
        };

        obj.show();
    }
}
