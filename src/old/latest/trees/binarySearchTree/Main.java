package old.latest.trees.binarySearchTree;

import java.lang.reflect.Type;

public class Main {
    public enum TYPE {
        DIRECTED, UNDIRECTED, NONDIRECTED
    }
    public static void main(String[] args){
        int[] arr = {12,25,37,50,62,75,87};
        BST tree = new BST(arr);
//        tree.levelOrder();
//        tree.add(70);
//        tree.add(90);
//        tree.remove(87);

//        tree.printRange(22,72);
        System.out.println(tree.leastCommonAncestor(62,12));
        TYPE type = TYPE.DIRECTED;
        TYPE type2 = TYPE.DIRECTED;
        TYPE type3 = TYPE.DIRECTED;

        String s = "UNDIRECTED";
        System.out.println(s.hashCode());
        int t = type.hashCode();
        int t2 = type2.hashCode();
        int t3 = type3.hashCode();

        System.out.println(t);
        System.out.println(t2);
        System.out.println(t3);

    }

}
