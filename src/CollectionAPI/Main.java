package CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Collection API  - Concept");
        System.out.println("Collection      - Interface");
        System.out.println("Collections     - Class");

        System.out.println("\nArray List");
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(6);
        nums.add(4);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(2));
    }
}
