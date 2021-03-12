package datastructures.tree.bst;

import datastructures.tree.bst.bstnode.BSTNode;

public class BinarySearchTree {
    private BSTNode root;

    public BSTNode getRoot() {
        return root;
    }

    public void insert(int data) {
        BSTNode bstNode = new BSTNode(data);
        if (root == null) {
            root = bstNode;
        }
        else {
            BSTNode iteration = root;
            BSTNode nodeWhereInsertionIsToBeDone = null;
            while (iteration != null) {
                nodeWhereInsertionIsToBeDone = iteration;
                if (bstNode.getData() <= iteration.getData()) {
                    iteration = iteration.getLeft();
                } else {
                    iteration = iteration.getRight();
                }
            }
            if (bstNode.getData() <= nodeWhereInsertionIsToBeDone.getData()) {
                nodeWhereInsertionIsToBeDone.setLeft(bstNode);
            } else {
                nodeWhereInsertionIsToBeDone.setRight(bstNode);
            }
        }
    }

    public void traversePreOrder(BSTNode node) {
        if (node == null) {

        } else {
            System.out.print(node.getData() + ",");
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    public void traverseInOrder(BSTNode node) {
        if (node == null) {
        } else {
            traverseInOrder(node.getLeft());
            System.out.print(node.getData() + ",");
            traverseInOrder(node.getRight());
        }
    }
}
