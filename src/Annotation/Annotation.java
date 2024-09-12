package Annotation;

public class Annotation {
    public static void main(String[] args) {
        System.out.println("\nThe @Override is an example of annotation in java. They're not much used in core java. but very imp in frameworks.");
        System.out.println("Refer to class B");
        B obj = new B();
        obj.some_random_gibberish_method_name();
        System.out.println("There could've been a possibility I have typed function name wrong(say 'some_random_GIBBERISH_method_name').");
        System.out.println("in this case, my intention was to override the function in A. but by placing @Ovreride in the top line of before defining this in B, it will make sure if we are properly overriding it or not ");
    }
}
