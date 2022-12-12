package two.oops.avl;

public class Main {
    public static void main(String[] args) {
        Avl tree = new Avl();
        tree.insert(25);
        tree.insert(20);
        tree.insert(30);
        tree.insert(27);
        tree.insert(35);
        tree.display();
        System.out.println();
        System.out.println();
        System.out.println();
        tree.insert(26);
        tree.insert(40);
        tree.insert(33);
        tree.insert(34);
        tree.insert(42);
        tree.insert(28);




        tree.display();
        tree.delete(33);
        System.out.println();
        System.out.println();
        System.out.println();
        tree.display();
//
//        System.out.println(tree.height());

    }
}
