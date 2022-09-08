package dev.andrewjfei.datastructures.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        // Singly Linked List
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();

        System.out.println("Initial singly linked list: " + singlyLinkedList);

        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);

        System.out.println("Added singly linked list: " + singlyLinkedList);
        System.out.println("Added singly linked list size: " + singlyLinkedList.size());
        System.out.println("Does singly linked list contain 3: " + singlyLinkedList.contains(3));
        System.out.println("Does singly linked list contain 6: " + singlyLinkedList.contains(6));

        singlyLinkedList.insert(0, 0);
        singlyLinkedList.insert(2, 22);

        System.out.println("Inserted singly linked list: " + singlyLinkedList);
        System.out.println("Inserted singly linked list size: " + singlyLinkedList.size());

        singlyLinkedList.insert(7, 10);

        singlyLinkedList.remove(22);

        System.out.println("Deleted singly linked list: " + singlyLinkedList);
        System.out.println("Deleted singly linked list size: " + singlyLinkedList.size());

        singlyLinkedList.remove(12);
    }
}
