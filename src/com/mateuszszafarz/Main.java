package com.mateuszszafarz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // TODO: 2018-01-08 implement sub menus to handle both linked list and BST

        boolean quit = false;
        printMenu();

        CustomLinkedList list = new CustomLinkedList();
        BinarySearchTree bst = new BinarySearchTree();
        while (!quit) {
            int action;
            try {
                action = scanner.nextInt();
            } catch (InputMismatchException exc) {
                scanner.nextLine();
                System.out.println("Please enter valid option from menu");
                continue;
            }
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printMenu();
                    break;
                case 2:
//                    list.printList();
                    bst.traverse();
                    break;
                case 3:
                    System.out.println("Enter item to add:");
                    String valueToAdd = scanner.nextLine().trim();
//                    list.addItem(new Node(valueToAdd));
                    bst.addItem(new Node(valueToAdd));
                    break;
                case 4:
                    System.out.println("Enter item to remove:");
                    String valueToRemove = scanner.nextLine().trim();
//                    list.removeItem(new Node(valueToRemove));
                    bst.removeItem(new Node(valueToRemove));
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Press:\n" +
                "\t0 = to quit\n" +
                "\t1 - to print this menu\n" +
                "\t2 - to print collection\n" +
                "\t3 - to add to collection\n" +
                "\t4 - to remove from collection\n");
    }
}
