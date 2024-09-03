package AnonymousInnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("\nnot in A show. but in the anonymous inner class show");
            }
        };

        obj.show();
    }
}
