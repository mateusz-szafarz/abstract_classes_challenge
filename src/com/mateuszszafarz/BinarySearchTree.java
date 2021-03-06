package com.mateuszszafarz;

public class BinarySearchTree {
    private Item root;

    public void addItem(Item insertedItem) {
        this.root = addItem(this.root, insertedItem);
    }

    private Item addItem(Item subRoot, Item insertedItem) {
//        if (this.root == null) {
//            this.root = insertedItem;
//            return this.root;
//        }

        if (subRoot == null) {
            return insertedItem;
        }

        int comparisonResult = insertedItem.compareTo(subRoot);

        if (comparisonResult == 0) {
            System.out.println("node with value '" + insertedItem.getValue() + "' already exists inside tree");
            return subRoot;
        }

        if (comparisonResult < 0) {
            subRoot.setLeft(addItem(subRoot.getLeft(), insertedItem));
            return subRoot;
        }

        subRoot.setRight(addItem(subRoot.getRight(), insertedItem));
        return subRoot;
    }

    public void removeItem(Item removedItem) {
        this.root = removeItem(this.root, removedItem);
    }

    private Item removeItem(Item subRoot, Item removedItem) {
        if (subRoot == null) {
            System.out.println("Item: '" + removedItem.getValue() + "' not found inside tree");
            return null;
        }

        int comparisonResult = removedItem.compareTo(subRoot);

        if (comparisonResult < 0) {
            subRoot.setLeft(removeItem(subRoot.getLeft(), removedItem));
            return subRoot;
        }

        if (comparisonResult > 0) {
            subRoot.setRight(removeItem(subRoot.getRight(), removedItem));
            return subRoot;
        }

        // removed item found

        if (subRoot.left == null && subRoot.right == null) { // removed item is a leaf
            return null;
        }

        if (subRoot.right == null) { // removed item has only left child
            return subRoot.left;
        }

        if (subRoot.left == null) { // removed item has only right child
            return subRoot.right;
        }

        // removed item has both children
        Item minItemInRightSubTree = findMin(subRoot.right);
        subRoot.setValue(minItemInRightSubTree.getValue());
        subRoot.setRight(removeItem(subRoot.getRight(), minItemInRightSubTree));
        return subRoot;
    }

    private Item findMin(Item subRoot) {
        if (subRoot.getLeft() != null) {
            return findMin(subRoot.getLeft());
        }

        return subRoot;
    }

    public void traverse() {
        traverse(this.root);
    }

    private void traverse(Item item) {
        if (item == null) {
            return;
        }

        traverse(item.left);
        System.out.println(item.getValue());
        traverse(item.right);
    }
}
