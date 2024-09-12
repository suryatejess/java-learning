package LambdaFunction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        A obj = () -> System.out.println("\nHI");
        obj.printing();
    }
}
