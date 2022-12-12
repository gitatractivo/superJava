package old.latest.trees.binaryTree;

public class BTree<T> {
    private class Node<T>{
        private final T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> left, Node<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return data + "";
        }
    }
}
