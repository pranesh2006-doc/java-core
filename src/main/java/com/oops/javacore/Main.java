package com.oops.javacore;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // 1. add() - Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("add: " + list);

        // 2. add(index, element) - Insert at index
        list.add(1, 15);
        System.out.println("add(index): " + list);

        // 3. get() - Get element by index
        System.out.println("get: " + list.get(2));

        // 4. set() - Update element
        list.set(1, 25);
        System.out.println("set: " + list);

        // 5. remove(index) - Remove by index
        list.remove(0);
        System.out.println("remove(index): " + list);

        // 6. remove(object) - Remove a particular value
        list.remove(Integer.valueOf(30));
        System.out.println("remove(value): " + list);

        // 7. size() - Number of elements
        System.out.println("size: " + list.size());

        // 8. contains() - Check an element
        System.out.println("contains 20: " + list.contains(20));

        // 9. indexOf() - First index of a value
        System.out.println("indexOf 25: " + list.indexOf(25));

        // 10. isEmpty() - Check whether empty
        System.out.println("isEmpty: " + list.isEmpty());

        // 11. Add more elements
        list.add(40);
        list.add(50);

        // 12. Loop through the list
        System.out.print("Elements: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 13. clear() - Remove all elements
        list.clear();
        System.out.println("clear: " + list);
        System.out.println("isEmpty after clear: " + list.isEmpty());
    }
}