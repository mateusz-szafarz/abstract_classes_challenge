package com.mateuszszafarz;

public class CustomLinkedList {
    LinkedListItem head;

    public void printList() {
        if (this.head == null) {
            System.out.println("List is empty\n");
            return;
        }
        LinkedListItem currentItem = this.head;
        while(true) {
            System.out.println(currentItem.getValue());
            currentItem = currentItem.getNext();
            if (currentItem == null) {
                break;
            }
        }
        System.out.println();
    }

    public void addItem(LinkedListItem insertedItem) {
        if (this.head == null) {
            this.head = insertedItem;
        } else {
            LinkedListItem currentItem = head;
            while (true) {
                if (insertedItem.compareTo(currentItem) < 0) {
                    if (currentItem.compareTo(head) == 0) {
                        this.head = insertedItem;
                        String a = insertedItem.value;
                        insertedItem.setNext(currentItem);
                        currentItem.setPrevious(insertedItem);
                        break;
                    } else {
                        LinkedListItem previousItem = currentItem.getPrevious();
                        previousItem.setNext(insertedItem);
                        insertedItem.setPrevious(previousItem);
                        currentItem.setPrevious(insertedItem);
                        insertedItem.setNext(currentItem);
                        break;
                    }
                } else if (currentItem.getNext() == null) {
                    currentItem.setNext(insertedItem);
                    insertedItem.setPrevious(currentItem);
                    break;
                }
                currentItem = currentItem.getNext();
            }
        }
    }

    public boolean removeItem(LinkedListItem removedItem) {
        if (this.head == null) {
            System.out.println("list is empty");
            return false;
        }
        LinkedListItem currentItem = this.head;
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
                LinkedListItem previous = currentItem.getPrevious();
                LinkedListItem next = currentItem.getNext();
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
