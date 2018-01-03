package com.mateuszszafarz;

public class DefaultItem extends LinkedListItem {
    DefaultItem(String value) {
        super(value);
    }

    @Override
    public LinkedListItem getPrevious() {
        return previous;
    }

    @Override
    public LinkedListItem getNext() {
        return next;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public LinkedListItem setPrevious(LinkedListItem previous) {
        this.previous = previous;
        return this.previous;
    }

    @Override
    public LinkedListItem setNext(LinkedListItem next) {
        this.next = next;
        return this.next;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
