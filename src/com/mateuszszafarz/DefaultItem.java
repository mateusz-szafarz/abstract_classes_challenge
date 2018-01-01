package com.mateuszszafarz;

public class DefaultItem extends LinkedListItem {
    public DefaultItem(String value) {
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
    public void setPrevious(LinkedListItem previous) {
        this.previous = previous;
    }

    @Override
    public void setNext(LinkedListItem next) {
        this.next = next;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
