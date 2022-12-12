package old.latest.trees.binaryTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        BT bt = new BT(arr);
//        bt.display();
//        System.out.println(bt.max());
//        System.out.println(bt.height());
//        System.out.println(bt.sum());
//        System.out.println(bt.size());
//        bt.traversals();
//        bt.levelOrder();
//        bt.iterativeTraversal();
        bt.path(70);
//        bt.reverse();
//        bt.levelOrder();
//        bt.kdown(2);
//        bt.kdownfar(25,1);
//        System.out.println();
//        bt.kdownfar(25,2);


//        bt.display();
    }

}
