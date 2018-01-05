package com.mateuszszafarz;


public abstract class Item implements Comparable<Item> {
    Item previous;
    Item next;
    String value;

    Item(String value) {
        this.value = value;
    }

    public abstract Item getPrevious();

    public abstract Item getNext();

    public abstract String getValue();

    public abstract Item setPrevious(Item previous);

    public abstract Item setNext(Item next);

    public abstract void setValue(String value);

    @Override
    public int compareTo(Item anotherItem) {
        return this.value.compareTo(anotherItem.getValue());
    }
}
