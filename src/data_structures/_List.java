package data_structures;

import java.util.ArrayList;
import java.util.List;

public class _List {
    private static final String REPE = "repe";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);

        // insertion
        for (int i = 0; i < 10; i++) {
            list.add("elem_" + i);
        }

        // repetition
        System.out.println("list size before we enter duplicate elements: " + list.size());
        list.add(REPE);
        list.add(REPE);
        list.add(3, REPE);
        System.out.println("list size after we enter duplicate elements: " + list.size());

        // insertion by index
        list.add(3, "added");
        list.set(8, "replaced");

        // null
        System.out.println("list size before we enter null elements: " + list.size());
        list.add(10, null);
        System.out.println("list size after we enter null elements: " + list.size());

        // running by position
        int size = list.size();
        System.out.println("list size: " + size);
        for (int i = 0; i < size; i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }

        // running by iterator
        for (String element : list) {
            System.out.println("element: " + element);
        }

        // checks
        boolean contains = list.contains(REPE);
        int first = list.indexOf(REPE);
        int last = list.lastIndexOf(REPE);
        if (contains) {
            System.out.println("list contains " + REPE + " at position " + first + " and " + last);
        } else {
            System.out.println("list does not contain " + REPE);
        }

        // delete
        System.out.println("*** delete ***");
        System.out.println("original list size: " + list.size());
        for (int i = 0; i < list.size(); i += 3) {
            System.out.println("delete " + list.get(i) + " at position " + i);
            String deleted = list.remove(i);
            System.out.println("[" + deleted + "]");
        }
        System.out.println("new list size: " + list.size());
    }
}
