package Iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(5);
        nums.add(9);
        nums.add(4);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
