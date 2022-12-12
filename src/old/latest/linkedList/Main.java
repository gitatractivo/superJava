package old.latest.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
//        list.display();

         list.insertRec(2,9);
        list.display();
        List<Integer> l = new LinkedList<>();


    }
}
