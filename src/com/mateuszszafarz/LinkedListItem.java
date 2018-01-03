package com.mateuszszafarz;


public abstract class LinkedListItem implements Comparable<LinkedListItem> {
    LinkedListItem previous;
    LinkedListItem next;
    String value;

    LinkedListItem(String value) {
        this.value = value;
    }

    public abstract LinkedListItem getPrevious();

    public abstract LinkedListItem getNext();

    public abstract String getValue();

    public abstract LinkedListItem setPrevious(LinkedListItem previous);

    public abstract LinkedListItem setNext(LinkedListItem next);

    public abstract void setValue(String value);

    @Override
    public int compareTo(LinkedListItem anotherItem) {
        return this.value.compareTo(anotherItem.getValue());
    }
}
