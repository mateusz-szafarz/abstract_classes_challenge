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
            currentItem = currentItem.getNext();
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
                        insertedItem.setNext(currentItem).setPrevious(insertedItem);
                        break;
                    } else {
                        Item previousItem = currentItem.getPrevious();
                        previousItem.setNext(insertedItem).setPrevious(previousItem);
                        currentItem.setPrevious(insertedItem).setNext(currentItem);
                        break;
                    }
                } else if (currentItem.getNext() == null) {
                    currentItem.setNext(insertedItem).setPrevious(currentItem);
                    break;
                }
                currentItem = currentItem.getNext();
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
                    if (this.head.getNext() != null) {
                        this.head = this.head.getNext();
                        this.head.setPrevious(null);
                    } else {
                        this.head = null;
                    }
                    return true;
                }
                Item previous = currentItem.getPrevious();
                Item next = currentItem.getNext();
                if (next != null) {
                    previous.setNext(next);
                    next.setPrevious(previous);
                } else {
                    previous.setNext(null);
                }
                return true;
            } else if (currentItem.getNext() == null) {
                System.out.println("item: " + removedItem.getValue() + " not found inside list");
                return false;
            }
            currentItem = currentItem.getNext();
        }
    }
}
