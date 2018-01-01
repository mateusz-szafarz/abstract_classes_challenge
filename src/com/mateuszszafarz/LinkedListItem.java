package com.mateuszszafarz;


public abstract class LinkedListItem implements Comparable<LinkedListItem> {
    protected LinkedListItem previous;
    protected LinkedListItem next;
    protected String value;

    public LinkedListItem(String value) {
        this.value = value;
    }

    public abstract LinkedListItem getPrevious();

    public abstract LinkedListItem getNext();

    public abstract String getValue();

    public abstract void setPrevious(LinkedListItem previous);

    public abstract void setNext(LinkedListItem next);

    public abstract void setValue(String value);

    @Override
    public int compareTo(LinkedListItem anotherItem) {
        return this.value.compareTo(anotherItem.getValue());
    }
}
