package com.oops.javacore;
import java.util.LinkedList;

public class Main6{
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. add() - Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("add: " + list);

        // 2. addFirst() - Add at beginning
        list.addFirst(5);
        System.out.println("addFirst: " + list);

        // 3. addLast() - Add at end
        list.addLast(40);
        System.out.println("addLast: " + list);

        // 4. get() - Get by index
        System.out.println("get: " + list.get(2));

        // 5. getFirst() - Get first element
        System.out.println("getFirst: " + list.getFirst());

        // 6. getLast() - Get last element
        System.out.println("getLast: " + list.getLast());

        // 7. set() - Update an element
        list.set(1, 15);
        System.out.println("set: " + list);

        // 8. remove(index) - Remove by index
        list.remove(2);
        System.out.println("remove(index): " + list);

        // 9. removeFirst() - Remove first element
        list.removeFirst();
        System.out.println("removeFirst: " + list);

        // 10. removeLast() - Remove last element
        list.removeLast();
        System.out.println("removeLast: " + list);

        // 11. contains() - Check a value
        System.out.println("contains 20: " + list.contains(20));

        // 12. size() - Count elements
        System.out.println("size: " + list.size());

        // 13. offer() - Add as a queue
        list.offer(50);
        System.out.println("offer: " + list);

        // 14. peek() - View first element
        System.out.println("peek: " + list.peek());

        // 15. poll() - Retrieve and remove first element
        System.out.println("poll: " + list.poll());
        System.out.println("after poll: " + list);

        // 16. push() - Add at the beginning as a stack
        list.push(100);
        System.out.println("push: " + list);

        // 17. pop() - Remove and return first element
        System.out.println("pop: " + list.pop());
        System.out.println("after pop: " + list);

        // 18. isEmpty() - Check empty
        System.out.println("isEmpty: " + list.isEmpty());

        // 19. clear() - Remove everything
        list.clear();
        System.out.println("clear: " + list);
    }
}