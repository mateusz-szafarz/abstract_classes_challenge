package com.mateuszszafarz;

public class Node extends Item {
    Node(String value) {
        super(value);
    }

    @Override
    public Item getPrevious() {
        return previous;
    }

    @Override
    public Item getNext() {
        return next;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Item setPrevious(Item previous) {
        this.previous = previous;
        return this.previous;
    }

    @Override
    public Item setNext(Item next) {
        this.next = next;
        return this.next;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
