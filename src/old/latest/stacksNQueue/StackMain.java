package old.latest.stacksNQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);


        queue.display();
        System.out.println(queue.remove());

        queue.insert(4);
        queue.insert(0);


        queue.display();
        System.out.println(queue.remove());

        queue.display();
        System.out.println(queue.front());



    }
}
