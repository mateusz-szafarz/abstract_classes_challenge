package com.mateuszszafarz;

public class CustomLinkedList {
    private Item head;

    public void printList() {
        if (this.head == null) {
            System.out.println("List is empty\n");
            return;
        }
        Item currentItem = this.head;
        while(currentItem != null) {
            System.out.println(currentItem.getValue());
            currentItem = currentItem.getRight();
        }
        System.out.println();
    }

    public void addItem(Item insertedItem) {
        if (this.head == null) {
            this.head = insertedItem;
        } else {
            Item currentItem = head;
            while (true) {
                if (insertedItem.compareTo(currentItem) < 0) {
                    if (currentItem.compareTo(head) == 0) {
                        this.head = insertedItem;
                        insertedItem.setRight(currentItem).setLeft(insertedItem);
                        break;
                    } else {
                        Item previousItem = currentItem.getLeft();
                        previousItem.setRight(insertedItem).setLeft(previousItem);
                        currentItem.setLeft(insertedItem).setRight(currentItem);
                        break;
                    }
                } else if (currentItem.getRight() == null) {
                    currentItem.setRight(insertedItem).setLeft(currentItem);
                    break;
                }
                currentItem = currentItem.getRight();
            }
        }
    }

    public boolean removeItem(Item removedItem) {
        if (this.head == null) {
            System.out.println("list is empty");
            return false;
        }
        Item currentItem = this.head;
        while (true) {
            if (currentItem.compareTo(removedItem) == 0) {
                if (removedItem.compareTo(this.head) == 0) {
                    if (this.head.getRight() != null) {
                        this.head = this.head.getRight();
                        this.head.setLeft(null);
                    } else {
                        this.head = null;
                    }
                    return true;
                }
                Item previous = currentItem.getLeft();
                Item next = currentItem.getRight();
                if (next != null) {
                    previous.setRight(next);
                    next.setLeft(previous);
                } else {
                    previous.setRight(null);
                }
                return true;
            } else if (currentItem.getRight() == null) {
                System.out.println("item: " + removedItem.getValue() + " not found inside list");
                return false;
            }
            currentItem = currentItem.getRight();
        }
    }
}
