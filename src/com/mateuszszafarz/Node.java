package com.mateuszszafarz;

public class Node extends Item {
    Node(String value) {
        super(value);
    }

    @Override
    public Item getLeft() {
        return left;
    }

    @Override
    public Item getRight() {
        return right;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Item setLeft(Item left) {
        this.left = left;
        return this.left;
    }

    @Override
    public Item setRight(Item right) {
        this.right = right;
        return this.right;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
