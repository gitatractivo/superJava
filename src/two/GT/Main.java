package two.GT;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        GT tree = new GT();
//        System.out.println(tree.height());
//        System.out.println(tree.size());
        tree.add(arr);
//        tree.display();
//        System.out.println();
//        System.out.println();
//        System.out.println();


//        tree.removeLeaf();
//        tree.display();
        tree.linearise();


//        System.out.println(tree.size());
//        System.out.println(tree.height());
//        System.out.println(tree.max());
//        tree.levelOrderLinewise();
//        tree.levelOrderLinewiseZZ();
//        for (int val: tree) {
//            System.out.println(val);
//        }
//        String.valueOf();
//        Iterator<Integer> it = tree.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }





    }
}
