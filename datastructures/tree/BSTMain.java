package datastructures.tree;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(100);
        binarySearchTree.insert(25);
        binarySearchTree.insert(30);
        binarySearchTree.insert(5);
        binarySearchTree.traversePreOrder(binarySearchTree.getRoot());
        System.out.println();
        binarySearchTree.traverseInOrder(binarySearchTree.getRoot());

    }

}
