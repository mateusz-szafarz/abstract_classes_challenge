package com.mateuszszafarz;


public abstract class Item implements Comparable<Item> {
    protected Item left;
    protected Item right;
    protected String value;

    Item(String value) {
        this.value = value;
    }

    public abstract Item getLeft();

    public abstract Item getRight();

    public abstract String getValue();

    public abstract Item setLeft(Item left);

    public abstract Item setRight(Item right);

    public abstract void setValue(String value);

    @Override
    public int compareTo(Item anotherItem) {
        return this.value.compareTo(anotherItem.getValue());
    }
}
