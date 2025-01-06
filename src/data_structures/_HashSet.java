package data_structures;

import java.util.HashSet;
import java.util.Set;

public class _HashSet {
    private static final String REPE = "repe";

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(4);

        // insertion
        for (int i = 0; i < 10; i++) {
            set.add("elem_" + i);
        }

        // repetition
        System.out.println("set size before we enter duplicate elements: " + set.size());
        set.add(REPE);
        set.add(REPE);
        System.out.println("set size after we enter duplicate elements: " + set.size());

        // nulls
        System.out.println("set size before we enter null elements: " + set.size());
        set.add(null);
        System.out.println("set size after we enter null elements: " + set.size());

        // running
        System.out.println("set running");
        for (String string : set) {
            System.out.println("*" + string + "*");
        }

        // checks
        boolean contains = set.contains(REPE);
        if (contains) {
            System.out.println("set contains " + REPE);
        } else {
            System.out.println("set does not contain " + REPE);
        }

        // delete
        System.out.println("original set size: " + set.size());
        set.remove(REPE);
        System.out.println("set after removing " + REPE + ": " + set.size());
    }
}
