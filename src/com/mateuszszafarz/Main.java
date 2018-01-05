package com.mateuszszafarz;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        printMenu();

        CustomLinkedList list = new CustomLinkedList();
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printMenu();
                    break;
                case 2:
                    list.printList();
                    break;
                case 3:
                    System.out.println("Enter item to add:");
                    String valueToAdd = scanner.nextLine().trim();
                    list.addItem(new Node(valueToAdd));
                    break;
                case 4:
                    System.out.println("Enter item to remove:");
                    String valueToRemove = scanner.nextLine().trim();
                    list.removeItem(new Node(valueToRemove));
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Press:\n" +
                "\t0 = to quit\n" +
                "\t1 - to print this menu\n" +
                "\t2 - to print list\n" +
                "\t3 - to add to list\n" +
                "\t4 - to remove from list\n");
    }
}
